package bl;

import blservice.MovieBLService;
import vo.*;

/**
 * Created by vivian on 2017/3/4.
 */
class MovieBLServiceImpl implements MovieBLService {
    private Movie movie;

    public MovieBLServiceImpl(Movie movie) {
        this.movie = movie;
    }

    @Override
    public MovieVO findMovieById(String id) {
        return movie.findMovieById(id);
    }

    @Override
    public ScoreDistributionVO findScoreDistributionByMovieId(String movieId) {
        return movie.findScoreDistributionByMovieId(movieId);
    }

    @Override
    public ReviewCountVO[] findYearCountByMovieId(String movieId) {
        return movie.findYearCountByMovieId(movieId);
    }

    @Override
    public ReviewCountVO[] findMonthCountByMovieId(String movieId, String startMonth, String endMonth) {
        return movie.findMonthCountByMovieId(movieId, startMonth, endMonth);
    }

    @Override
    public ReviewCountVO[] findDayCountByMovieId(String movieId, String startDate, String endDate) {
        return movie.findDayCountByMovieId(movieId, startDate, endDate);
    }

    @Override
    public WordVO findWordsByMovieId(String movieId) {
        return movie.findWordsByMovieId(movieId);
    }
}
