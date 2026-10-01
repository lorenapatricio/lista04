import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma nota entre 0 e 10: ");
        int nota = scanner.nextInt();
        
        while (nota <0 || nota > 10) {
            
            System.out.println("Valor inválido.");
            nota = scanner.nextInt();
        }
        
        System.out.println(nota);
        scanner.close();

    }
}
