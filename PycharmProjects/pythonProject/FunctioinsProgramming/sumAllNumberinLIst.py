# l1=[8,2,3,10,7] #list
# l2=(1,2,3,4,) # touple
# l3={1:2,2:3,3:4,4:5} # Dictionary
# l4={1,2,3,"This is Set"} #Set
#
# print(type(l1))
# print(type(l2))
# print(type(l3))
# print(type(l4))


lis1=[8,7,9,3,4,6,5]

def average(list1):
    temp=0
    for i in list1:
        temp=temp+i

    return temp

print("sum of all the value is  => ",average(lis1))