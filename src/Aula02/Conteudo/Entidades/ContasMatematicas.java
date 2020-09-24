package Aula02.Conteudo.Entidades;

public class ContasMatematicas {
    public int soma(int n1, int n2) { //parâmetros
        return n1 + n2;
    }

    // sobrecarga de métodos (overloading)
    public int soma(int n1, int n2, int n3) { //assinatura
        return n1 + n2 + n3;
    }
}
