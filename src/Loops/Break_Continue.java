package Loops;

public class Break_Continue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                break; /*o break encerra o loop quando chega no numero de comparação que é o 3*/
            System.out.println(numero);
        }
        System.out.println("__________________________________");


        for(int number = 1; number <=5; number++) {
            if(number == 3)
                continue; /* o continue ele anula o numero 3, porem da continuidade com o loop*/
            System.out.println(number);
        }
    }
}

