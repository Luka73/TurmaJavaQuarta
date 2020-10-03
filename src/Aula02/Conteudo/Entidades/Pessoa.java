package Aula02.Conteudo.Entidades;

public class Pessoa {
    public String nome;
    private static int count;

    public Pessoa() { //construtor default
        count = count + 1;
    }

    //Sobrecarga
    public Pessoa(String nome) {
        this.nome = nome;
        count = count + 1;
        System.out.println("Estou criando uma pesssoa chamada " + nome);
    }

    public void exibeSejaBemVindoNaTela() {
        System.out.println("Seja bem-vindo!");
    }

    public void exibeUmaMensagemNaTela(String msg) {
        System.out.println("Mensagem: " + msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getCount() {
        return count;
    }
}
