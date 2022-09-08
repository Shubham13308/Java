import java.util.*;
class Searching_Element
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        int i,ser,p=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter array element");
            ar[i]=sc.nextInt();
        }
        System.out.println("Array Elements are ");
        for(i=0;i<5;i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("Enter element to be search");
        ser=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(ar[i]==ser)
                p++;
        }
        if(p>0)
            System.out.println("Enter element is found");
        else
            System.out.println("Enter element is not found");
    }
}