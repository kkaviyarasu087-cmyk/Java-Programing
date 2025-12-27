

public class Break {
	    public static void main(String[] args) {
	        System.out.println("Printing numbers from 1 to 10 (skip 5, stop at 8):");
	        for (int i = 1; i <= 10; i++) {
	                  if (i == 5) {
	            continue; 
	            }
	            if (i == 8) {
	                break; 
	            }

	            System.out.println(i);


}
	    
	    }
}
