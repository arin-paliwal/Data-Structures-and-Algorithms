# Create a new string by using first,middle and last character from a giving string.
def new_string(string):
    if len(string) < 3:
        return string
    else:
        middle = string[len(string)//2]
        return string[0] + middle + string[-1]
print(new_string("rajeshjkumarpandey"))

# WAP to count upper & lower case letter
s="RajeshKumarPandey"
count=0
c=0
for i in s:
    if ord(i)>=97:
        count+=1
    else:
        c+=1
print("Lower Case",c)
print("Upper Case",count)

#WAP to count digits letter and special symbols
s="Rajesh123Kumar@#Pandey!"
count=0
c=0
co=0
for i in s:
    if (ord(i)>=65 and ord(i)<=90) or (ord(i)>=95 and ord(i)<=121 ):
        count+=1
    elif(ord(i)>=49 and ord(i)<=57):
        co+=1
    else:
        c+=1
print("Letters are",count);
print("special character are",c)
print("number are",co)

# arrange string that all lowercase are first and then uppercase
s="RajeshKumarPandey"
str=""
str1=""
for i in s:
    if ord(i)>=97:
        str="".join([str,i])
        print("in1",str)
    else:
        str1="".join([str1,i])
        print("in2",str1)
print(str1+str)

# Check wheather the sum of 2 numbers from the list is equal to given target or not?
target=10
list=[1,2,3,4,5,6,7,8,9,10]
def check(list):
    c=0
    for i in range(len(list)-1):
        for j in range(len(list)-1):
            if i!=j:
                if list[i]+list[j]==target:
                    return list[i],list[j]  
    if c==0:
        return;
print(check(list))

# Check whether string is pallindrome or not

#Function to check whether the string is palindrome or not

def palindrome(a):
	mid = (len(a)-1)//2	 
	start = 0			 
	last = len(a)-1
	flag = 0
	while(start <= mid):
		if (a[start]== a[last]):
			
			start += 1
			last -= 1
		else:
			flag = 1
			break;
	if flag == 0:
		print("The entered string is palindrome")
	else:
		print("The entered string is not palindrome")
# Function to check whether the string is symmetrical or not	
def symmetry(a):
	n = len(a)
	flag = 0
	if n%2:
		mid = n//2 +1
	else:
		mid = n//2
	start1 = 0
	start2 = mid
	while(start1 < mid and start2 < n):
		if (a[start1]== a[start2]):
			start1 = start1 + 1
			start2 = start2 + 1
		else:
			flag = 1
			break
	if flag == 0:
		print("The entered string is symmetrical")
	else:
		print("The entered string is not symmetrical")
string = 'alaska'
palindrome(string)
symmetry(string)

# Sum of all numbers:
s="4558@34A79%45G"
suma=0
for i in s:
    if(ord(i)>=49 and ord(i)<=57):
        suma+=int(i)
print("Sum is",suma)
print("Avg is",suma//2)

# find the missing digit from the given mobile number

s="6393866066"
total="0123456789"
str1=""
for i in total:
    if i not in s:
        str1="".join([str1,i])
print(str1)
