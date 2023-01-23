'''
    PROJECT 3 :
    
        LIBRARY MANAGEMENT SYSTEM 
        
                   Implement using : Student & Library Class
                   
                   Library Class Methods :-> displayBook, issueBook, returnBook,  
                   Student Class Methods :-> requestBook, returnBook 
    
''' 


class Library:
    
    def __init__(self,books):
        self.books = books 
        
    def displayBook(self):
        for book in self.books:
            print(" * ",book)
            
    def returnBook(self,bookname): 
        self.books.append(bookname)
        
    def issueBook(self,bookname):
        
        if bookname in self.books:
            self.books.remove(bookname)
            
        else:
            print("Not Available ")        
        
        
class Student:
    
    def requestBook(self):
        self.book = input("Enter Book : ")
        return self.book  
    
    def returnBook(self):
        self.book = input("Book Name :")
        
        
if __name__ == "__main__":
    
        lib = Library(["Data Structure","Algorithm","Java","Python","Power BI","Excel","C++","Machine Learning","Django"]) 
        
        stu = Student()
        
        while(True):
            
            wel = '''
             #### ** Welcome to Central Library of University of Delhi ** ###
             
             Please Choose an option :
             1. Display all the Books
             2. Issues a Book
             3. Add/Return a Book 
             4. Exit the Library
             
            '''
            
            print(wel)

            a = int(input("Enter a choice : "))

            if(a == 1):
                lib.displayBook() 
            elif(a == 2):
                lib.issueBook(stu.requestBook())
            elif(a == 3): 
                lib.returnBook(stu.returnBook())
            elif(a == 4):
                print("Thanks for choosing Central Library ! Have a great day ahead !!")
                exit()   
            else:
                print("Invalid Choice ")                           