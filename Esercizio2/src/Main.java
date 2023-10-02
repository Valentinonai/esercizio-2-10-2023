import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Inserisci prima stringa");
        String str1=input.nextLine();
        System.out.println("Inserisci seconda stringa");
        String str2=input.nextLine();
        System.out.println("Inserisci terza stringa");
        String str3=input.nextLine();

        print(str1,str2,str3);
        reverse(str1,str2,str3);

        input.close();
    }

    public static void print(String str1, String str2, String str3){
        System.out.println(str1+" "+str2+" "+str3);
    }
    public static void reverse(String str1, String str2, String str3){
        System.out.println(str3+" "+str2+" "+str1);
    }
}