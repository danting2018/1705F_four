package com.liudan.movie.service;

import java.util.List;

import com.liudan.movie.domain.Movie;
import com.liudan.movie.vo.MovieVO;

public interface MovieService {

	List<Movie> selects(MovieVO movievo);

	Movie getmoviebyid(Integer id);

	void xiugaimovie(Movie movie);
}
