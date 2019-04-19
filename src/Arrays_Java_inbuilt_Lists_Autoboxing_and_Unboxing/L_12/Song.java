package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.L_12;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": "+ this.duration;
    }
}
