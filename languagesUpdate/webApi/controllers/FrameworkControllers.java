package kodlama.io.languagesUpdate.webApi.controllers;

import java.util.List;

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

import kodlama.io.languagesUpdate.business.abstracts.FrameworkService;
import kodlama.io.languagesUpdate.business.requests.CreateFrameworkRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateFrameworkRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllFrameworksResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdFrameworkResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/frameworks")
@AllArgsConstructor


public class FrameworkControllers {

	
	private FrameworkService frameworkService;
	
	@GetMapping("/getAll")
	public List<GetAllFrameworksResponse> getAll(){ 
		return this.frameworkService.getAll();
		
	}

	@GetMapping("/{id}")
	public GetByIdFrameworkResponse getById(@PathVariable int id){ 
		return this.frameworkService.getById(id);
		
	}

	@PutMapping("/update")
	public void update(@RequestBody() UpdateFrameworkRequest updateFrameworkRequest) {
		this.frameworkService.update(updateFrameworkRequest);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.frameworkService.delete(id);
	}



	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(CreateFrameworkRequest createFrameworkRequest) throws Exception {
		this.frameworkService.add(createFrameworkRequest);
	}
	
	
	
	
	
	
	
	
}
