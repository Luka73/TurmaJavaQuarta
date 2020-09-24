package Aula01.Conteudo;

import Aula01.Conteudo.Entidades.Aluno;

public class Programa {//runnable/ executável
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(); //inicializando uma "variável" --> objeto -> instância de uma classe!
        aluno1.nome = "Pedro"; //set (setter) --> atribuir
        aluno1.idade = 15;
        aluno1.sexo = "M";
        aluno1.matricula = "1921";
        aluno1.endereco = "Rua Pries, 2";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 13;
        aluno2.sexo = "F";
        aluno2.matricula = "1910";
        aluno2.endereco = "Rua Carlos, 5";

        //System.out.println("Nome do Aluno1: " + aluno1.nome); //get (getter) --> pegando/retornando
        //System.out.println("Idade do Aluno1: " + aluno1.idade);

        aluno1.mostraDadosNaTela(); //Pedro
        aluno2.mostraDadosNaTela(); //Maria

    }
}
