tup=(8, 2, 3, -1, 7)

def check(tup):
    multi=1
    for i in tup:
        multi=multi*i
        
    return multi

print(check(tup))
