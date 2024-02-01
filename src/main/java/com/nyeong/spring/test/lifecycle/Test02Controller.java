package com.nyeong.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {

	@RequestMapping("/1")
	public List<Map<String, Object>> movieInfoList(){ 
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("rate", 15);
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("title", "기생충");
		list.add(movie);
		
		movie = new HashMap<>();
		movie.put("rate", 23);
		movie.put("director", "로버트");
		movie.put("time", 131);
		movie.put("title", "인생은 아름다워");
		list.add(movie);

		Map<String, Object> movie2 = new HashMap<>();
		movie2.put("rate", 0);
		movie2.put("director", "크리스");
		movie2.put("time", 131);
		movie2.put("title", "기생충");
		list.add(movie2);
		
		Map<String, Object> movie3 = new HashMap<>();
		movie3.put("rate", 145);
		movie3.put("director", "윤종빈");
		movie3.put("time", 131);
		movie3.put("title", "범죄");
		list.add(movie3);
		
		Map<String, Object> movie4 = new HashMap<>();
		movie4.put("rate", 55);
		movie4.put("director", "프란시");
		movie4.put("time", 15);
		movie4.put("title", "헝거게임");
		list.add(movie4);
		
		return list;
	}
	
	@RequestMapping("/2")
	public List<Text> textInfo() {
		
		List<Text> textList = new ArrayList<>();
		
		Text text = new Text("안녕하세요 가입인사", "hagulu", "안녕하세요. 활동열심히");
		textList.add(text);
		
		// new로 새로운 객체 생성했기 때문에 변수이름 재사용가능. heap메모리 참고(주소를 가리킴)
		text = new Text("헐 대박", "bada", "오늘 목요일..?");
		textList.add(text);
		
		text = new Text("오늘 데이트해씀", "dudldu", "....");
		textList.add(text);
		
		return textList;
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Text> entityResponse(){
		Text textOne = new Text("하이", "nyeong", "내일 금요일 레츠기릿");
		
		ResponseEntity<Text> entity = new ResponseEntity(textOne, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
	
}
