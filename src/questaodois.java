import java.util.Scanner;

public class questaodois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int countLetterA(String str) {
        int count = 0;
        String lowerCaseStr = str.toLowerCase();
        for (char c : lowerCaseStr.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }
}
