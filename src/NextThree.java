import java.util.Scanner;

public class NextThree {
    public static void main(String[] args) {
        System.out.println("Enter a number, and watch it's next 3 digits be printed: ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        int responseNum = Integer.parseInt(response);
        System.out.println(++responseNum);
        System.out.println(++responseNum);
        System.out.println(++responseNum);
    }
}
