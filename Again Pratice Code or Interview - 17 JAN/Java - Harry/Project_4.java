
class Library 
{
    String books[];
    int no_books; 

    Library()
    {
        this.books = new String[100];
        this.no_books = 0; 
    } 

    public void addBook(String book)
    {
        books[no_books] = book;
        no_books++; 
    } 

    public void displayBook()
    {
        for(String e:books)
        {
            if(e == null)
            {
                continue; 
            }
            System.out.println(" * " + e); 
        }
    } 

    public void returnBook(String book)
    {
        addBook(book);
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
        System.out.println("Not Avilable"); 
    }

}


public class Project_4 
{
    public static void main(String[] args) 
    {
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("HTML");
        lib.addBook("C++");
        lib.addBook("Data Structure");
        lib.addBook("Power BI");
        lib.addBook("Intro to GIT");
        lib.addBook("Advanced Excel");

        lib.displayBook();
    }    
}
