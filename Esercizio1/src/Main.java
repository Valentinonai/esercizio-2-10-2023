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

        String[] arrayStr = {"prova1", "prova2", "prova3", "prova4", "prova5"};
        System.out.println("Inserisci la parola da inserire in terza posizione");
        String str = input.nextLine();
        String[] arrayStrRis = modificaArray(arrayStr, str);

        for (int i = 0; i < arrayStrRis.length; i++) {
            System.out.println("p" + (i + 1) + ": " + arrayStrRis[i] + " ");
        }
        input.close();
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concat(int a, String b) {
        return b + a;
    }

    public static String[] modificaArray(String[] array, String str) {
        String[] app = new String[6];
        int n = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                app[i] = str;
            } else {
                app[i] = array[n];
                n++;
            }
        }
        return app;
    }
}