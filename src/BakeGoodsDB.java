import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BakeGoodsDB {
    private ArrayList<BakedGoodsData> bakedGoods;

    private BakeGoodsDB(){};

    public ArrayList<BakedGoodsData> getBakedGoods() {
        return bakedGoods;
    }

    public void setBakedGoods(ArrayList<BakedGoodsData> bakedGoods) {
        this.bakedGoods = bakedGoods;
    }




    //enhanced For Loop that calls the different objects that dont contain this restriction.




    public static void displayData(String userInput) {
        for( Object bakedItems: bakedGoods ) {
            switch (userInput) {
                case "gluten":
                        //call objects from arrayList
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


}
