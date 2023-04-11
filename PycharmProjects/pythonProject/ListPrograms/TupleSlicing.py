tup=(10,20,45,98,7,7,7,76,31,54,98,7,6)
# Tuple is immutable data it cannot change the data types
print(tup[:])
print(tup[2:])
print(tup[2:8:2])
print(tup[:len(tup)])
print("Neg ",tup[5:len(tup)-6])
print(tup.index(45))
print(tup.index(7))
print(len(tup))
print(tup.__sizeof__())
print(tup[-4:-2])
# print(tup.__reversed__())
print(98 in tup)
hel=40
# print(hel is not 40)
blank=tuple()
print(type(blank))
type=("Hello","Buddy","I am ","Your Daddy","DragonCorn")
for first in type:
    print(first)
    print("------------------------")
    for second in first:
        print(second)

print(tup*23)