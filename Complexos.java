import java.util.Scanner;

public class Complexos {
    private int real;
    private int imaginario;

    public Complexos(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexos soma(Complexos outro) {
        return new Complexos(this.real + outro.real, this.imaginario + outro.imaginario);
    }

    public Complexos subtrai(Complexos outro) {
        return new Complexos(this.real - outro.real, this.imaginario - outro.imaginario);
    }

    public Complexos multiplica(Complexos outro) {
        int r = this.real * outro.real - this.imaginario * outro.imaginario;
        int i = this.real * outro.imaginario + this.imaginario * outro.real;
        return new Complexos(r, i);
    }

    public Complexos divide(Complexos outro) {
        int denominador = outro.real * outro.real + outro.imaginario * outro.imaginario;
        int r = (this.real * outro.real + this.imaginario * outro.imaginario) / denominador;
        int i = (this.imaginario * outro.real - this.real * outro.imaginario) / denominador;
        return new Complexos(r, i);
    }

    @Override
    public String toString() {
        return this.real + (this.imaginario >= 0 ? " +" : " ") + this.imaginario + "i";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            String biStr = scanner.next();
            int b = Integer.parseInt(biStr.replace("i", ""));
            String operador = scanner.next();
            int c = scanner.nextInt();
            String diStr = scanner.next();
            int d = Integer.parseInt(diStr.replace("i", ""));

            Complexos m1 = new Complexos(a, b);
            Complexos m2 = new Complexos(c, d);
            Complexos resultado = null;

            switch (operador) {
                case "+":
                    resultado = m1.soma(m2);
                    break;
                case "-":
                    resultado = m1.subtrai(m2);
                    break;
                case "*":
                    resultado = m1.multiplica(m2);
                    break;
                case "/":
                    resultado = m1.divide(m2);
                    break;
           }

            System.out.println(resultado);
        }
    }
}
