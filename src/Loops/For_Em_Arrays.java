package Loops;

public class For_Em_Arrays {
    public static void main(String[] args) {
        String alunos [] = {"Nicolas", "Gabrielle", "Cristiane", "Lilian" };
        for(int x = 0; x <alunos.length; x++) { /*Sempre quando for arrey, comece com 0, por isso x=0 */
            System.out.println("Os alunos do indice x=" + x + "é" + alunos[x]);  /* length é para contar */
        }
    }
}
