package com.liudan.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liudan.movie.dao.MovieMapper;
import com.liudan.movie.domain.Movie;
import com.liudan.movie.service.MovieService;
import com.liudan.movie.vo.MovieVO;
@Service
public class MovieServiceImpl implements MovieService {

	@Resource
	private MovieMapper mapper;
	
	@Override
	public List<Movie> selects(MovieVO movievo) {
		// TODO Auto-generated method stub
		return mapper.selects(movievo);
	}

	@Override
	public Movie getmoviebyid(Integer id) {
		// TODO Auto-generated method stub
		return mapper.getmoviebyid(id);
	}

	@Override
	public void xiugaimovie(Movie movie) {

		mapper.xiugaimovie(movie);
	}

}
