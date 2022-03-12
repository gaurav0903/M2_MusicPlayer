
public class Song {
  String title1;
  double duration1;

    public Song(String title, double duration) {
        this.title1 = title;
        this.duration1 = duration;
    }
   

    public String getTitle() {
        return title1;
    }

    public double getDuration() {
        return duration1;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title1 + '\'' +
                ", duration=" + duration1 +
                '}';
    }
}
