
class Employee:
    
    company = "Swiggy"
    
    def print(self):
        print("This is an Employee") 
        
class Programmer(Employee):
    
    language = "Java - DSA"
    
    def display(self):
        print("This is a Programmer")
        
class Rahul(Programmer):
    
    brand = "Microsoft" 
    
 
e = Employee() 
p = Programmer()
r = Rahul()                     

print("Company : ",p.company)
print("Language : ",r.language) 
print(p.display())


print("\n\n") 


class Employee:
    company = "Visa"
    ecode = 764
    

class Freelancer:
    company = "Fibre" 
    level = 1
    

class Program(Freelancer, Employee):
    name = "Rahul Kumar" 
    
pr = Program()
print(pr.company) 
 
 
 
print("\n\nConstructor call of prev one .")   

class Person:
    country = "India"
    
    def takeBreadth(self):
        print("I am Breathing") 
        
    
class Employee(Person):
    company = "Honda"
    
    def getSalary(self): 
        print(f"Salaey is {self.salary}")
        
    def takeBreadth(self):
        super().takeBreadth() 
        print("I am a Employee class so lucliy breathing !")    
                 
                 

e = Employee() 
e.takeBreadth()                 

           