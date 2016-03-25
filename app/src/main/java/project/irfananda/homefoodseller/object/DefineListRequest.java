package project.irfananda.homefoodseller.object;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irfananda on 23/03/16.
 */
public class DefineListRequest {
    private List<RequestFood> foodList = new ArrayList<>();
    private RequestFood requestFood;

    public List<RequestFood> getRequest(){
        requestFood = new RequestFood("Membutuhkan catering untuk acara pernikahan berupa ayam goreng, sop buah, es krim, dan lontong balap. Untuk pernikahan tanggal 20 Mei 2016. Untuk harga silahkan PM","Catering","irfananda", "17:03");
        foodList.add(requestFood);
        requestFood = new RequestFood("Request untuk pembuatan cake ulang tahun rasa coklat, size medium dengan topping yang menarik. Deadline besok jam 18:00","Cake","Hari","15:04");
        foodList.add(requestFood);
        requestFood = new RequestFood("Request churros bahan oreo. Deadline tidak ada.","Churros","Adhi","12:03");
        foodList.add(requestFood);
        return foodList;
    }
}
