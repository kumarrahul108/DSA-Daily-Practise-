# Opps Concept :


class RailwayForm :
    
    form = "Railway Ticket Journey\n"

    def printDetails(self):
        print(f"Name of Passenger  : {self.name}")
        print(f"Name of the Train  : {self.train}")
        
rk = RailwayForm()  

rk.name = "Rahul Kumar"
rk.train = "Vikramshila Express"

print(rk.form) 
rk.printDetails()      

print("\n\n")


class Employee :
    
    company = "Google"
    salary = 500
    
    @staticmethod
    def greet():
        print("Good Morning !!") 
        
rahul = Employee()
vishal = Employee()                

rahul.greet() 
print("Name of the Company : ",rahul.company)
print("Salary : ",rahul.salary)    

rahul.salary = 600
print("Updated Salary : ",rahul.salary) 


print("\n\n") 
class Railway:
    
    def __init__(self,name,train,birth):
        self.name = name 
        self.train = train 
        self.birth = birth 
        
    @staticmethod
    def greet():
        print("Welcome to Indian Railways ")
        
    def printDetail(self):
        print(f"Name of the Passenger :  {self.name}")
        print(f"Name of Train : {self.train}")
        print(f"Seat Number : {self.birth}") 
        
            
tr1 = Railway("Rahul Kumar","Rajdhani Express",34)

tr2 = Railway("Garvika","Awadh Assam",78)

tr1.printDetail()
print("\n") 
tr2.printDetail()                