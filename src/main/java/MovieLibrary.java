import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public void showMovies(){
        System.out.println(movieList);
    }
}
