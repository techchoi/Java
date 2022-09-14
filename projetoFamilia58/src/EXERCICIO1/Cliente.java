package EXERCICIO1;


/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Cliente {

    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private LocalDate dataDeNascimento;



    public Cliente (String nomeCompleto,String cpf, String endereco,LocalDate dataDeNascimento){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;

    }

    public void imprimirInfo(){
        System.out.println(nomeCompleto+" "+cpf+" "+endereco+" "+dataDeNascimento);
    }
}
