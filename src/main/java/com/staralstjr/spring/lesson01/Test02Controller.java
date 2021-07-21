package com.staralstjr.spring.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/lesson01/test02")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> movieList(){
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("title", "기생충");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 0);
		movie.put("director", "로베르토 베니니");
		movie.put("time", 116);
		movie.put("title", "인생은 아름다워");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 12);
		movie.put("director", "크리스토퍼 놀란");
		movie.put("time", 147);
		movie.put("title", "인셉션");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 19);
		movie.put("director", "윤종빈");
		movie.put("time", 133);
		movie.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "프란시스 로렌스");
		movie.put("time", 137);
		movie.put("title", "헝거게임");
		movieList.add(movie);
		
		return movieList;
	}
	
	@RequestMapping("/2")
	public List<BoardContent> boardList(){
		List<BoardContent> boardList = new ArrayList<>();
		
		BoardContent content = new BoardContent("안녕하세요 가입인사 드립니다."
				, "hagulu", "안녕하세요 가입했어요 앞으로 잘 부탁 드려요");
	
		boardList.add(content);
		
		return boardList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<BoardContent> entity() {
		
		BoardContent content = new BoardContent("안녕하세요 가입인사 드립니다."
				, "hagulu", "안녕하세요 가입했어요 앞으로 잘 부탁 드려요");
		ResponseEntity<BoardContent> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}

}
