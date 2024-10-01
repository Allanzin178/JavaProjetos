package Visao;

import Modelo.Trabalhador;

import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        Trabalhador t1 = new Trabalhador();
        t1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário em R$:")));
        t1.setPrestacao(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da prestação de um emprestimo em R$:")));

        System.out.println(t1.getSalario());
        System.out.println(t1.getPrestacao());

        if(!t1.autorizacao()){
            JOptionPane.showMessageDialog(null, "Empréstimo não concedido");
        }else{
            JOptionPane.showMessageDialog(null, "Empréstimo concedido");
        }
    }
}
