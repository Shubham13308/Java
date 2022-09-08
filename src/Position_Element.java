import java.util.Scanner;

class Position_Element{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,flag=0,i=0;
        int arr[]=new int[5];
        System.out.println("Enter all the element in the array");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find in the array");
        x=sc.nextInt();
        for(i=0;i<5;i++){
            if(arr[i]==x){
                flag=1;
                break;
            }
            else{
                flag=0;

            }
        }
        if(flag==1){
            System.out.println("Element is found at position at"+(i+1));
        }
        else{
            System.out.println("Element is not found");
        }
    }
}