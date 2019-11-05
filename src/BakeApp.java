import java.util.Scanner;

public class BakeApp {

    public static void main(String[] args) {
        Scanner input =   new Scanner(System.in);

        System.out.println("Welcome to Brookley's Better Bakery App!");
        System.out.println("We contain peanut, glueten, soy and dairy in our products");

        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: ");
        String userInput = input.nextLine().trim().toLowerCase();

        switch(userInput){
            case "gluten":
                //call objects from bakedGoodsDB that do not contain this
            case "peanut":
                //call objects from bakedGoodsDB that do not contain this
            case "soy":
                //call objects from bakedGoodsDB that do not contain this
            case "dairy":
                //call objects from bakedGoodsDB that do not contain this
            case "all":
                //calls all objects.
            default:
                System.out.println("invalid diet restriction");

        }
    }
}
