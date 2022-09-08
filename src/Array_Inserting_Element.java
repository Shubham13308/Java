import java.util.Scanner;

public class Array_Inserting_Element {
    public static void main(String[] args) {
        int n,x,pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. element you want to add in array");
        n= sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                System.out.println("ENter "+j+"the element");

            }
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the position  you want to insert");
     pos=sc.nextInt();
        System.out.println("Enter the element you want to insert");
        x=sc.nextInt();
        for(int i=(n-1);i>=(pos-1);i--){
            arr[i+1]=arr[i];
        }

        arr[pos-1]=x;
        System.out.println("After inserting element");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");

        }
        System.out.println(arr[n]);


    }
}
