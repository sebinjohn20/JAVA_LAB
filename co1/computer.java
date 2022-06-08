import java.util.Scanner;
class cpu{
    Scanner sc = new Scanner(System.in);
    int price;
    void getcpu()
    {
        System.out.println("enter the price of the cpu:");
        price=sc.nextInt();

    }

class processor{
    int core;
    String man;
    void getprocessor()
    {
        System.out.println("Enter the no of cores:");
        core=sc.nextInt();
         System.out.println("enter the name of manufacturer cpu:");
         man=sc.next();


    }
    void putprocessor()
    {
        System.out.println("no of cores:"+core);
        System.out.println("name of manufacturer:"+man);
    }
}
static class ram{
    int memory;
    String man;
    Scanner sc =new Scanner(System.in);
    void getram()
    {
    
    System.out.println("enter the manufacturer of ram:");
    man=sc.next();
    System.out.println("enter the memory size(GB) of a ram");
    memory=sc.nextInt();
    }
    void putram()
    {
        System.out.println("memory size of ram:"+memory);
        System.out.println("manfufacture of ram:"+man);
    }
}
    }
    public class computer
    {
        public static void main(String args[])
        {
            cpu c=new cpu();
            cpu.processor p=c.new processor();
            cpu.ram r= new cpu.ram();   
            c.getcpu();
            p.getprocessor();
            r.getram();
            System.out.println("\n Details");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
            p.putprocessor();
            r.putram();                                                                                     
        }
    }




