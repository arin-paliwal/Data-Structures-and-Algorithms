# lex_auth_012693816331657216161
def encode(message):
    c = 0
    s = ""
    for i in range(len(message)):
        print(c)
        if(i==len(message)):
            if message[len(message)-1]==message[len(message)-2]:
                c += 1
                s = "".join([s, str(c)])
                s = "".join([s, message[i]])
                print(s, c, i, message[i], message[i+1])
            c = 0
        if (i != len(message)):
            if message[i] != message[i+1]:
                c += 1
                s = "".join([s, str(c)])
                s = "".join([s, message[i]])
                print(s, c, i, message[i], message[i+1])
                c = 0
            elif message[i] == message[i+1]:
                c += 1
    if c!=0:
        s = "".join([s, str(c)])
        s = "".join([s, message[i]])
    print("earlier",s)
    if message[-1]==s[-1]:
        a=s[-2]
        print(s[-2])
        a=int(a)
        a+=1
    if message[-1]!=s[-1]:
        s="".join([s,"1"])
        s="".join([s,message[-1]])
    print(s)
    return s
encoded_message   =encode("ABBBBCCCCCCCCCBBB")
print(encoded_message)
