1

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

2

list = [[1, 2], [3, 4], [5, 6, 7]]
list.reverse()

def reverseList(x):
    for i in x:
            i.reverse()
                
reverseList(list)
print(list)
