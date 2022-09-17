package POO;

public class TelefoneFixo extends Telefone{

    public TelefoneFixo() {
        super("Fixo");
    }

    @Override
    public void toca(int numToques) {//3

        for(int i=0;i<numToques;i++) {
            System.out.println("\nTrimmm...trimmm");
        }
    }

    @Override
    public void disca(String numero) {
        System.out.println("\nDiscando: "+numero);
    }

}
