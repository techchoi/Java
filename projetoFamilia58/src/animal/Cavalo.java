package animal;

public class Cavalo extends Animal{


    public Cavalo(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public void emiteSom(){
        System.out.println("\nO Cavalo "+getNome()+" da espécie "+getEspecie()+" gruniu");
    } //usa void pq ele só imprime e não recebe valor
    @Override
    public void locomocao(){
        System.out.println("\nO cavalo "+getNome()+" da espécie "+getEspecie()+ " Deve correr");
    }

}
