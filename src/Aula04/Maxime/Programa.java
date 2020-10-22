package Aula04.Maxime;

import Aula04.Maxime.Entidades.Boleto;
import Aula04.Maxime.Entidades.Produto;
import Aula04.Maxime.Entidades.Registradora;

public class Programa {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setCodigo("01");
        prod1.setModelo("Mouse");
        prod1.setMarca("Microsoft"); // 01/A4 - Canon
        prod1.setValor(10);
        prod1.setImpostoFederal(6.00);
        prod1.setImpostoProvincial(1.00); //17

        Produto prod2 = new Produto();
        prod2.setCodigo("02");
        prod2.setModelo("Teclado");
        prod2.setMarca("LogTech"); // 02/A3 - HP
        prod2.setValor(15);
        prod2.setImpostoFederal(4.00);
        prod2.setImpostoProvincial(1.00); // 20

        Produto prod3 = new Produto();
        prod3.setCodigo("03");
        prod3.setModelo("Impressora");
        prod3.setMarca("OfficeJet"); // 03/A5 - OfficeJet
        prod3.setValor(80);
        prod3.setImpostoFederal(7.00);
        prod3.setImpostoProvincial(1.00); // 88

        Registradora r1 = new Registradora();
        r1.addProduto(prod1);
        r1.addProduto(prod2);
        r1.addProduto(prod3);

        System.out.println("Produto 1: " + r1.getNomeDoProduto(prod1));
        System.out.println("Produto 2: " + r1.getNomeDoProduto(prod2));
        System.out.println("Produto 3: " + r1.getNomeDoProduto(prod3));

        System.out.println("Total a pagar: R$" + r1.getTotal());

        Boleto b1 = new Boleto();
        b1.setComprador("Luana Fernandes");
        b1.setTaxa(3.00); //Itaú
        b1.setValor(r1.getTotal()); //R$125,00 + 3.00= R$128,00
                                    // R$118,00
        b1.AplicaDesconto(10.00, true);

        System.out.println("Nome do Comprador: " + b1.getComprador());
        System.out.println("Valor do boleto: R$" + b1.getValor());
        System.out.println("Vencimento do boleto: " + b1.getVencimento());

    }
}
