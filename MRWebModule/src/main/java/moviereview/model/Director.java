package moviereview.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Kray on 2017/5/14.
 */

@Entity
@Table(name = "tmdb_director")
public class Director implements Serializable {

    @Id
    /**
     * 人物 id
     */
    private int tmdbpeopleid;

    /**
     * 导演名字
     */
    private String name;

    /**
     * 海报后缀
     */
    private String profile;

    /**
     * 人物热度
     */
    private double popularity;

    public int getTmdbpeopleid() {

        return tmdbpeopleid;
    }

    public void setTmdbpeopleid(int tmdbpeopleid) {
        this.tmdbpeopleid = tmdbpeopleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

//    @ManyToMany(mappedBy = "tmdb_director")
//    private List<Movie> movies = new ArrayList<>();

    public Director() {
    }
}
