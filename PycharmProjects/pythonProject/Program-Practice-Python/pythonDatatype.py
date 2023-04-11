print("Hello Buddy Be Constant in python course")

#datatype in python
a =10
b= True # first letter of the boolean value is also be a capital letter
c="Hello dev"
d=12.5
f=1,4  # this is tuple type data type

#del f  # this is deleted function which is deleted the variable of the variable (it will produce error f is not exist)
print(a,b,c,d,f ,sep="\n")  # this is seperate function which is seprate the individual value of the program

print (a,type(a))  # this is type function wichi is used to check the type of the data type of value stored in variable

print ("hell i am there ", sep=" - ")

aa =4654864848465485684891848498614564648789784516549848 # there is no limit in python for inter to store its value
print(aa)

print (d, type(d),"\n" ,f,type(f))

bb,cc,dd,ee = 12,45,"hi",True  #in python we can also declare variables of this type
print("\n",bb,type(bb),"\n",cc,type(cc),"\n",dd,type(dd),"\n",ee,type(ee),"\n")

print(aa,id(aa))
aa=45
print (aa,id(aa))

print("-------------------------------------------------------")
x=y=z=10
print(id(x),id(y),id(z), sep=("\n"))
print(type(x))

a=10
f,g,h=100,200,300
ff=gg=4545
del(gg)
print(ff,gg)
print(gg)