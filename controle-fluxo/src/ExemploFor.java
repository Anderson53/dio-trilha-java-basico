public class ExemploFor {

    public static void main(String[] args) {
//        for (int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
//            System.out.println("Contando carneirinhos " + carneirinhos);
//        }
//
//        System.out.println("Joaozinho dormiu");
//    }
//        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
//        System.out.print(nomes.length);

//        for (int x = 1; x <= 10; x++) {
//            if (x % 2 == 0) //% operador que representa módulo de uma divisão
//                System.out.println(x);
//        }

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}
