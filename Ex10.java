import java.util.Scanner;
public class Ex10 {
     public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite o primeiro número:");
      int numero1 = scanner.nextInt();
      
      System.out.println("Digite o segundo número: ");
      int numero2 = scanner.nextInt();
      
      int maior = numero1;
      int menor = numero2;
      
      if (numero2 > numero1) {
          maior = numero2;
          menor = numero1;
      }
      
      for (int x = menor + 1; x < maior; x++) {
      System.out.println(x); }
      
      scanner.close();
        
     }
 }
