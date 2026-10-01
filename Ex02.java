import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu usuário: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        while (usuario.equals(senha)) {
            
            System.out.println("Seu usuário não pode ser igual a senha.");
            System.out.println("Digite seu usuário: ");
            usuario = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            senha = scanner.nextLine(); }
            
            System.out.println("Usuário cadastrado com sucesso!");
            scanner.close();
    }
}
