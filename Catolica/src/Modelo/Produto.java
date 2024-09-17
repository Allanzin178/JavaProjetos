package Modelo;

import javax.swing.JOptionPane;

public class Produto {
    private double num1;
    private double num2;
    private double num3;


    public void Registro(){
        this.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: ")));
        this.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: ")));
        this.setNum3(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro número: ")));
    }

    public void Comparar(){
        double temp;
        if(num2 < num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num3 < num2){
             temp = num3;
             num3 = num2;
             num2 = temp;
        }
        if(num2 < num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }








    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the num3
     */
    public double getNum3() {
        return num3;
    }

    /**
     * @param num3 the num3 to set
     */
    public void setNum3(double num3) {
        this.num3 = num3;
    }



}
