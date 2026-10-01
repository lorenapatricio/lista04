import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      double paisA;
      double paisB;
      double crescimentoB;
      double crescimentoA;
      String maior = "";
      String menor = "";
      
      
      while (true) {
     
      int anos = 0;
   
      System.out.println("Digite a população do país A:");
      paisA = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país A: ");
      crescimentoA = scanner.nextDouble();
      
      System.out.println("Digite a população do país B:");
      paisB = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país B: ");
      crescimentoB = scanner.nextDouble();
      
      // Gambiarra a frente:
      
      while (paisA > paisB && crescimentoA > crescimentoB) {
          
      System.out.println("Os valores são inválidos. O país com menor população precisa ter uma taxa de crescimento superior ao país com maior população.");
      
      System.out.println("Digite a população do país A:");
      paisA = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país A: ");
      crescimentoA = scanner.nextDouble();
      
      System.out.println("Digite a população do país B:");
      paisB = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país B: ");
      crescimentoB = scanner.nextDouble();   }
      
      while (paisA < paisB && crescimentoA < crescimentoB) {
          
       System.out.println("Os valores são inválidos. O país com menor população precisa ter uma taxa de crescimento superior ao país com maior população.");
      
      System.out.println("Digite a população do país A:");
      paisA = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país A: ");
      crescimentoA = scanner.nextDouble();
      
      System.out.println("Digite a população do país B:");
      paisB = scanner.nextDouble();
      
      System.out.println("Digite a taxa de crescimento do país B: ");
      crescimentoB = scanner.nextDouble();   }
      
      
      crescimentoA = crescimentoA / 100;
      crescimentoB = crescimentoB / 100;
      
      
      
      while (paisA < paisB && crescimentoA > crescimentoB) {
          
          paisA = paisA + (paisA * crescimentoA);
          paisB = paisB + (paisB * crescimentoB);
          anos++;
          maior = "A";
          menor = "B";
      }
      
      while (paisA > paisB && crescimentoB > crescimentoA) {
          paisA = paisA + (paisA * crescimentoA);
          paisB = paisB + (paisB * crescimentoB);
          anos++;
          maior = "B";
          menor = "A";
      }
      
      
      System.out.println("Foram necessários " + anos + " anos" + " para o país " + maior + " ultrapassar ou igualar o país " + menor);
      System.out.println("Digite 0 se gostaria de encerrar. Ou 1 para uma nova simulacão.");
      int codigo = scanner.nextInt();
      
      while (codigo != 0 && codigo !=1) {
         System.out.println("Valor inválido. Digite 0 ou 1.");
         codigo = scanner.nextInt(); }
         
         if (codigo == 0) {
             
             break;
         }
              
      }
      
      scanner.close();

    }
}
