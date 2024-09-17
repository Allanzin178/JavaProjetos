package Controle;

public class TratamentoDeString {
    public static void main(String[] args) {

        //----------------

        String string1 = "TI Catolica";
        String string2 = "ti catolica";

        int comparacao = string1.compareTo(string2);

        System.out.println();
        if(comparacao == 0) System.out.println("Strings iguais");
        else if (comparacao > 0) System.out.println("String 1 maior que string 2");
        else System.out.println("String 1 menor que string 2");

        System.out.println(comparacao);

        //----------------

        String url = "https://www.google.com.br";

        System.out.println();
        if(url.startsWith("www", 8)) System.out.println("É um site");
        if(url.endsWith(".br")) System.out.println("É um site do Brasil");
        if(url.startsWith("http", 0)) System.out.println("Possui proteção");

        //----------------

        String string3 = "http://ucb.br";

        System.out.println();
        System.out.println(string3.replace("http://", "https://"));

        //----------------

        String string4 = "15:33:22";

        System.out.println();
        String[] stringDividida = string4.split(":");
        for (int i = 0; i < stringDividida.length; i++){
            System.out.println(
                    "stringDividida["
                    + i
                    + "] = "
                    + stringDividida[i]);
        }

        //----------------

        //indexOf() - procura e retorna a posição onde o caractere está
        //Exemplo: indexOf('i') - busca e retorna a posição de i em uma determinada string

        //----------------

        String url1 = "https://www.ucb.br";
        String protecao = url1.substring(url1.indexOf("http"), url1.indexOf(':'));
        String dominio = url1.substring(url1.indexOf('.') + 1);
        String site = url1.substring(url1.indexOf('.') + 1, url1.lastIndexOf('.'));

        System.out.println();
        System.out.println("Proteção: " + protecao.toUpperCase());
        System.out.println("Dominio: " + dominio);
        System.out.println("Site: " + site);

        //----------------

    }
}
