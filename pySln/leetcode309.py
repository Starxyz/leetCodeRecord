class Solution:
    def maxProfit(self, prices) -> int:
        n = len(prices)
        if n <= 1:
            return 0
        dp = [[0, 0] for i in range(n)]
        # dp[i][0] sell or not buy
        # dp[i][1] hold or buy
        # dp[1][1] = 0 - prices[0]
        # for i in range(2, n+1):
        #     dp[i][0] = max(dp[i-1][0], dp[i-1][1]+prices[i-1])
        #     dp[i][1] = max(dp[i-2][0]-prices[i-1], dp[i-1][1])

        # return max(dp[-1])
        # initilize n-1 and n-2
        dp[0][1] = 0 - prices[0]
        dp[1][0] = max(dp[0][1] + prices[1], dp[0][0])
        dp[1][1] = max(dp[0][1], dp[0][0] - prices[1])
        # print(dp)
        for i in range(2, n):
            #               not buy,    sell
            dp[i][0] = max(dp[i - 1][0], dp[i - 1][1] + prices[i])
            #               hold        buy
            dp[i][1] = max(dp[i - 1][1], dp[i - 2][0] - prices[i])
            # print(i, dp[i])

        return max(dp[-1])


if __name__ == '__main__':
    stocks = [6, 1, 3, 2, 4, 7]
    sln = Solution()
    res = sln.maxProfit(stocks)
    print(res)
