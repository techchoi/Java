package animal;

public class Animal {

    private String especie;
    private String nome;


    public Animal(String nome, String especie) {
        this.setEspecie(especie);
        this.setNome(nome);

    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emiteSom(){System.out.println("Barulho de animal");}
    public void locomocao(){System.out.println("Movimento do animal");}

}