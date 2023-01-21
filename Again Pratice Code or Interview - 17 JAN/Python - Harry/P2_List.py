
## List 

a = [1,22,43,67,6,14,8,9]

print(a)

print("\n",a[2:5]) 

a.sort()
print("Sorted List : ",a)

a.reverse()
a.pop(2)  # index 
a.remove(14) # Values
a.append(99)  # add at the end 
a.insert(2,93)

print("updated list : ",a)


## Tuples -> immutable 

t = (5,7,3,9,5,12,9,17) 
print("Tuples : ",t) 

print("Index of element in Tupple :  ",t.index(12))
print("Count :  ",t.count(9))


## Dictionaries -> key -> value

d =  {
        "A" : "Hi",
        "B" : "Mohan",
        "C" : "Seeing",
        "D" : "you",
        "E" : "after long time"
}

print("Dictionaries : ",d) 
print("Value for B : ",d["B"]) 

print("All keys : ",d.keys())
print("All Values : ",d.values())  

new_d = {
        "F" : "How are",
        "G" : "you"      
}  

d.update(new_d)

print("Upadted Dictionary : ",d) 


## Sets -> immutable 

s = {2,5,7,5,(56,34,15)} 

print("Sets : ",s)
print("Length of the Sets : ",len(s)) 
s.remove(7)
print(s)
s.pop()
print("Updates Sets : ",s)
s.clear()
print(s)  

