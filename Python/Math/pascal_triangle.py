# Print Pascal's Triangle in Python
from math import factorial
total = 5
for i in range(total):
	for j in range(total-i+1):
		print(end=" ")
	for j in range(i+1):
		print(factorial(i)//(factorial(j)*factorial(i-j)), end=" ")
	print()
