package homework.homeWork7;

import java.sql.Time;

public class Films {
    private int id;
    private String title;

    public Films(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    class Inner {
        public static final int TIRAGE = 1000000000;
        private double duration;
        private String genre;
        private String producer;

        public Inner(double duration, String genre, String producer) {
            this.duration = duration;
            this.genre = genre;
            this.producer = producer;
        }

        public Inner() {
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }
        @Override
        public String toString() {
            return "Inner{" +
                    "duration=" + duration +
                    ", genre='" + genre + '\'' +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }
}
