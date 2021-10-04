package hu.me.iit.webalk.first;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(path="article")
public class MainController{
	private List<ArticleDto> articles = new ArrayList<>();

	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

	List<ArticleDto> allArtiles() {
		return articles;
	}

	@PostMapping(path = "")
	public void newArticle(@RequestBody ArticleDto articleDto) {
		articles.add(articleDto);
	}
	
	@PutMapping(path = "{id}")
	public void replaceArticle(@PathVariable("id") String id, @RequestBody ArticleDto articleDto) {
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteArticle(@PathVariable("id") String id) {
		int found = -1;
		for (int i = 0 ; i <  articles.size(); i++) {
			if (articles.get(i).getTitle().equals(id)) {
				found = i;
				break;
			}
		}
	}
		
		private int FindArticle(@PathVariable("id") String id) {
			int found = -1;
			for (int i = 0 ; i <  articles.size(); i++) {
				if (articles.get(i).getTitle().equals(id)) {
					found = i;
					break;
				}
			}
		return found;	
		
		if (found != -1) {
			ArticleDto foundArticle = articles.get(found);
			foundArticle.setAuthor(articleDto.getAuthor());
			foundArticle.setPages(articleDto.getPages());
			
		}
	}

	@ResponseBody
	ResponseDto gyoker() {
		ResponseDto responseDto = new ResponseDto();

		responseDto.setId(123);
		responseDto.setMessage("hello");
		return responseDto;
	}

}
