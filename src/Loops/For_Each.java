package Loops;

public class For_Each {
    public static void main(String[] args) {
        String alunos [] = {"Nicolas", "Gabrielle", "Cristiane", "Lilian" };
        for(String aluno : alunos) { /* o 2 pontos serve para que atualize o aluno do indice atual a cada execução */
            System.out.println("O nome do aluno é " + aluno); /* a cada atualizacao a variavel aluno recebe um novo valor */
        }
    }
}

