
class Vec:
    
    def __init__(self,i,j):
        self.icap = i
        self.jcap = j
        
    def __str__(self): 
        return f"{self.icap}i + {self.jcap}j"  
    
    
class Vec3d(Vec):
    
    def __init__(self,i,j,k):
        super().__init__(i,j) 
        self.kcap = k 
        
    def __str__(self):
        return f"{self.icap}i + {self.jcap}j + {self.kcap}k" 
    

v1 = Vec(2,5)                 

v2 = Vec3d(3,6,9)

print("2 d Vector : ",v1)
print("3 d Vector : ",v2) 