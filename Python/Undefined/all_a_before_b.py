 # Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
 # LC 2124

class Solution:
    def checkString(self, s: str) -> bool:
        index=0
        cnt=0
        for i in range(len(s)):
            if s[i]=='b':
                cnt+=1
                index=i
                break
        for i in range(len(s)):
            if cnt==0:
                return True
        for i in range(index,len(s)):
            if s[i]=='a':
                return False
        return True            