'''
    Project 2 --> High Score Game 
    
    Generate any Random Number and make it guess by the user until user guesses it Right.
                   Also , print in how many guesses user gussed it Right. 
                   
                   If user enters a number higher than the random number --> print : Too High
                   If user enters a number lower than the random number --> print : Too Low 
                   
                   Store guesses in a text file "highscore" 
                   
''' 


import random 

ranNum = random.randint(1,100)
print(ranNum)
guess = 0


while(True):
    user = int(input("Enter any Number : ")) 
    
    guess += 1 
    
    if(user == ranNum):
        print(f"Gueesed right ! Attempts : -> {guess}")
        break 
    
    if(user < ranNum):
        print("Too Low")
        
    if(user > ranNum):
        print("Too High")       