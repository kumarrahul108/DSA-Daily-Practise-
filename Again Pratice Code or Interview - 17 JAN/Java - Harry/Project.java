
class Library 
{
    int no_books;
    String books[];

    Library()
    {
        books = new String[100];
        no_books = 0;
    }

    public void addBook(String book)
    {
        books[no_books] = book;
        no_books++; 
    } 

    public void returnBook(String book)
    {
        addBook(book);   
    }

    public void displayBook()
    {
        System.out.println("Books Present in the Library");

        for(String book:books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println(" * " + book);
        }
    }

    public void issueBook(String book)
    {
        for(int i=0;i<books.length;i++)
        {
            if(books[i] == book)
            {
                books[i] = null;
                return;
            }
        }
    }
}


public class Project 
{
    public static void main(String[] args) 
    {
        Library lib = new Library(); 

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("Flask");
        lib.addBook("Css");
        lib.addBook("JavaScript");

        lib.displayBook();

        lib.issueBook("Java");

        System.out.println("\n");
        
        lib.displayBook();
    }    
}
