package animal;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal animal = new Animal("","");
        animal.emiteSom();
        animal.locomocao();
        animal = new Cachorro("Tedy","Yorkshire");
        animal.emiteSom();
        animal.locomocao();
        animal = new Cavalo("Bob Marley","Equus ferus");
        animal.emiteSom();
        animal.locomocao();
        animal = new Preguica("Lady Gaga","Bicho-preguiça");
        animal.emiteSom();
        animal.locomocao();




    }
}
