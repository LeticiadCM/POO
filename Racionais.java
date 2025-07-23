import java.util.Scanner;

public class Racionais {

    static class tRacional {
        int numerador;
        int denominador;

        tRacional(int n, int d) {
            if (d < 0) {
                n = -n;
                d = -d;
            }
            numerador = n;
            denominador = d;
        }

        tRacional reduz() {
            int mdc = gcd(Math.abs(numerador), denominador);
            return new tRacional(numerador / mdc, denominador / mdc);
        }

        tRacional negativo() {
            return new tRacional(-numerador, denominador);
        }

        tRacional soma(tRacional outro) {
            int n = this.numerador * outro.denominador + outro.numerador * this.denominador;
            int d = this.denominador * outro.denominador;
            return new tRacional(n, d).reduz();
        }

        tRacional mult(tRacional outro) {
            int n = this.numerador * outro.numerador;
            int d = this.denominador * outro.denominador;
            return new tRacional(n, d).reduz();
        }

        tRacional div(tRacional outro) {
            int n = this.numerador * outro.denominador;
            int d = this.denominador * outro.numerador;
            if (d < 0) {
                n = -n;
                d = -d;
            }
            return new tRacional(n, d).reduz();
        }

        int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public String toString() {
            return numerador + " " + denominador;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            String op = sc.next();
            int n2 = sc.nextInt();
            int d2 = sc.nextInt();

            tRacional r1 = new tRacional(n1, d1);
            tRacional r2 = new tRacional(n2, d2);
            tRacional resultado = null;

            switch (op) {
                case "+" -> resultado = r1.soma(r2);
                case "-" -> resultado = r1.soma(r2.negativo());
                case "*" -> resultado = r1.mult(r2);
                case "/" -> resultado = r1.div(r2);
                default -> {
                }
            }

            System.out.println(resultado);
        }

        //System.out.println();
    }
}
