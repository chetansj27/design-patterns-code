package lld.bookmyshow.code;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Admin movieAddedBy;
    private List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }
}
