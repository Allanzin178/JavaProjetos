package Modelo;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean equals(Pessoa p1) {
        if(this.getIdade() == p1.getIdade() && this.getNome() == p1.getNome()){
            return true;
        }
        return false;
    }


}
