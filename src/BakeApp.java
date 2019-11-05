import java.util.Scanner;

public class BakeApp {

    public static void main(String[] args) {
        Scanner input =   new Scanner(System.in);

        System.out.println("Welcome to Brookley's Better Bakery App!");
        System.out.println("We contain peanut, gluten, soy and dairy in our products");

        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: ");
        String userInput = input.nextLine().trim().toLowerCase();
        BakeGoodsDB.checkRestriction(userInput);
    }
}
