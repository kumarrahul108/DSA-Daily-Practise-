
class Employee1:
    
    company = "Google"
    salary = 400 
    location = "New Delhi" 
    
    def changeSalary(self,sal):
        self.salary = sal 
        
e = Employee1()         

print("For Employee 1 : \n")   
print(f"Company = {e.company}") 
print(f"Location :  {e.location}") 
print(f"Salary : {e.salary}")
e.changeSalary(600)
print(f"Updated Salary : {e.salary}")  
print(f"Employee1 Class Salary :  {Employee1.salary}")



print("\nFor Employee 2 : \n")

class Employee2:
    
    company = "Microsoft"
    salary = 500 
    
    def changeSalary(self,sal):
        self.__class__.salary = sal

    
e2 = Employee2() 
print(f"Comapny : {e2.company}") 
print(f"Salary : {e2.salary}") 
e2.changeSalary(800)
print(f"Updated Salary : {e2.salary}")
print(f"Employee2 Class Salary : {Employee2.salary}")         
    


print("\nFor Employee 3 : \n") 

class Employee3:
    
    company = "Adobe"
    salary = 700
    
    @staticmethod
    def greet():
        print("Good Morning !!")  
    
    @classmethod 
    def changeSalary(self,sal):
        self.salary = sal  
        
        
e3 = Employee3()
print(e3.greet()) 
print(f"Company : {e3.company}")    
print(f"Salary : {e3.salary}") 
e3.changeSalary(1200) 
print(f"Updated Salaery : {e3.salary}") 
print(f"Employee Class Salary : {Employee3.salary}")  


# Operators Overloading 

class Number:
    
    def __init__(self,num):
        self.num = num 
        
    def __add__(Self,num2):
        print("Let's Add !!") 
        return self.num + num2.num 
    
    def __mul__(self,num2):
        return self.num * num2.num 
    
 
n1 = Number(4)
n2 = Number(6)

sum = n1 + n2 
mul = n1 * n2 

print(sum , mul)    
            

       