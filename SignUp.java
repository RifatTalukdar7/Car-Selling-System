import java.io.FileInputStream;    
import java.util.NoSuchElementException;
import java.util.Scanner;



import java.io.*;

public class SignUp {
        
      
        public void operate(){
            Scanner input=new Scanner (System.in);
            File f1=new File("Person");
            try{
                f1.mkdir();
            }
            catch(Exception e){
                System.out.println(e);
            }
            File f2=new File("Person/Student.txt");
            try{
                f2.createNewFile();
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            System.out.print("First Name    : ");
            String s=input.nextLine();
            System.out.print("Last Name     : ");
            String s0=input.nextLine();
            System.out.print("Date of Birth : ");
            String s1=input.nextLine();
            System.out.print("Gender        : ");
            String s2=input.nextLine();
            System.out.print("Email         : ");
            String s3=input.nextLine();
            System.out.print("Password      : ");
            String s4=input.nextLine();
            System.out.print("Phone Number  : ");
            String s5=input.nextLine();
            FileWriter f3;
            try{
                f3=new FileWriter(f2);
                f3.write(s+"\n"+s0+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5);
                f3.close();
                System.out.println("\nAccount Created");
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}