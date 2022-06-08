import java.util.Scanner;
 public class tran
{
    public static void main(String args[])
    {
int i,j,r,c;

Scanner sc= new Scanner(System.in);
System.out.println("enter the number of rows");
r=sc.nextInt();
System.out.println("enter the number of columns");
c=sc.nextInt();
int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int result[][]=new int[r][c];
System.out.println("enter the matrix1");
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    m1[i][j]=sc.nextInt();
}

System.out.println("enter the matrix2");
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    m2[i][j]=sc.nextInt();
}
System.out.println(" elements of matrix1");
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {

    System.out.print(m1[i][j]+"\t");
    }
    System.out.println();

    }
System.out.println(" elements of matrix2");
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {

    System.out.print(m2[i][j]+"\t");
    }
    System.out.println();

    }
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    result[i][j]=m1[i][j]+m2[i][j];
}
System.out.println("sum of matrix");
for(i=0;i<r;i++)
{
    for(j=0;j<c;j++)
    {

    System.out.print(result[i][j]+"\t");
    }
    System.out.println();

    }
    
}
}
