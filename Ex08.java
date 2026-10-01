import java.util.Scanner;

public class Ex08 {
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
        
        double soma = numero1 + numero2 + numero3 + numero4 + numero5;
        double media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
        
        System.out.println("A soma dos números " + soma);
        System.out.println("A média dos números " + media);
        
        scanner.close();
    }
}
