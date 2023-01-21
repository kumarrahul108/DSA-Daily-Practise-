
# while loop 
 
i = 1
while i <= 5:
    print("Hi !",end="")
    i = i + 1
    

print("\n")     
fruits = ['Banana','Mango','Guavava','Coconut','Watermelon','Litchi']   
j = 0
while j < len(fruits):
    print(fruits[j])  
    j += 1 
    
    
print("\n")    
fruits = ['Banana','Mango','Guavava','Coconut','Watermelon','Litchi']  
for f in fruits:
    print(f)  
    

print("\n\n")
for i in range (10):
    print(i)   
    
print("\n\n")    
for i in range (1,11):
    print(i)   
    
print("\n\n")
for i in range(1,11,2):
    print(i)      
    
    
print("\nTable : \n") 
for i in range(1,11):
    print(f"15 X {i} = {15*i}") 
    
print("\n\n") 
for i in range(1,11):
    if(i % 2==0):
        continue
    print(i)

    
print("\n\nCheck Prime Number : \n")  

num = input("Enter any Number :  ")
i = 2
p = True 

while(i < num):
    if(num % i == 0):
        p = False 
    i += 1
    
if(p == True):
    print("\n\nPrime Number")
else:
    print("\nNot a Prime NUmber ") 
    
    
print("Sabki maa behen ek karega - Rahul  ",end="") 
print("Just Fuck this Bloody World ")       

               