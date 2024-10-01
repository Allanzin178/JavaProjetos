package Visao;

import Modelo.Pessoa;

public class teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.setIdade(15);
        p1.setNome("Allan");

        p2.setIdade(15);
        p2.setNome("Allan");

        System.out.println(p1.equals(p2));
    }
}
