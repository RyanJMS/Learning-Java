import java.util.Scanner;

public class Recipe {

        public static void makeCookie(int cookie){

            int butter = cookie * 1;
            int brownSugar = cookie * 1;
            int molasses = cookie * 1;
            int eggs = cookie * 2;
            double flour = (cookie / 3.0) ;
            double bakingSoda = (cookie /4.0) ;
            double cinnamon = (cookie  /4.0) ;
            int ginger = cookie * 1;

            System.out.println("1) Mix " + butter + " Tablespoons of butter with " +
                    brownSugar + " Tablesoons of brown sugar");
            System.out.println("2) Add " + molasses + " Tablespoons of molasses and " +
                    eggs + " Teaspoons of eggs and mix well!");
            System.out.println("3) Add " + flour + " cups of flour and " +
                    bakingSoda + " Teaspoons baking soda (Don't mix yet");
            System.out.println("4) Add " + cinnamon + " Teaspoons of cinnamon, and " +
                    ginger + " pinches of ginger and mix well");
            System.out.println("Put a little flour on the table and flatten out your dough." +
                            "Cut your Gingerbread men with a cookie cutter");
            System.out.println("6) Place your Gingerbread men on an ungreased cookie sheet. " +
                    "Bake at 350 degrees for 8-10 minutes");
        }

    public static void main(String[] args) {
        System.out.println("How many cookies do you want?: ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        int numResponse = Integer.parseInt(response);
        makeCookie(numResponse);
    }
}
