public class ExemploBreakContinue {
    /**
     * O comando break interrompe o laço, já o continue interrompe somente a iteração atual.
     * */
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; //ou continue
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
        
    }
}
