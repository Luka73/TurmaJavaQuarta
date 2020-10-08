package Aula03.Exercicios.Entidades;

public class Aluno {
    private String nome; // --> proteger!!!
    private double nota1;
    private double nota2;

    public Aluno() {

    }

    public Aluno(String nome) {
        setNome(nome);
    }

    public Aluno(String nome, double nota1, double nota2) { //overloading
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
    }

    //Metodos acessores (getters e setters) --> Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30) {
           this.nome = nome;
        } else {
            System.out.println("O nome deve ter até 30 caracteres");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 >= 0 && nota1 <= 10 )
            this.nota1 = nota1;
        else
            System.out.println("A nota deve estar entre 0 e 10.");
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 >= 0 && nota2 <= 10 )
            this.nota2 = nota2;
        else
            System.out.println("A nota deve estar entre 0 e 10.");
    }

}
