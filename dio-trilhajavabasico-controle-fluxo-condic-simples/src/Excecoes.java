import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    /**
     * Exceções são tratamentos ao código, possibilitando a correção com orientação correta
     * sobre input dos dados ou leitura de arquivos. Ex.: qdo campo é numero informar ao usuario
     * */
    public static void main(String[] args) {
        //criando o objeto scanner
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
        } 
        catch (InputMismatchException e){
            System.out.println("O campo idade é numerico e altura aceita apenas ponto");
        }
    }
}
