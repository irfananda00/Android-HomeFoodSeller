package project.irfananda.homefoodseller.object;

/**
 * Created by irfananda on 23/03/16.
 */
public class RequestFood {
    private String title;
    private String text;
    private String username;
    private String time;

    public RequestFood(String text, String title, String username, String time) {
        this.text = text;
        this.title = title;
        this.username = username;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
