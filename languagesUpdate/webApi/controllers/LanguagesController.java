package kodlama.io.languagesUpdate.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.languagesUpdate.business.abstracts.LanguageService;
import kodlama.io.languagesUpdate.business.requests.CreateLanguageRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateLanguageRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllLanguagesResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor


public class LanguagesController {
@Autowired
	private LanguageService languageService;
	
	@GetMapping("/getAll")
	public List<GetAllLanguagesResponse> getAll(){ 
		return languageService.getAll();
		
	}

	@GetMapping("/{id}")
	public GetByIdLanguageResponse getById(@PathVariable int id){ 
		return languageService.getById(id);
		
	}

	@PutMapping("/update")
	public void update(@RequestBody() UpdateLanguageRequest updateLangaugeRequest) {
		this.languageService.update(updateLangaugeRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.languageService.delete(id);
	}



	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		this.languageService.add(createLanguageRequest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
