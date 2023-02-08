# # 58. Length of Last Word
# Given a string s consisting of words and spaces, return the length of the last word in the string.

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        cnt = 0
        for i in range(len(s)-1, -1, -1):
            if (s[i] != " "):
                cnt += 1
            if (s[i] == " " and cnt != 0):
                break
        return cnt
