
import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        System.out.println("enter value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int add=0;
        for(int i=1;i<=n;i++){
         add=add+i;
        }
        {
            System.out.println("sum of:"+add);
        }
    }
    
}
