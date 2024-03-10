import java.io.*;
class Minimum
{
    public static void main(String args[])
    {
        DataInputStream din;
        int x,y,z,min;
        String s;
        din = new DataInputStream(System.in);
        try
        {
            System.out.println("\nEnter the first number : ");
            s=din.readLine();
            x=Integer.parseInt(s);
            System.out.println("\nEnter second number : ");
            s=din.readLine();
            y=Integer.parseInt(s);
            System.out.println("\nEnter third number : ");
            s=din.readLine();
            z=Integer.parseInt(s);
            min= z<(x<y?x:y)?z:(y<x?y:x); 
            System.out.println("Minimum number = "+min);
            
        }
        catch(Exception e) 
        {
            System.out.println("Error : "+e);
        }
        
    }
}


