package Aula04.Maxime;

import Aula04.Maxime.Entidades.Produto;
import Aula04.Maxime.Entidades.Registradora;

public class Programa {
    public static void main(String[] args) {
        Produto papel1 = new Produto();
        papel1.setCodigo("01");
        papel1.setModelo("A4");
        papel1.setMarca("Canon"); // 01/A4 - Canon
        papel1.setValor(10);
        papel1.setImpostoFederal(6.70); //16.70

        Produto papel2 = new Produto();
        papel2.setCodigo("02");
        papel2.setModelo("A3");
        papel2.setMarca("HP"); // 02/A3 - HP
        papel2.setValor(15);
        papel2.setImpostoFederal(4.50); //19.50

        Produto papel3 = new Produto();
        papel3.setCodigo("03");
        papel3.setModelo("A5");
        papel3.setMarca("OfficeJet"); // 03/A5 - OfficeJet
        papel3.setValor(11);
        papel3.setImpostoFederal(2.10); //13.10

        Registradora r1 = new Registradora();
        r1.addProduto(papel1);
        r1.addProduto(papel2);
        r1.addProduto(papel3);

        System.out.println("Produto 1: " + r1.getNomeDoProduto(papel1));
        System.out.println("Produto 2: " + r1.getNomeDoProduto(papel2));
        System.out.println("Produto 3: " + r1.getNomeDoProduto(papel3));

        System.out.println("Total a pagar: " + r1.getTotal());

    }
}
