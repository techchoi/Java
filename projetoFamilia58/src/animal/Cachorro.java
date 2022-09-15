package animal;

public class Cachorro extends Animal{



  //metodo construtor
    public Cachorro(String nome, String especie){
        super(nome,especie);
    }

    //metodo normal
    @Override
    public void emiteSom(){
        System.out.println("\nO Cachorro "+getNome()+" da espécie "+getEspecie()+" latiu");
    } //usa void pq ele só imprime e não recebe valor
    @Override
    public void locomocao(){
        System.out.println("\nO cachorro "+getNome()+" da espécie "+getEspecie()+ " Deve correr");
    }

}

