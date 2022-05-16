import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int idade;
        double valor;
        boolean bool;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        
        System.out.println("Digite seu salário");
        valor = sc.nextDouble();
        
        System.out.println(nome + " " + idade + " " + valor);
        


    }
}





    
 