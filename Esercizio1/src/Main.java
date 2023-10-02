import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il primo numero intero");
        int n1 = input.nextInt();
        System.out.println("inserisci il secondo numero intero");
        int n2 = input.nextInt();
        System.out.println(n1 + " * " + n2 + " = " + moltiplica(n1, n2));

    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }
}