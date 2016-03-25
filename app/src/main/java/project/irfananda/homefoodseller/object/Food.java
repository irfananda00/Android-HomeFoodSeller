package project.irfananda.homefoodseller.object;

/**
 * Created by irfananda on 22/03/16.
 */
public class Food {

    private int img;
    private String name;
    private long price;
    private boolean ordered;
    private String buyer;
    private String time;

    public Food(int img, String name, long price, boolean ordered, String buyer, String time) {
        this.img = img;
        this.name = name;
        this.ordered = ordered;
        this.price = price;
        this.buyer = buyer;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
