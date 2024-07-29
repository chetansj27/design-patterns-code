package lld.bookmyshow.code;

import java.util.List;

public interface Search {
    List<Movie> searchByTitle(String title);
    List<Movie> searchByLanguage(String language);
    List<Movie> searchByGenre(String genre);
    List<Movie> searchByCity(String cityName);
}
