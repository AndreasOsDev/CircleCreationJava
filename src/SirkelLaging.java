import java.util.Scanner;

public class SirkelLaging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int r;
        System.out.println("Skriv inn en ønsket heltall radius større enn 1");
        do {
            while (!input.hasNextInt()) {
                System.out.println("Du må skrive inn et heltall. Programmet avsluttes");

                System.exit(0);

            }
            r = input.nextInt();
            if (r < 1) {
                System.out.println("Tallet må være positivt, Programmet avsluttes");
                System.exit(0);
            }
        } while (r < 0);

        for (y = -r; y < 2 * r; y++) {
            for (x = -r; x < 2 * r; x++) {
                if ((x * x) + (y * y) <= (r + 0.3) * (r + 0.3)) {
                    System.out.print("**");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
