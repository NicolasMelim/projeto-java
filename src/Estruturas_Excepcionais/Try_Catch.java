
package Estruturas_Excepcionais;
import java.util.InputMismatchException;
import  java.util.Scanner;
import java.util.Locale;
public class Try_Catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{


        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua alturta");
        double altura = scanner.nextDouble();


        System.out.println("Olá, me chamo "+ nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E tenho " + altura + " de cm");
        }catch (InputMismatchException e){
            System.out.println("Os campos, idade e altura devem ser numericos! ");
        }

    }
}
