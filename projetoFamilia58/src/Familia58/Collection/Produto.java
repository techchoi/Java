package Familia58.Collection;

public class Produto {
    String nomeProduto;
    String marca;

    public Produto() {
    }

    public Produto(String nomeProduto, String marca) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
