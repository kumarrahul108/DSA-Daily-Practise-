
// Files in Java 

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class P16_File 
{
    public static void main(String[] args) 
    {
        File f = new File("sample.txt");

        
        // create file 
        try 
        {
            f.createNewFile();
            System.out.println("File uccessfully Created !!");
        }
        catch(Exception e)
        {   
            e.printStackTrace();
        } 


        // write file
        try 
        {
            FileWriter fw = new FileWriter(f);
            fw.write("Hi , Rahul ... You are going to get 15 LPA Packages from MNC");
            fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


        // read file
        try 
        {
            Scanner sc = new Scanner(f);
            
            while(sc.hasNextLine())
            {
                String st = sc.nextLine();
                System.out.println(st);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }


        // delte file
        if(f.delete())
        {
            System.out.println("File Deleted !!");
        } 
        else 
        {
            System.out.println("File Not Deleted !!");
        }
    }
}