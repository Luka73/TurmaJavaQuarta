package Aula01.Exercicios;

import Aula01.Exercicios.Entidades.Funcionario;

public class Programa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Pedro";
        f1.sobrenome = "Rodrigues";
        f1.idade = 32;
        f1.email = "pedro@gmail.com";

        Funcionario f2 = new Funcionario();
        f2.nome = "Lucia";
        f2.sobrenome = "Helena";
        f2.idade = 29;
        f2.email = "lucia@gmail.com";

        f1.mostraEmail(); //pedro@gmail.com
        f2.mostraEmail(); //lucia@gmail.com

        f1.mostraODobroDaIdade(); //64
        f2.mostraODobroDaIdade(); //58

        f1.mostraNomeESobrenomeJuntos(); //Pedro Rodrigues
        f2.mostraNomeESobrenomeJuntos(); //Lucia Helena
    }
}
