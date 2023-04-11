# a=10
# b=20
# c=10
#
# print("----------------------------Statement 1")
# if(a and c == 10):
#     print("true")
# else:
#     print("False")
#
# print("----------------------------Statement 2")
# if (a or b):
#     print("true")
# else:
#     print("False")
#
# print("----------------------------Statement 3")
# a=False
# print(not a)
#
# dic={1:"one",2:"two",3:"three",4:"four",5:"five"}
# for di in dic:
#  print(di," --> ",dic[di])
#
# def deekho(**value):
#     for i in value:
#         print(value[i])
#
# deekho(dic)
#

# numbers = [3, 5, 23, 6, 5, 1, 2, 9, 8]
# sum=0
# for i in range(len(numbers)):
#     sum=sum+numbers[i]**2
#     print(sum)
#     # sum=sum**2
# # print(sum)
#

# i=1
# multiplication=744
# while(i<1650):
#     print(multiplication," x ",i," = ",multiplication*i)
#     i=i+1

#
# age="The quick borown fox jumps rights over in the lazy dog"
# for i in age:
# age=["String","Fello","gr1and talk","Homen"]
# #     if(i == "q" or i=="f"):
# #         continue
# #     print(i)
# for string in age:
#     print(age*3)
# good="1"
# print(good.isdigit())
# print(good.upper())
# print(good.islower())

# def fucntions(one,two):
#     print(one," ",two)
#
# fucntions(10)

le=[10,20,30,40,50]
def avg(*nm):
    print(sum(le)/len(le))

avg(le)