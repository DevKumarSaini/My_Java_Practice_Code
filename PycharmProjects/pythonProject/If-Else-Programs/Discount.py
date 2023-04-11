"""A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user."""
print("Enter total no of pieces")
piece=int(input())
print("Enter cost of one Unit")
cost=int(input())

descount=0
total=0
if(piece>1000):
 total=piece*100

 descount=int(total*0.1)
 print("Cost of one uint is ",cost)
 print("Total cost of your all Unit is ",total)
 print("Discount of 10% on your product is ",descount)
 total=(total-descount)
 print("Final amount of you product is ",total)