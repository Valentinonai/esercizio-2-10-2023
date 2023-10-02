import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     perimetroRettangolo();

    }
    public static void perimetroRettangolo(){
        Scanner input=new Scanner(System.in);
        System.out.println("inserisci lunghezza primo lato rettangolo");
        double l1=Double.parseDouble(input.nextLine());
        System.out.println("inserisci lunghezza secondo lato rettangolo");
        double l2=Double.parseDouble(input.nextLine());
        System.out.println("Il perimetro del rettangolo è: "+ ((l1*2)+(l2*2)));
        input.close();
    }
}