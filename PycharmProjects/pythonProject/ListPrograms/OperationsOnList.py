llst=[0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1024, 1089, 1156, 1225, 1296, 1369, 1444, 1521]
llst[4]=[12,"Rashmi"],("Jigerash",23)
print(llst)
llst[10]=[11]
print(llst)
llst[:5]=[10.2,55.9,46.77,782.8796,11.123,]
print(llst)

# llst.remove(2)
print(type(llst))
llst.remove(10.2)
print(llst)
print(type(llst))
# del(llst)
# print(llst)
l1=[12,45,75]
print(l1)
l1.append(13.45)
l1.append(987)
l1.append(77)
l1.append(45)
print(l1)
for i in range(10):
    l1.append(eval(input()))

print(l1)