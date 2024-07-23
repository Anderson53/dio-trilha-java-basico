public class CondiçãoTernaria {

    public static void main(String[] args) {
        int nota = 7;
//          si
//        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
//
//        System.out.println(resultado);

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
