package Modelo;

public class Trabalhador {
    private double salario;
    private double prestacao;

    public double getPrestacao() {
        return prestacao;
    }

    public void setPrestacao(double prestacao) {
        this.prestacao = prestacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean autorizacao(){
        if(salario * 0.20 < this.prestacao){
            return false;
        }
        return true;
    }

}
