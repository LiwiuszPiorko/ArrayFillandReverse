import java.util.Scanner;
public class Names {

    public static void main(String[]args){

        String[] names = new String[5];
        Scanner imiona = new Scanner(System.in);
        System.out.println("Podaj pierwsze imię:");
        names[0]=imiona.nextLine();
        System.out.println("Podaj drugie imię:");
        names[1]=imiona.nextLine();
        System.out.println("Podaj trzecie imię:");
        names[2]=imiona.nextLine();
        System.out.println("Podaj czwarte imię:");
        names[3]=imiona.nextLine();
        System.out.println("Podaj piąte imię:");
        names[4]=imiona.nextLine();

        System.out.println("Cześć "+names[4]+"!"+"\nCześć "+names[3]+"!"+"\nCześć "+names[2]+"!"+"\nCześć "+names[1]+"!"+"\nCześć "+names[0]+"!");

    }
}
