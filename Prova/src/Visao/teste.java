package Visao;

import Modelo.OperacoesMatematicas;

public class teste {
    public static void main(String[] args) {
        OperacoesMatematicas om = new OperacoesMatematicas();
        System.out.printf("Multiplicação de %d e %d: %d\n", 2, 3, om.multiplicar(2,3));
        System.out.printf("Multiplicação de %d e %d e %d: %d\n", 2, 3, 10, om.multiplicar(2,3, 10));
        System.out.printf("Multiplicação de %.2f e %.2f: %.2f\n", 10.5, 30.8, om.multiplicar(10.5,30.8));

    }
}
