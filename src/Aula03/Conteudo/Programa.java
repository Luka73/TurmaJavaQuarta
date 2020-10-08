package Aula03.Conteudo;

import Aula03.Conteudo.Entidades.Conta;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta("108291", "2191", 800, "Pedro");

        Conta c2 = new Conta();
        c2.setTitular("Lucia");
        c2.deposita(500); //500
        c2.deposita(200); //700
        c2.saca(100); //600


    }
}
