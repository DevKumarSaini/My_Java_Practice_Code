import random

tup=(14,34,65,78,95,64,2,4,6,7,8,9,1,"Green","Blue","Yellow")
print(len(tup))
print(tup[len(tup)-2])
print(tup[len(tup)-8])
print(tup[len(tup)-3])
print(tup[len(tup)-9])
print(tup[len(tup)-5])
print(tup[len(tup)-1])
print(tup[len(tup)-10])
print(tup[len(tup)-6])

print(tup[len(tup)-9:len(tup)-5:2])

lis=list()
# for i in range(30):
#     lis.append(random.randint(10,100))
lis=[24, 35, 95, 28, 44, 25, 43, 84, 47, 36, 81, 82, 41, 66, 58, 77, 51, 52, 49, 60, 25, 87, 22, 59, 69, 93, 63, 52, 40, 46]
print(lis)
print("Index operating in list ",lis.index(47))
print(tup)
print("Index operation in tuple ",tup.index(9))

list12=[i for i in range(55) if i % 5 ==0 ]
print(list12)