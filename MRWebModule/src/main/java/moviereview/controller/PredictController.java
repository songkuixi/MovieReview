package moviereview.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import moviereview.bean.EstimateResultBean;
import moviereview.bean.PredictBean;
import moviereview.bean.PredictResultBean;
import moviereview.service.PredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kray on 2017/6/2.
 */

@Controller
@RequestMapping("/api/movie")
public class PredictController {

    @Autowired
    private PredictService predictService;

    @ResponseBody
    @RequestMapping(
            value = "/predict",
            params = {"genre", "director", "actor"},
            method = RequestMethod.GET,
            produces = {"application/json; charset=UTF-8"})
    public PredictResultBean predictMovieWeka(@RequestParam(value = "genre") String genres,
                                              @RequestParam(value = "director") String directors,
                                              @RequestParam(value = "actor") String actors) {
        return predictService.wekaPredict(constructPredictBean(genres, directors, actors));
    }

    @ResponseBody
    @RequestMapping(
            value = "/estimate",
            params = {"genre", "director", "actor"},
            method = RequestMethod.GET,
            produces = {"application/json; charset=UTF-8"})
    public EstimateResultBean estimateMovieInterval(@RequestParam(value = "genre") String genres,
                                                    @RequestParam(value = "director") String directors,
                                                    @RequestParam(value = "actor") String actors) {
        return predictService.intervalEstimation(constructPredictBean(genres, directors, actors));
    }

    private PredictBean constructPredictBean(String genres, String directors, String actors) {
        List<Integer> intGenres = new ArrayList<>();
        if (genres.contains(",")) {
            for (String g : genres.split(",")) {
                intGenres.add(Integer.parseInt(g));
            }
        } else {
            intGenres.add(Integer.parseInt(genres));
        }
        System.out.println(genres);
        List<Integer> intDirectors = new ArrayList<>();
        if (directors.contains(",")) {
            for (String d : directors.split(",")) {
                intDirectors.add(Integer.parseInt(d));
            }
        } else {
            intDirectors.add(Integer.parseInt(directors));
        }
        System.out.println(directors);
        List<Integer> intActors = new ArrayList<>();
        if (actors.contains(",")) {
            for (String a : actors.split(",")) {
                intActors.add(Integer.parseInt(a));
            }
        } else {
            intActors.add(Integer.parseInt(actors));
        }
        System.out.println(actors);
        System.out.println(intActors.size() + "," + intDirectors.size() + "," + intGenres.size());
        return new PredictBean(intActors, intDirectors, intGenres);
    }
}