import java.util.Scanner;

public class Names {
    public static void main(String[] args){
        String[] tab = new String[5];

        Scanner imiona = new Scanner(System.in);

        for(int i=0; i<5; i++)
            tab[i] = imiona.nextLine();

        for(int i=0; i<5; i++)
            System.out.println("Cześć "+tab[i]);
    }
}

