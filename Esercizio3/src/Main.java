import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("inserisci lunghezza primo lato rettangolo");
        double l1=Double.parseDouble(input.nextLine());
        System.out.println("inserisci lunghezza secondo lato rettangolo");
        double l2=Double.parseDouble(input.nextLine());
        perimetroRettangolo(l1,l2);

        System.out.println("inserisci un numero");
        int n1=Integer.parseInt(input.nextLine());
        pariEdispari(n1);

        System.out.println("inserisci lunghezza primo lato rettangolo");
        l1=Double.parseDouble(input.nextLine());
        System.out.println("inserisci lunghezza secondo lato rettangolo");
        l2=Double.parseDouble(input.nextLine());
        System.out.println("inserisci lunghezza terzo lato rettangolo");
        double l3=Double.parseDouble(input.nextLine());
        areaTriangolo(l1,l2,l3);
        input.close();
    }
    public static void perimetroRettangolo(double l1,double l2){

        System.out.println("Il perimetro del rettangolo è: "+ ((l1*2)+(l2*2)));

    }
    public static void pariEdispari(int n1){

        if(n1%2==0)
            System.out.println("0-->Il numero è pari");
        else System.out.println("1-->Il numero è dispari");

    }

    public static void areaTriangolo(double l1,double l2,double l3){
        double semiP=(l1+l2+l3)/2;
        double area=Math.sqrt(semiP*(semiP-l1)*(semiP-l2)*(semiP-l3));
        System.out.println("L'area del triangolo è: "+ area);
    }
}