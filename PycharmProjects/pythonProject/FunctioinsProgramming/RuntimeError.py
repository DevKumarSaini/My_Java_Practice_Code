# ---------------------------  This is default argument
def printName(firstName, latName="jack",lastOfLast="Watson"):
    print((firstName)," ",latName," ",lastOfLast)

printName("Dev")
printName("Dev ","Kumar ")
printName("Dev ","Kumar ","Saini")
# ----------------------------------------------
def printOfPrint(a=10,b="sanddy"):  # this is keyword argument
    print(a,b,"  -->  This is keyword Argument")

printOfPrint(b="10",a="sanddy")
# --------------------------------------------------
def defining(a,b,c=70):
    print("-----------------------------------------")
    print("Value of a -> ",a)
    print("Value of b -> ",b)
    print("Value of c -> ",c)
    print("Average of these is --> ",(a+b+c)/3)

defining(10,20)

lis1=[10,20,45,98,73,64,82,97,34,16,87,65,98,7,997,85,32,44]

print("\n\nLength of list is -> ",len(lis1))
print("Largest value in list is --> ",max(lis1))

a=max(lis1)
print(max(a))

print(a.max)
