package EXERCICIO1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Nina Menina Coreana","0101010101-8","Rua zero", LocalDate.of( 1994 , Month.JULY , 20 ));

        cliente1.imprimirInfo();
        System.out.println("=============================Dados do cliente==============================");
        cliente1.setNomeCompleto("\n");
        cliente1.imprimirInfo();
        System.out.println("\n\n");
        cliente1.setEndereco("");
        cliente1.imprimirInfo();


    }
}
