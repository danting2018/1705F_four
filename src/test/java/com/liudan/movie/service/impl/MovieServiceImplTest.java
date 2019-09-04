 package com.liudan.movie.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liudan.movie.domain.Movie;
import com.liudan.movie.service.MovieService;
import com.liudan.movie.vo.MovieVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {

	@Resource
	private MovieService service;
	
	@Test
	public void testSelects() {
		MovieVO vo = new MovieVO();
		vo.setMname("黑");
		
		List<Movie> selects = service.selects(vo);
		
		System.out.println(selects);
	}

}
