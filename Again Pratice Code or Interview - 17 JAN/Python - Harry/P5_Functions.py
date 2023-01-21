
def name(n):
    print("Hello , " + n) 
    
name("Mr. Rahul Kumar")    

na = input("Enter your name :  ")

name(na)


def conversion(n):
    return n * 2.225

val = conversion(45)

print("Converted Value : ",val) 

st = "    Rahul Kumar      " 

print("Name after Stripping : ",st.strip())  
print(st.replace("a","##"))  