package POO;

public class AutomovelTest {

    public static void main(String[] args) {
        //instanciar a minha classe Automovel

        Automovel auto1 = new Automovel("Roberta Ribeiro","Mini Cooper","DEV2022",2022);
        Automovel auto2 = new Automovel("Camila Villares","Porch","CAM2022",2022);

        auto1.imprimirInfo();
        System.out.println("*****************Transferência de proprietaria****************");
        auto1.setNomeProprietario("Cecília");
        auto1.imprimirInfo();
        System.out.println("\n\n");
        auto2.setPlaca("CAM2E22");
        auto2.imprimirInfo();


    }
}
