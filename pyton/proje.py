list = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
newlist = []
def flatten(x):
    for i in x:
        if type(i) is type([]):
            flatten(i)
        else:
            newlist.append(i)
flatten(list)
print(newlist)