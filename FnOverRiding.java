import java.io.*;
class Person
{
   int age;
   String name;
  public void read()
{
  DataInputStream din = new DataInputStream(System.in);
  try
 {
   System.out.println("Enter the name and age:");
   name = din.readLine();
  age=Integer.parseInt(din.readLine());
}
catch(Exception e)
{
System.out.println("Error :"+e);
   }
} 
  public void disp()

{
  System.out.println("Name :"+name+"Age:"+age);
 }
}
  class Teacher extends Person
{
  String subj;
 public void read()
{
  DataInputStream din=new DataInputStream(System.in);
try
{
  System.out.println("Enter Subject:");
  subj=din.readLine();
}
  catch(Exception e)
{
  System.out.println("Error :"+e);
}
  }
   public void disp()
{
System.out.println("Subject:"+subj);
   }
}
public class FnOverRiding
{
   public static void main(String args[])
{
  Person P;
  Teacher t;
  P=new Person();
t=new Teacher();
P.read();
t.read();
P.disp();
t.disp();
}
}
