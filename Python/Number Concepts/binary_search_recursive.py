def binary_search(array, start, end, item):
	if end >= start:
		middle = (end + start) // 2
		if array[middle] == item:
			return middle
		elif array[middle] > item:
			return binary_search(array, start, middle - 1, item)
		else:
			return binary_search(array, middle + 1, end, item)
	else:
		return -1
array = [2, 3, 4, 10, 40]
item = 10
result = binary_search(array, 0, len(array)-1, item)
if result != -1:
	print("Element is present at indeitem", str(result))
else:
	print("Element is not present in arrayay")
