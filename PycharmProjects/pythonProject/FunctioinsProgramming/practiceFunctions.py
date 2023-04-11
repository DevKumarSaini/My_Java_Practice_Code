#There are four types of functions in python language
'''
1 Default Argument
2 keyword Argument
3 Required Argument
4 Variable Length Argument
'''

# ---------------------- Default Argument
def DefaultArgumentFunction(First=0,Second="Nothing",Third=0.0):
    print(First," ",Second," ",Third)

DefaultArgumentFunction(78,10.45,Second="")

#----------------------- Key Value Argument
def KeyValueArgument(One=0,two="Two",three=0.0):
    print(One," ",two," ",three)

KeyValueArgument(24,"Bhoot Bangla ",45.45)