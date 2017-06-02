package moviereview.service.impl;

import moviereview.model.User;
import moviereview.repository.MovieRepository;
import moviereview.repository.UserRepository;
import moviereview.service.RecommendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by SilverNarcissus on 2017/5/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class RecommendServiceImplTest {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RecommendService recommendService;

    @Test
    public void basicTest() throws Exception {
        User user = userRepository.findUserById(0);
        System.out.println(user);
    }

    @Test
    public void everyDayRecommend() throws Exception {
        System.out.println(recommendService.everyDayRecommend(0, 4));
    }

    @Test
    public void finishSeeingRecommend() throws Exception {

    }

    @Test
    public void latestRecommend() {
        System.out.println(recommendService.getNewMovie(6));
    }

    @Test
    public void findSimilarMovie(){
        //System.out.println(recommendService.findSimilarMovie("\"#Awkward Dates\" (2016)", 5));
        System.out.println(recommendService.findSimilarMovie(12, 4));
    }
}