import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        double salario;
        char genero;
        char estadoCivil;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        while (nome.length() < 3) {
            
            System.out.println("Seu nome precisa ter pelo menos três caracteres.");
            nome = scanner.nextLine();
        }
        
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        
        while (idade < 0 || idade > 150) {
            
            System.out.println("A idade precisa ser um número inteiro entre 0 e 150");
            idade = scanner.nextInt();
        }
        
        System.out.println("Digite seu salário:");
        salario = scanner.nextDouble();
        
        while (salario <= 0) {
            
            System.out.println("Seu salário precisa superior a 0");
            salario = scanner.nextDouble();
        }
        
        System.out.println("Digite seu gênero.\n" + "M para masculino.\n" + "F para feminino.\n");
        genero = scanner.next().charAt(0);
        genero = Character.toLowerCase(genero);
        
        while (genero != 'f' && genero != 'm') {
         System.out.println("Valor inválido. Digite novamente.");
         genero = scanner.next().charAt(0);
         genero = Character.toLowerCase(genero);  }
         
    
        System.out.println("Digite seu estado civil.\n" + "S para Solteiro.\n" + "C para Casado.\n" + "V para Viúvo(a).\n" + "D para Divorciado.\n");
        estadoCivil = scanner.next().charAt(0);
        estadoCivil = Character.toLowerCase(estadoCivil);
        
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            
            System.out.println("Valor inválido. Digite novamente.");
            estadoCivil = scanner.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil);  }
            
            System.out.println("Quantidade de caracteres no nome: " + nome.length());
            System.out.println("Idade : " + idade);
            System.out.println("Salário : " + salario);
            System.out.println("Gênero : " + genero);
            System.out.println("Estado Civil: " + estadoCivil);
            
            scanner.close();
            
    }
}
