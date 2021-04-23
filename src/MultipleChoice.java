import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = ("What is my favourite colour?");
        String choiceOne = "purple";
        String choiceTwo = "red";
        String choiceThree = "green";

        String correctAnswer = choiceOne;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + " or," + choiceTwo + " or, " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (correctAnswer.equals(answer.toLowerCase())) {
            System.out.println("That's correct! " + answer + " is my favourite color");
        } else {
            System.out.println("Sorry, that is incorrect " + correctAnswer + " is my favourite colour");
        }
    }
}
