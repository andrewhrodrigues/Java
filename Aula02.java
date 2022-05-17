
import java.util.Scanner;

/*Escrever um programa java que receba dois números e exiba o resultado da sua soma*/



public class Aula02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        
        System.out.println("Digite o primeiro número: ");
        number1 = input.nextInt();
        
        System.out.println("Digite o segundo número: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.println("O resultado é "+ sum);
        
 
       
        
    }
    
}
