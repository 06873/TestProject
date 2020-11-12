import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String entered = input.nextLine();
        for (int i = entered.length(); i > 0; i = i - 1) {
            System.out.print(entered.substring(i - 1, i));
        }
    }
}
