package Aula04.Maxime.Entidades;

public class Registradora {
    private double total;

    public Registradora(){

    }

    public double getTotal() {
        return total;
    }

    public void addProduto(Produto produto) {
        total += produto.getPreco();
    }

    public String getNomeDoProduto(Produto produto) {
        //código/modelo – marca
        String nome = produto.getCodigo() + "/" + produto.getModelo() + " - " + produto.getMarca();
        return nome;
    }
}
