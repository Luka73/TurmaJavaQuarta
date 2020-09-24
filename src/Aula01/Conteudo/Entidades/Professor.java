package Aula01.Conteudo.Entidades;

public class Professor { //classe
    public String nome; //atributos
    public int idade;
    public String disciplina;
    public String endereco;

    public void mostraDadosNaTela(){ //Camel Case --> maneira de escrever colocando as primeiras letras maiúsculas
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Endereco: " + endereco);
    }
}
