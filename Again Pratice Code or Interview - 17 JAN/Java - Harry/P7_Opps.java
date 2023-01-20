
class Employee 
{
    int id;
    String name;
}  

class Employeee
{
    int id;
    String name;

    public void printDetails()
    {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }  
}


class Employeeee 
{
    int id;
    String name;

    Employeeee(int id,String name)
    {
        this.id = id;
        this.name = name;
    } 

    Employeeee(String name)
    {
        this.name = name;
    }
    
    public void printDetails()
    {
        System.out.println("For the Employee of Microsoft  \n");  
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}


public class P7_Opps 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.id = 5353;
        e1.name = "John";  

        System.out.print("\nId : " + e1.id);
        System.out.print("\nName : " + e1.name);  
        
        System.out.println("\n\n");         

        Employeee e2 = new Employeee(); 
        e2.id = 5354;
        e2.name = "Aryan";  
        
        e2.printDetails();


        Employeeee e3 = new Employeeee(5355, "Prakant Singh");

        e3.printDetails();

        Employeeee e4 = new Employeeee("Varun Singh");
        e4.printDetails();
        
    }    
}
