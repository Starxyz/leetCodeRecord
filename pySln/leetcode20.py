class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2:
            return False

        d = {
            ')': '(',
            ']': '[',
            '}': '{'
        }

        stack = []
        for ch in s:
            if ch in d:
                if stack and stack [-1] == d[ch]:
                    stack.pop()
                else:   #特殊用例 "([}}])"
                    return False
            else:
                stack.append(ch)

        return not stack

