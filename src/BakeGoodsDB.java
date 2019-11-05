import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BakeGoodsDB {
    private ArrayList<BakedGoodsData> bakedGoods;

    public BakeGoodsDB(){};

    public ArrayList<BakedGoodsData> getBakedGoods() {
        return bakedGoods;
    }

    public void setBakedGoods(ArrayList<BakedGoodsData> bakedGoods) {
        this.bakedGoods = bakedGoods;
    }





    //enhanced For Loop that calls the different objects that dont contain this restriction.




    public void displayData(String userInput) {
        for( BakedGoodsData bakedItems: bakedGoods ) {
            switch (userInput) {
                case "gluten":
                    checkRestriction(bakedItems, userInput);
                    break;
                case "peanut":
                    checkRestriction(bakedItems, userInput);
                    break;
                case "soy":
                    checkRestriction(bakedItems, userInput);
                    break;
                case "dairy":
                    checkRestriction(bakedItems, userInput);
                    break;
                case "all":
                    bakedItems.displayGoods();
                    break;
                default:
                    System.out.println("invalid diet restriction");
                    break;

            }
        }
}
    private void checkRestriction(BakedGoodsData bakedItems, String userInput) {
        if(!bakedItems.getDietaryRestriction().equalsIgnoreCase(userInput)) {
            bakedItems.displayGoods();
        }
    }

}
