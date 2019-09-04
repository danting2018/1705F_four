package com.liudan.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liudan.movie.domain.Movie;
import com.liudan.movie.vo.MovieVO;


public interface MovieMapper {

	List<Movie> selects(MovieVO movievo);

	Movie getmoviebyid(@Param("id")Integer id);

	void xiugaimovie(Movie movie);
}
