# Take two int values from user and print greatest among them.
print("Enter first number")
inp1=int(input())
print("Enter Second number")
inp2=int(input())

if(inp1>inp2):
    print(inp1," is greater")
elif(inp1 == inp2):
    print("Both are equal")
else:
    print(inp2," is greater")
