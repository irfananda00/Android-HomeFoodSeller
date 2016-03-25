package project.irfananda.homefoodseller.object;

import java.util.ArrayList;
import java.util.List;

import project.irfananda.homefoodseller.R;

/**
 * Created by irfananda on 22/03/16.
 */
public class DefineListFood {
    private List<Food> foodList = new ArrayList<>();
    private Food food;
    private int[] imgmedium = {
            R.drawable.starwars,
            R.drawable.ayam_bakar,
            R.drawable.ayam_goreng,
            R.drawable.burger,
            R.drawable.cake,
            R.drawable.donut,
            R.drawable.fried_rice,
            R.drawable.hotdog,
            R.drawable.makaroni,
            R.drawable.pizza
    };

    public List<Food> getFoodMenu(){
        food = new Food(imgmedium[6], "Nasi goreng", 10000, false, "Irfananda", "08:01");
        foodList.add(food);
        food = new Food(imgmedium[7], "Hotdog", 10000, false, "Hari", "09:40");
        foodList.add(food);
        food = new Food(imgmedium[2], "Ayam Goreng", 12000, false, "Adhi", "12:03");
        foodList.add(food);
        food = new Food(imgmedium[1], "Ayam Bakar", 12000, false, "Rafif", "13:14");
        foodList.add(food);
        food = new Food(imgmedium[5], "Donut", 12000, false, "Satrio", "14:40");
        foodList.add(food);
        food = new Food(imgmedium[4], "Cake", 17000, false, "Dwi", "15:05");
        foodList.add(food);
        food = new Food(imgmedium[8], "Macaroni", 17000, false, "Harianto", "17:02");
        foodList.add(food);
        food = new Food(imgmedium[9], "Pizza", 17000, false, "Satria", "19:13");
        foodList.add(food);

        return foodList;
    }

    public List<Food> getFoodDiscover(){
        food = new Food(imgmedium[6], "Nasi goreng", 10000, false, "Irfananda", "08:01");
        foodList.add(food);
        food = new Food(imgmedium[7], "Hotdog", 10000, false, "Hari", "09:40");
        foodList.add(food);
        food = new Food(imgmedium[2], "Ayam Goreng", 12000, false, "Adhi", "12:03");
        foodList.add(food);

        return foodList;
    }
}
