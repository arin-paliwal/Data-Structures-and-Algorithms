s = "3,2,6,5,1,4,8,9"
orgStr = ""
for i in range(len(s)):
    if s[i] == ",":
        continue
    else:
        orgStr += s[i]
index1 = 0
index2 = 0
for i in range(len(orgStr)):
    if orgStr[i] == '5':
        index1 = i
    if orgStr[i] == '8':
        index2 = i
sum1 = 0
for i in range(index1):
    print(orgStr[i])
    sum1 += int(orgStr[i])
for i in range(index2+1, len(orgStr)):
    print(orgStr[i])
    sum1 += int(orgStr[i])
sum2 = ""
for i in range(index1, index2+1):
    sum2 += orgStr[i]
print(sum1+int(sum2))
