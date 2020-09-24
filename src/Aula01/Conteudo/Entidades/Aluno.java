package Aula01.Conteudo.Entidades;

public class Aluno {//classe --> abstração
    public String nome; //atributos
    public int idade;
    public String sexo;
    public String matricula;
    public String endereco;

    //Case Sensive --> diferencia maíusculas de minúsculas
    public void mostraDadosNaTela(){ //Camel Case --> maneira de escrever colocando as primeiras letras maiúsculas
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Endereco: " + endereco);
    }

}
