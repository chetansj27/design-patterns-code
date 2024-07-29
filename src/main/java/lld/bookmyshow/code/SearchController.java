package lld.bookmyshow.code;

import java.util.HashMap;
import java.util.List;

public class SearchController implements Search {
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;
    HashMap<String, List<Movie>> movieCities;

    @Override
    public List<Movie> searchByTitle(String title) {
        return movieTitles.get(title);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.get(language);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return movieGenres.get(genre);
    }


    @Override
    public List<Movie> searchByCity(String cityName) {
        return movieCities.get(cityName);
    }
}
