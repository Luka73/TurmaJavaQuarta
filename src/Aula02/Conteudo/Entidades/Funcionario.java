package Aula02.Conteudo.Entidades;

public class Funcionario {
    public String nome;
    public String sobrenome;
    public String email;
    public int idade;

    public Funcionario(){ //construtor default

    }

    public Funcionario(String email){
        this.email = email;
    }

    public Funcionario(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public String retornaNomeESobrenomeJuntos() {
        return nome + " " + sobrenome;
    }
}
