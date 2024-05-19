package Estruturas_Excepcionais;

public class formatarCep {
    public static void main(String[] args) {
        try{
            String formatarCep = cepFormatado("2543050");
            System.out.print(formatarCep);
        }catch (CepInvalidoException e){
            System.out.print("O cep nao corresponde com as regras de negocio");
        }
    }
    static String cepFormatado(String cep) throws CepInvalidoException{
        if (cep.length() != 8);
        throw new CepInvalidoException();

    }
        /*return "25.43-050";*/
}
