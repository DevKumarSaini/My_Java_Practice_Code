#--------------------------Default Argument function
def defaultArgument(Argument1=100,Argument2=200):
    print("Arg 1 -> ",Argument1)
    print("Arg 2 -> ",Argument2)

defaultArgument()
# ------------------------ Keyword Argument
def keywordArguments(a="Spring",b="Boot",c=2):
    print(a,b,c)

keywordArguments() # this executes automatically
keywordArguments(a="Boot ",b="Spring ",c=32)

# ------------------------  Required argument
def requiredArgument(a,b,c):
    print(a," ",b," ",c)

requiredArgument("Hello i am ",13," Know ")

# ------------------------ Variable Length Argument
def variableLengthArgument(*numbers):
# print("Average number is -> ",sum(numbers)/len(numbers))zz
 return (sum(numbers)/len(numbers))

value=variableLengthArgument(10,20,30,40,50,60,70,80,90,100)
print("Average is -> ",value)



