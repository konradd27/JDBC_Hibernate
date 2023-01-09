public class Movie {
    private String title;
    private int yearOfProduction;
    private String genre;
    private int rating;

    public Movie(String title, int yearOfProduction, String genre, int rating) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.genre = genre;
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException();
        } else {
            this.rating = rating;
        }
    }
}
