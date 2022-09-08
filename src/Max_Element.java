import java.util.Scanner;

public class Max_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int  arr []= new int [5] ;
        int i;
        for(i=0;i<5;i++){
            System.out.println("Enter the total element");
          arr[i]=sc.nextInt();

        }

        int max = arr[0];

        for ( i = 0; i < arr.length; i++) {

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}