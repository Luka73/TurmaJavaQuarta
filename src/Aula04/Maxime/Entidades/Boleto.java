package Aula04.Maxime.Entidades;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Boleto {
    private String comprador; //Camel Case
    private double valor;
    private LocalDate vencimento;
    private double taxa;
    private final int PRAZO = 5; //constantes --> final

    public String getComprador() {
        return comprador.toUpperCase(); //Devs que trabalham na Oracle
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public double getValor() {
        return valor + taxa;
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
        vencimento = hoje.plusDays(PRAZO);

        if(vencimento.getDayOfWeek() == DayOfWeek.SATURDAY) {
            vencimento = vencimento.plusDays(2);
        } else if(vencimento.getDayOfWeek() == DayOfWeek.SUNDAY) {
            vencimento = vencimento.plusDays(1);
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void AplicaDesconto(double desconto, boolean ehPorcentagem) {
        this.valor -= (ehPorcentagem) ? (valor * desconto) / 100 : desconto;
    }
}
