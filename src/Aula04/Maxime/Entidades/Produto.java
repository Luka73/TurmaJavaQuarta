package Aula04.Maxime.Entidades;

public class Produto {
    private String codigo;
    private String modelo;
    private String marca;
    private double impostoFederal;
    private double valor;

    public Produto() {

    }

    public Produto(String codigo, String modelo, String marca, double impostoFederal, double valor) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.impostoFederal = impostoFederal;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getImpostoFederal() {
        return impostoFederal;
    }

    public void setImpostoFederal(double impostoFederal) {
        this.impostoFederal = impostoFederal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
