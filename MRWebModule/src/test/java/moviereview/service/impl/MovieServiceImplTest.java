package moviereview.service.impl;

import moviereview.repository.MovieRepository;
import moviereview.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by SilverNarcissus on 2017/5/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class MovieServiceImplTest {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieService movieService;

    @Test
    public void findMoviesByKeyword() throws Exception {

    }

    @Test
    public void findMoviesByActor() throws Exception {

    }

    @Test
    public void findMoviesByGenre() throws Exception {

    }

    @Test
    public void findMoviesByDirector() throws Exception {

    }

    @Test
    public void findLatestMovies() throws Exception {

    }

    @Test
    public void findMovieByMovieID() throws Exception {
//        System.out.println("FR"+movieService.calculate().get(0));
//        System.out.println("CN"+movieService.calculate().get(1));
    }

    @Test
    public void findGenreInfo() throws Exception {
//        System.out.println(movieService.findGenreInfo("Short", 2010));
    }

    @Test
    public void genreCount(){
        movieService.genreCount();
    }
}