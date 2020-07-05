class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        col = len(p) + 1
        row = len(s) + 1

        table = [[False]*row for i in range(col)]
        table[0][0] = True

        if p.startswith('*'):
            table[1] = [True] * row

        for m in range(1, col):
            path = False
            for n in range(1, row):
                if p[m-1] == '*':
                    if table[m-1][0] == True:
                        table[m] = [True] * row
                        break
                    if table[m-1][n] == True:
                        path = True
                    if path == True:
                        table[m][n] = True
                elif p[m-1] == '?' or p[m-1] == s[n-1]:
                    table[m][n] = table[m-1][n-1]

        return table[col-1][row-1]

"""
"ho"
"**ho"
if table[m-1][0] == True:
    table[m] = [True] * row

关注这个测试用例
正着理解这一段就是只要上一行第0个元素为T，下一行p是 * ，那么这一行肯定全部都是T
"""