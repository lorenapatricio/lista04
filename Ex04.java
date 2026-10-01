import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      double paisA = 80000;
      double paisB = 200000;
      int anos = 0;
      
      while (paisA < paisB) {
          
          paisA = paisA * 1.03;
          paisB = paisB * 1.015;
          anos++;
      }
      
      System.out.println("Foram necessários " + anos + " anos" + " para o país A ultrapassar ou igualar o país B.");
      
      scanner.close();

    }
}
