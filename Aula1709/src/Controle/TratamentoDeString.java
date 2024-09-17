package Controle;

public class TratamentoDeString {
    public static void main(String[] args) {
        String string1 = "TI Catolica";
        String string2 = "ti catolica";

        int comparacao = string1.compareTo(string2);

        if(comparacao == 0) System.out.println("Strings iguais");
        else if (comparacao > 0) System.out.println("String 1 maior que string 2");
        else System.out.println("String 1 menor que string 2");

        System.out.println(comparacao);

    }
}
