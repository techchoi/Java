package animal;

public class Preguica extends Animal {


    public Preguica(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void emiteSom(){
        System.out.println("\nA preguiça "+getNome()+" da espécie "+getEspecie()+" grita.");
    } //usa void pq ele só imprime e não recebe valor
    @Override
    public void locomocao(){
        System.out.println("\nO cachorro"+getNome()+" da espécie "+getEspecie()+ " escala árvores.");
    }

}
