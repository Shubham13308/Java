import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        String name="Shubham";
        int length=name.length();
        String rev=" ";
        for(int i=length-1;i>=0;i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);

    }
}
