import java.util.Scanner;
public class Finding_TheKth_Element
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the k th position at which you want to check number:");
        int k = sc.nextInt();
        System.out.println("Number:"+a[k-1]);
    }
}