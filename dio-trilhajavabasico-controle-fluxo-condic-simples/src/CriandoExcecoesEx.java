public class CriandoExcecoesEx {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("256655");
                    System.out.println(cepFormatado);
        } catch (CriandoExcecoes e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde as regras de negócios");        }

    }

    static String formatarCep(String cep) throws CriandoExcecoes{
        if(cep.length() != 8)
          throw new CriandoExcecoes();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
