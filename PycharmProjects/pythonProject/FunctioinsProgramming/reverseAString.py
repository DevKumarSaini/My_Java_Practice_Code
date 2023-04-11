data="1234abcd"

def rev_Str(inp):
    rev_Str=''
    index=len(inp)

    while index>0:
        rev_Str +=inp[index-1]
        index=index-1
        return rev_Str

print(rev_Str(data))