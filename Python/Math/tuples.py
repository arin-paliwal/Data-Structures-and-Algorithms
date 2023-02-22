# find all possible pair of given two tuples

pair1 = (1, 2)
pair2 = (5, 7)

result = []
for p1 in pair1:
    for p2 in pair2:
        result.append((p1, p2))
for p1 in pair2:
    for p2 in pair1:
        result.append((p1, p2))
print(result)
