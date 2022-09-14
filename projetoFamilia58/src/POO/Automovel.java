package POO;
 //definição da classe Automóvel
public class Automovel {
    //declaração dos atributos da classe

    private String nomeProprietario; //se for composto sempre primeira letra em minuscula e a segunda em Maiúscula
    private String modelo;
    private String placa;
    private  int ano;

    public Automovel(String nomeProprietario, String modelo, String placa, int ano){
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    //declaração dos demais métodos da classe


     //Get para pegar a info na string
     //Set para guardar a info na string

     public String getNomeProprietario() {
         return nomeProprietario;
     }

     public void setNomeProprietario(String nomeProprietario) {
         this.nomeProprietario = nomeProprietario;
     }

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public String getPlaca() {
         return placa;
     }

     public void setPlaca(String placa) {
         this.placa = placa;
     }

     public int getAno() {
         return ano;
     }

     public void setAno(int ano) {
         this.ano = ano;
     }

     public void imprimirInfo(){
        System.out.println(nomeProprietario+" possui um veiculo de modelo: "+modelo+" com placa: "+placa+" e ano: "+ano);


     }
 }
