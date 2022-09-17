package POO;


public abstract class Telefone {

    private String tipo;

    abstract public void disca(String numero);
    abstract public void toca(int numToques);

    public Telefone(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}




/*
//abstract já torna a classe abstrata, sendo classe abstrata ela também é uma superclasse
public abstract class Telefone {

    private String tipo; //atributo

    abstract public void disca(String numero);
    abstract public void toca(int numToques);

    public Telefone(String tipo){ //parametro
        this.tipo = tipo; //isto é um construtor
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
*/