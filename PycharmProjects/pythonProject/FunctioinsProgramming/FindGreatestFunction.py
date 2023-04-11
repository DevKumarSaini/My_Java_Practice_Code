def greatest(a,b,c):
    global count

    if(a>b and a>c):
        print(a,"A is greater")
    elif(b>a and b>c):
        print(b,"B is greater")
    else:
        print(c,"C is greater")

    print("This is ending of the program and we re-call greatest value program again")
    count = count + 1
    if (count == 3):
        exit(0)
    inputGreatest()

# Calling the greatest function among them
def inputGreatest():
    print("-------------------------------------\n")
    print("Count is => ",count)
    print("Enter First number")
    inp1=eval(input())
    print("Enter Second number")
    inp2=eval(input())
    print("Enter Third number")
    inp3=eval(input())
    greatest(inp1,inp2,inp3)
    print("-------------------------------------\n")

count=0
inputGreatest()