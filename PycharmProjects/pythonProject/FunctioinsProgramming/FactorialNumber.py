print("Enter a number to find factorial of a number")
inp=eval(input())

def fact(inp):
    temp=1
    while(inp>0):
        temp=temp*inp
        inp=inp-1

    return temp

print("\n\nFactorial is  => ",fact(inp) )