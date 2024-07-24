import java.io.*;
   public class Main
 {
   public static void main(String args[])
   {
      int a[],n,i;
    DataInputStream din =new DataInputStream(System.in);
   try
{
       System.out.println("Enter n");
       n=Integer.parseInt(din.readLine());
       a=new int[n];
  for(i=0;i<n;i++)
 {
       System.out.println("Enter a["+i+"]");
       a[i]=Integer.parseInt(din.readLine());
   }
   System.out.println("\nEntered elements are :");
  for(i=0;i<n;i++)
  {
      System.out.println(a[i]);
   }
}
catch (Exception e)
{
   System.out.println("Error:"+e);
  
   }
}
}

