s=input()
if len(s)<=3:
    print("Enter a valid string of length 3")
else:
    n=len(s)
    if s.endswith('ing'):
        "".join([s,"ly"])
    else:
        "".join([s,"ing"])
    print(s)