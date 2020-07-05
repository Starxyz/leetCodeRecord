![20200603232411](https://raw.githubusercontent.com/Starxyz/picGo/master/picGo/20200603232411.png)

令 dp[x] 表示从得分为 x 的情况开始游戏并且获胜的概率，目标是求 dp[0] 的值。
$$
d p[x]=\frac{d p[x+1]+d p[x+2]+\cdots+d p[x+W]}{W}
$$

$$
d p[0]=\frac{d p[1]+d p[2]+\cdots+d p[W]}{W}
$$
K是临界点，当得分为K的时候停止抽牌， 假设现在的得分是 K-1，那么以示例来说明：
![20200603234716](https://raw.githubusercontent.com/Starxyz/picGo/master/picGo/20200603234716.png)

前五个1代表再抽一张牌（这张牌的点数属于[1,W]），得分为17、18、19、20、21时，他们均小于等于21， 0代表大于21。
以此类推，我们从dp[16]开始推导， 直到计算dp[0]的概率
第一版代码：
```py
class Solution:
    def new21Game(self, N: int, K: int, W: int) -> float:
        dp = [0.0] * (K+W)
        for i in range(K, N+1):
            dp[i] = 1.

        for j in range(K-1, -1, -1):
            temp = 0
            for x in range(j, j+W+1):
                temp += dp[x]
            dp[j] = temp / float(W)

        return dp[0]
```
但是这个代码无法处理以下特例：N=1，K=0，W=1
因为此时```len(dp) = 1; for循环里面dp[1]越界了```
实际上，k=0意味着不能再抽牌了，所以能达到的最大分数就是0，不需要用dp[1]，又如题解中的例子，从k=0开始，我们能得到的最大分数是26，dp[26], dp[27]是不必要的
![20200604000830](https://raw.githubusercontent.com/Starxyz/picGo/master/picGo/20200604000830.png)

```for i in range(K, N+1): ``` 作如下改进
```for i in range(K, min(K+W, N+1)): ```
所以第二版代码：
```py
class Solution:
    def new21Game(self, N: int, K: int, W: int) -> float:
        dp = [0.0] * (K+W)
        for i in range(K, min(K+W, N+1)):
            dp[i] = 1.

        for j in range(K-1, -1, -1):
            temp = 0
            for x in range(j, j+W+1):
                temp += dp[x]
            dp[j] = temp / float(W)

        return dp[0]
```
但是这个代码提交后，会提示超时，因为包含了太多重复的计算步骤，我们每次计算上一个dp时，其实不需要遍历```range(j, j+W+1)```
![20200604001057](https://raw.githubusercontent.com/Starxyz/picGo/master/picGo/20200604001057.png)
绿框和红框重叠的部分不需要重复计算。所以
dp[x-1] = s + dp[x] - dp[x+W]
第三版代码：
```py
class Solution:
    def new21Game(self, N: int, K: int, W: int) -> float:
        dp = [0.0] * (K+W) 
        for i in range(K, min(K+W, N+1)):
            dp[i] = 1.

        s = sum(dp[K:K+W])
        for j in range(K-1, -1, -1):
            
            dp[j] = s / float(W)
            s += dp[j] - dp[j+W]


        return dp[0]
```