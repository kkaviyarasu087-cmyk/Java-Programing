
import java.util.Scanner;

public class AddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i=i+2){
            if(i%2==0){
                System.out.println("even:"+i);
            }else{
                System.out.println("odd:"+i);
            }
        }
    }
    
}
