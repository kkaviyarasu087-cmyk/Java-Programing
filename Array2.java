
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the input:");
            arr[i]=sc.nextInt();
        }
        System.out.println("the output is:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
