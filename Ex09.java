import java.util.Scanner;
public class Ex09 {
     public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        for (int x = 1; x <= 50; x++) {
            
            if (x % 2 == 1) {
                System.out.println(x);
            }
            
        }
        
        scanner.close();
        
