import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BakeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Brookley's Better Bakery App!");
        System.out.println("We contain peanut, gluten, soy and dairy in our products");

        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: ");
        String userInput = input.nextLine().trim().toLowerCase();



        ArrayList<BakedGoodsData> bakedGoods = new ArrayList<>();

        BakedGoodsData bananaBread = new BakedGoodsData("Better Banana Bread", 12.99, "11/11/19", 4, "gluten");
        BakedGoodsData cinnamonBread = new BakedGoodsData("Cinnamon Bread", 9.99, "11/2/19", 7, "dairy");
        BakedGoodsData wheatBread = new BakedGoodsData("Neat Wheat", 4.99, "11/2/19", 5, "gluten");
        BakedGoodsData whiteBread = new BakedGoodsData("Wonderful Bread", 2.99, "11/1/19", 24, "gluten");
        BakedGoodsData peanutButterBread = new BakedGoodsData("Jiffy Bread", 5.99, "11/2/19", 3, "peanut");
        BakedGoodsData raisinBread = new BakedGoodsData("Crazin' Raisin", 12.99, "11/7/19", 5, "dairy");
        BakedGoodsData soyMuffins = new BakedGoodsData("Muffins", 9.99, "11/2/19", 7, "soy");
        BakedGoodsData cinnamonRolls = new BakedGoodsData("Cinnamon Rolls", 8.99, "11/1/19", 4, "gluten");
        BakedGoodsData savoryRolls = new BakedGoodsData("Sweet & Salty Rolls", 9.99, "11/7/19", 3, "dairy");
        BakedGoodsData blueberryMuffins = new BakedGoodsData("Bluffins", 11.99, "11/8/19", 7, "peanut");
        BakedGoodsData pizzaCrust = new BakedGoodsData("Crusty the Crust", 9.99, "11/2/19", 7, "gluten");
        BakedGoodsData frenchBread = new BakedGoodsData("French Dread", 1.99, "01/2/19", 7, "gluten");
        BakedGoodsData cake = new BakedGoodsData("Half-Caked", 20.99, "11/8/19", 4, "soy");
        BakedGoodsData donut = new BakedGoodsData("Go-nut", 9.99, "11/2/19", 7, "peanut");
        BakedGoodsData pastry = new BakedGoodsData("The Great Danish", 9.99, "11/2/19", 5, "gluten");
        BakedGoodsData pieCrust = new BakedGoodsData("Humble Pie", 12.99, "11/2/19", 7, "soy");

        Collections.addAll(bakedGoods, bananaBread, cinnamonBread, wheatBread, whiteBread, peanutButterBread, raisinBread, soyMuffins, cinnamonRolls, savoryRolls, blueberryMuffins, pizzaCrust, frenchBread, cake, donut, pastry, pieCrust);

        String[] Restrictions = new String[4];
                Restrictions[0] = "gluten";
                Restrictions[1] = "peanut";
                Restrictions[2] = "soy";
                Restrictions[3] = "dairy";


        BakeGoodsDB myGoods = new BakeGoodsDB();
        myGoods.setBakedGoods(bakedGoods);
        myGoods.displayData(userInput);
    }


}

