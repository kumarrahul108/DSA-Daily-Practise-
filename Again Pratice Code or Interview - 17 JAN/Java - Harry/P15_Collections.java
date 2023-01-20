
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;  
import java.time.*; 
import java.time.format.DateTimeFormatter; 


public class P15_Collections 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> l1 = new ArrayList<>(); 

        l1.add(56);
        l1.add(67);
        l1.add(2, 78);
        l1.add(90);  

        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        } 


        // Date 
        Date d = new Date();
        System.out.println(d);

        System.out.println("Current time : " + System.currentTimeMillis());

        System.out.println(d.getDay() + "  " + d.getHours());

        System.out.println(d.getHours() + " : " + d.getMinutes() + " : " + d.getSeconds());

        System.out.println();  


        // Calender 
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND)); 


        System.out.println("\n\n"); 

        // Date Time Formatting  
        LocalDate d1 = LocalDate.now(); 
        System.out.println(d1);

        LocalDateTime d2 = LocalDateTime.now();  
        System.out.println(d2);

        LocalTime tt = LocalTime.now();
        System.out.println(tt); 

        LocalDateTime dt = LocalDateTime.now(); 
        System.out.println(dt);

        System.out.println();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String myDate = dt.format(df);
        System.out.println(myDate); 
        

    }    
}
