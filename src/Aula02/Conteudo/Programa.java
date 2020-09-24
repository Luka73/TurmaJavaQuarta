package Aula02.Conteudo;

import Aula02.Conteudo.Entidades.ContasMatematicas;
import Aula02.Conteudo.Entidades.Funcionario;

public class Programa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(); //construtor
        f1.nome = "Pedro";
        f1.sobrenome = "Rodrigues";
        f1.idade = 32;
        f1.email = "pedro@gmail.com";

        Funcionario f2 = new Funcionario("Lucia", " Helena", "lucia@gmail.com", 29);
        Funcionario f3 = new Funcionario("thiago@gmail.com");

        ContasMatematicas cm = new ContasMatematicas();

        int resultado = cm.soma(9, 5); //Nada!
        System.out.println("O resultado é: " + resultado);
        System.out.println("O resultado é: " + cm.soma(8, 2));
        System.out.println("O resultado é: " + cm.soma(4, 3, 7));

       /* System.out.println("Teste String"); //String
        System.out.println(4); //int
        System.out.println(5.3); //double
        System.out.println(true); //boolean
        System.out.println(cm); //object*/
    }
}
