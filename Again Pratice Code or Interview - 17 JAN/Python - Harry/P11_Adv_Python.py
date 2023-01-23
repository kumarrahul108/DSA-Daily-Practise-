
try:
    a = int(input("Enter any number")) 
    c = 1/a 
    print(c) 
    
except Exception as e:
    print("Exception Ocuured !!")
    print(e)  
 
else:
    print("We did it") 
  
  
def increment(num):
    try:
        return int(num) + 1
    except :
        raise ValueError("Not Good")
    
        
print("\nEnumerate Functions : \n")
list = [3,56,37,89,34,12,"Rahul"]
 
for index,item in enumerate(list):
    print(index,"--->",item) 
    
    
print("\nList Compherhension : \n")
a = [2,4,7,9,12,16,45,23,78,46] 

b = [i for i in a if i % 2 == 0]
print(b) 


print("\nLambda Function : \n")              
func = lambda a:a+5 

x = 555 
print(func(x))  


print("\nJoin Method \n") 

list = ["Camera","Phone","Laptop","Desktop"] 

for item in list:
    print(item," , ",end="")
    
sentence = "<-->".join(list) 
print(sentence) 

    
print("\nMap Function : \n")

def square(num):
    return num*num  

l1 = [1,2,3,4,5]
print(l1)

print(list(map(square,l1)))