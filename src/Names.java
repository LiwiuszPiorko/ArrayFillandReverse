import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String[] tab = new String[5];
        Scanner imiona = new Scanner(System.in);
        System.out.println("Wpisz pięć przypadkowych imion:");
        for (int i = 0; i < tab.length; i++)
            tab[i] = imiona.nextLine();

        for (int i = tab.length-1; i>=0; i--)
            System.out.println("Cześć " + tab[i]);
    }
}

