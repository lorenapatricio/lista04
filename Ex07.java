import java.util.Scanner;
public class Ex07 {
     public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Digite o primeiro número:");
         double numero1 = scanner.nextDouble();
        
         System.out.println("Digite o segundo número:");
         double numero2 = scanner.nextDouble();
        
         System.out.println("Digite o terceiro número:");
         double numero3 = scanner.nextDouble();
        
         System.out.println("Digite o quarto número:");
         double numero4 = scanner.nextDouble();
      
         System.out.println("Digite o quinto número:");
         double numero5 = scanner.nextDouble();
        
         double maior1 = Math.max(numero1, numero2);
         double maior2 = Math.max(numero3, numero4);
         double maior3 = Math.max(maior1, numero5);
         double maior = Math.max(maior3, maior2);
        
         System.out.println("O maior número é: " + maior);
        
         scanner.close();
     }
 }

