package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("o problema dos 3 corpos", 300);
        System.out.println(livro1);
    }

}

class Livro {

    private String nome;
    private Integer npags;

    public Livro(String nome, Integer npags) {
        this.nome = nome;
        this.npags = npags;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npags=" + npags +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpags() {
        return npags;
    }

    public void setNpags(Integer npags) {
        this.npags = npags;
    }
}
