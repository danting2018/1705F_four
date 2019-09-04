package com.liudan.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liudan.movie.domain.Movie;
import com.liudan.movie.service.MovieService;
import com.liudan.movie.vo.MovieVO;

@Controller
public class MovieController {

	@Resource
	private MovieService service;
	
	//展示所有的列表
	@RequestMapping("list")
	public String list(Model m,MovieVO movievo,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 2);
		List<Movie> list = service.selects(movievo);
		PageInfo info = new PageInfo(list);
		m.addAttribute("list", list);		
		m.addAttribute("movievo", movievo);		
		m.addAttribute("info", info);		
		return "list";
	}
	
//	做详情的方法
	@RequestMapping("xiangqin")
	public Object xiangqin(Integer id,Model m){
		Movie movie = service.getmoviebyid(id);
		m.addAttribute("movie", movie);
		return "xiangqin";
	}
	
//	做修改的方法
	@RequestMapping("updatemovie")
	public Object updatemovie(Integer id,Model m){
		Movie movie = service.getmoviebyid(id);
		m.addAttribute("movie", movie);
		return "back";
	}
	
//	做修改的方法
	@RequestMapping("xiugaimovie")
	public String xiugaimovie(Movie movie) {
		
		service.xiugaimovie(movie);
		return "redirect:list";
	}
	
	
}
