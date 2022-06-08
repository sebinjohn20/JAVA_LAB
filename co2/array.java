import java.util.Scanner;
 public class array
{
    public static void main(String args[])
    {
    int n,i,s;

    
    Scanner sc =new Scanner(System.in);
   System.out.println("enter the no of elements");
     n=sc.nextInt();
     int a[]=new int[n];
      System.out.println("enter the number elements");
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
   System.out.println("enter the serach elements");
   s=sc.nextInt();
   for(i=0;i<n;i++)
   {
       if(a[i]==s)
       {
        System.out.println(" element present at location " + (i+1) +".");
        break;  
       }
   }
   if(i==n)
    
       System.out.println("element is not found the array");
       

   
  
   
    }
}