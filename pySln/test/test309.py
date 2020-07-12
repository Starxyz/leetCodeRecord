from leetcode309 import Solution

sln = Solution()


def test_case0():
    stocks = [1, 2, 3, 0, 2]
    # 1元买入， 2元卖出，赚1元
    # 0元买入， 2元卖出，赚2元
    # 总共赚 1+2=3元
    assert sln.maxProfit(stocks) == 3


def test_case1():
    stocks = [1, 2]
    assert sln.maxProfit(stocks) == 1


def test_case2():
    stocks = [1, 2, 4]
    assert sln.maxProfit(stocks) == 3


def test_case3():
    stocks = [6, 1, 3, 2, 4, 7]
    assert sln.maxProfit(stocks) == 6
