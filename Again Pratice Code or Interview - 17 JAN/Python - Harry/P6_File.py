
## Files in Python 

f = open('r.txt','r')
data = f.read()
print(data)
f.close() 


print("\n\n")  
g = open('r.txt')
d1 = g.read(10)
print(d1)
g.close() 


print("\n\n")
h = open('r.txt') 
d2 = h.readline()
print(d2)
d3 = h.readline() 
print(d3) 
d4 = h.readline()
print(d4)  


f1 = open('sample.txt','w')
f1.write("New File Creation -> Attitude")
f1.close() 

f2 = open('sample.txt')
data = f2.read()
print(data)
f2.close() 


print("\n\n") 
f3 = open('sample.txt','w')
f3.write("My Attitude is my Style")
f3.write("\nI am Bloody Rahul")
f3.write("\nHi Rahul , what's going on !")
f3.close() 


f4 = open('sample.txt','r')
data = f4.read()
print(data)
f4.close() 


print("\n") 
with open('sample.txt','r') as f:
    content = f.read()
    print(content) 
    
    


print("Tables : ")

i = 1
while(i <= 30):
    with open(f"Tables/Multipliction of {i}.txt","w") as f:
        j = 1
        while(j <= 10):
            f.write(f"{i} X {j} = {i*j}")
            if(j != 10):
                f.write("\n")
            j += 1    
        
    i += 1   
    
    


print("\nSensor Conteent :  ")

words = ["dokey","dog","fool","chutiya","fuck"]        

            
# just printing content of the sensor text  
with open("sensor.txt","r") as f:
    data = f.read()
    print(data)
    f.close()  
     

for wd in words:
    data = data.replace(wd,"****")
    with open("sensor.txt","w") as g: 
        g.write(data)      
        

        