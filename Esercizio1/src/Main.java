import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il primo numero intero");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.println("inserisci il secondo numero intero");
        int n2 = Integer.parseInt(input.nextLine());
        System.out.println(n1 + " * " + n2 + " = " + moltiplica(n1, n2));

        System.out.println("inserisci un numero intero");
        int n3 = Integer.parseInt(input.nextLine());
        System.out.println("inserisci una stringa");
        String s1 = input.nextLine();
        System.out.println(s1 + " + " + n3 + " = " + concat(n3, s1));
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concat(int a, String b) {
        return b + a;
    }
}