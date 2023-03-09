test = int(input())
for i in range(test):
    x, y = map(int, input().split())
    if x == y:
        if x % 2 != 0:
            print("CHEF")
            continue
        else:
            print("CHEFINA")
            continue
    diff = abs(x-y)
    if diff >= 2 and x > y:
        print("CHEF")
        continue
    elif diff >= 2 and x < y:
        print("CHEFINA")
        continue
    if x % 2!= 0 and x > y:
        print("CHEFINA")
        continue
    elif x % 2 == 0 and x > y:
        print("CHEF")
        continue
    elif y % 2 == 0 and y > x:
        print("CHEF")
        continue
    elif y % 2 != 0 and y > x:
        print("CHEFINA")
        continue
