package Aula01.Exercicios.Entidades;

public class Funcionario {
    public String nome;
    public String sobrenome;
    public String email;
    public int idade;

    public void mostraEmail() //assinatura
    { // corpo
        System.out.println("Email do Funcionário: " + email);
    }

    public void mostraODobroDaIdade() {
        System.out.println("O dobro da idade é: " + (idade * 2));
    }

    public void mostraNomeESobrenomeJuntos() {
        System.out.println(nome + " " + sobrenome); //Maria Silva
    }
}
