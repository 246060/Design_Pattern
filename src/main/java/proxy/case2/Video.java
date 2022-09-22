package proxy.case2;

public class Video {

    private String id;
    private String title;
    private String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random Video.";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }
}
