package module10;

public class CheckedVsNoChecked {

    public static void main(String[] args) throws Exception{
        try{
            geraErro1();
        } catch (RuntimeException e){
            System.out.println("Erro ao gerar erro 1:" + e.getMessage());
        }


        geraErro2();

        System.out.println("Fim");
    }

    // Exceção não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro #01");
    }

    // Exceção verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro #02");
    }
}
