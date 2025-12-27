import java.util.*;
public class task4 {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter a  number :");
        int a=in.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=a;i++)
        {
             if (i % 2 == 0) {
                 even=even+i;
        }   
        else{
            odd=odd+i;                   
}
}
System.out.println("EVEN :"+even);
System.out.println("ODD :"+odd);
}
}\


