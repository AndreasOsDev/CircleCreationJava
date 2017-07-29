import java.util.Scanner;

public class EnkelKryptering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kryptert = "";
        System.out.println("Skriv inn setningen som ønskes kryptert");
        String original = input.nextLine();
        System.out.println("Skriv inn heltallet du skal forskyve med");
        int noekkelVerdi = input.nextInt();
        for (int i = 0; i < original.length(); i++) {
            char temp = original.charAt(i);
            if (temp <= 122 && temp >= 97) {
                temp += noekkelVerdi;
                while (temp > 122) {
                    temp -= 26;
                }
                while (temp < 97) {
                    temp += 26;
                }
            }
            kryptert += temp;
        }
        System.out.println(kryptert);
    }
}