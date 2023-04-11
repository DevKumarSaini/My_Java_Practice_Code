"""
A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
"""
print("Enter your name")
name=input()
print("Enter your salary")
salary=int(input())
print("Enter your Year Of Service")
year=int(input())
if(year > 5):
    print("Old Salary is ",salary)
    temp=salary
    salary=((salary*0.05)+salary)
    print("Your upgraded salary is ",salary)
    print("Your Actual Increment Bonus is ",salary-temp,"rs")
    print("Your Year of Experience is ",year)
else:
    print("Name         ->  ",name)
    print("Salary       ->  ",salary)
    print("Working Year ->  ",year)


