import java.util.Date;

public class Operadores {

    public static void main(String[] args) {

        //"Atribuição" representado pelo "="
        String nome = "Anderson";
        int idade = 23;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //"Aritméticos" utilizado para realizar operações matemáticas
        double soma = 10.5 + 15.7; //OBS: Quando o operador de adição (+) é usado em variáveis do tipo texto, realizará a concatemação de textos, ou seja, juntará as palavras
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20/4);

        //"Unários" é usado juntamente com outro operador aritmético com o intuito de incrementar, decrementar, inverter valores.
        /* (+) - números positivos;
        (-) - nega um número ou expressão aritmética;
        (++) - incremento de valor em 1 unidade;
        (--) - decremento de valor em 1 unidade;
        (!) - nega o valor de um expressão booleana;
         */

        //x repetição
         int numero = 5;
         numero++;
        System.out.println(numero);

        boolean variavel = true;
        //System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);

        //"Tenário" - forma resumida para definir uma condição e escolher por um dentre dois valores, representado pelos símbolos (?:)

        int a, b;

        a = 6;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        //Relacionais - Avaliam a relação entre duas variáveis ou expressões

        //OBS: .equals compara conteudos de objetos diferentes

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente a numero2? " + simNao);

        // Lógicos - representam o recurso que nos permite criar expressões lógicas

        // && = E
        // || = OU

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("São verdadeiras");
        }

        if (condicao1 && (7 > 4)){
            System.out.println("São verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("uma das é verdadeira");
        }

        System.out.println("fim");

    }
}
