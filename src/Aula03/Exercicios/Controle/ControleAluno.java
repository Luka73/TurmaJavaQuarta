package Aula03.Exercicios.Controle;
import Aula03.Exercicios.Entidades.Aluno;

public class ControleAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luana", 7.3, 8.1);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNota1());
        System.out.println(aluno1.getNota2());

        System.out.println("********************************");

        Aluno aluno2 = new Aluno("Luana Fernandes Teixeira da Silva Rodrigues Pereira");
        System.out.println(aluno2.getNome()); //nome passa de 30 caracteres

        System.out.println("********************************");

        Aluno aluno3 = new Aluno();
        aluno3.setNota1(12.5); //nota1 passa de 10
        aluno3.setNota2(-7); //nota2 menor que zero
        System.out.println(aluno3.getNota1());
        System.out.println(aluno3.getNota2());
    }
}
