public class ResultadoEscolarTernaria {
    
    public static void main(String[] args) {
        
        int nota = 4;

        //String resultado = nota >= 7 ? "Aprovado" : "reprovado";
        //System.out.println(resultado);

        String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota > 7 ? "recuperacao" : "reprovado";
        System.out.println(resultado);
    }
}
