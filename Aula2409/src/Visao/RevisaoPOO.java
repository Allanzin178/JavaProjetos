package Visao;

import Modelo.Gerente;

public class RevisaoPOO {
    public static void main(String[] args) {
        Gerente gestor = new Gerente();
        gestor.setNome("João da Silva");
        System.out.println(gestor.getNome());
    }
}
