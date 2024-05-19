package Loops;
import java.util.Random;
public class DO_While {
        public static void main(String[] args) {
            System.out.print("Discando");
            do {
                System.out.print("Telefone tocando");
            } while (tocando());
            System.out.print("Alo");
        }

        private static boolean tocando() {
            boolean atendeu = new Random().nextInt(3) == 1;
            System.out.print("Atendeu: " + atendeu);
            /* ABAIXO VOU NEGAR COM O OPERADOR "!" O ATO DE TOCAR SE ELE ATENDER */
            return !atendeu;
        }
    }