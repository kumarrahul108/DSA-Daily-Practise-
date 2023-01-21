
a = 56
if(a > 80):
    print("Larger Number")
elif(a < 80 and a >=40):
    print("Meduim")
else:
    print("Smaller Number") 
    

b = [5,7,9,12,57,34] 


# in -> operator
print(12 in b)     


# is -> opeartor 
c = None
if(c is None):
    print("Yes")
else :
    print("Noo")            


names = ['mohan' ,'sohan' ,'geeta' ,'seeta' ,'tarun']    
print("Name List : ",names)

name = input("Enter name to be searched  :  ")
if(name in names):
    print("True")
else:
    print("Noo")