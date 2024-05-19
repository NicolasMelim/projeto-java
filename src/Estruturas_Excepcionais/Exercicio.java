package Estruturas_Excepcionais;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            try{
                System.out.println("Digite a sua idade para apostar:  ");
                int idade = scanner.nextInt();
                if(idade >= 18){
                    System.out.println("Parabéns, agora digite o seu nome: ");
                    String nome = scanner.next();
                    

                    System.out.println("Digite o seu deposito: ");
                    int deposito = scanner.nextInt();

                    System.out.print("Quantas aposta voce pretende fazer com esse deposito ");
                    int numAposta = scanner.nextInt();
                    for(int i = 0; i <= numAposta; i++ ){
                        System.out.print("Apostado! " + (i++));
                    }
                    System.out.println(" Digite quanto voce quer sacar: ");
                    double saque = scanner.nextDouble();

                    System.out.print("Olá " + nome + " " + "ficamos feliz em ter voce cadastrado em nosso site de aposta!");
                    System.out.print("  Vimos que o você deseja colocar " + deposito + " em nosso site para se divertir ");
                    System.out.print(" Voce pretende retirar " + saque + " de nosso site");
                }else
                    System.out.println("Infelizmente vc é menor de idade e nao pode fazer o cadastro neste site! ");


            } catch (InputMismatchException e){
                System.out.print("Digite o saldo sem ponto ou sem virguia e coloque em forma numerica!");
            }


    }
}
