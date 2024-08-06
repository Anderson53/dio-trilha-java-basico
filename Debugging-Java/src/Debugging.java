public class Debugging {

    public static void main(String[] args) {
        System.out.println("Iniciou o programa Debugging");
        a();
        System.out.println("Finalizou o programa Debugging");
    }

    static void a() {
        System.out.println("Entrou no metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");
    }

    static void b() {
        System.out.println("Entrou no metodo b.");
        c();
        System.out.println("Finalizou o metodo b.");
    }

    static void c() {
        System.out.println("Entrou no metodo c.");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo c.");
    }
}
