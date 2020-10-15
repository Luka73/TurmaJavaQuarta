package Aula04.Maxime.Entidades;

import java.time.LocalDate;

public class Boleto {
    private String comprador; //Camel Case
    private double valor;
    private LocalDate vencimento;
    private final double TAXA = 2.00; //constantes --> final
    private final int PRAZO = 5;

    public String getComprador() {
        return comprador.toUpperCase(); //Devs que trabalham na Oracle
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public double getValor() {
        return valor + TAXA;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        setVencimento();
        return vencimento;
    }

    private void setVencimento() {
        LocalDate hoje = LocalDate.now();
        this.vencimento = hoje.plusDays(PRAZO);
    }
}
