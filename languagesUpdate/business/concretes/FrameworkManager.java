package kodlama.io.languagesUpdate.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languagesUpdate.business.abstracts.FrameworkService;
import kodlama.io.languagesUpdate.business.requests.CreateFrameworkRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateFrameworkRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllFrameworksResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdFrameworkResponse;
import kodlama.io.languagesUpdate.core.utilities.mappers.ModelMapperService;
import kodlama.io.languagesUpdate.dataAccess.FrameworkRepository;
import kodlama.io.languagesUpdate.entities.concretes.Framework;
import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor

public class FrameworkManager implements FrameworkService{


private FrameworkRepository frameworkRepository;
private ModelMapperService modelMapperService;


@Autowired
public FrameworkManager(FrameworkRepository frameworkRepository) {
	this.frameworkRepository = frameworkRepository;
}


@Override
public List<GetAllFrameworksResponse> getAll() {

	
	List<Framework> frameworks=frameworkRepository.findAll();
	List<GetAllFrameworksResponse> frameworksResponse=frameworks.stream().map(framework->this.modelMapperService.forResponse().map(framework,GetAllFrameworksResponse.class)).collect(Collectors.toList());
	
	return frameworksResponse;
}


@Override
public void add(CreateFrameworkRequest createFrameworkRequest) {
	Framework framework=this.modelMapperService.forRequest().map(createFrameworkRequest, Framework.class);
	this.frameworkRepository.save(framework);
	
	
}


@Override
public void delete(int idFramework) {

	this.frameworkRepository.deleteById(idFramework);
	
}


public void update(UpdateFrameworkRequest updateFrameworkRequest) {
	Framework framework=this.modelMapperService.forRequest().map(updateFrameworkRequest, Framework.class);
	this.frameworkRepository.save(framework);
		
}





@Override
public GetByIdFrameworkResponse getById(int id) {

	Framework framework=this.frameworkRepository.findById(id).orElseThrow();
	GetByIdFrameworkResponse response=this.modelMapperService.forResponse().map(framework, GetByIdFrameworkResponse.class);
	return response;
}









}
