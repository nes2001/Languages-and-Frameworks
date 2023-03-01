package kodlama.io.languagesUpdate.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languagesUpdate.business.abstracts.LanguageService;
import kodlama.io.languagesUpdate.business.requests.CreateLanguageRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateLanguageRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllLanguagesResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdLanguageResponse;
import kodlama.io.languagesUpdate.core.utilities.mappers.ModelMapperService;
import kodlama.io.languagesUpdate.dataAccess.LanguageRepository;
import kodlama.io.languagesUpdate.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	
	
	
	public List<GetAllLanguagesResponse> getAll() {

		List<Language> languages=languageRepository.findAll();
		List<GetAllLanguagesResponse> languageResponse= new ArrayList<GetAllLanguagesResponse>();
		return languageResponse;
		
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
Language language=this.modelMapperService.forRequest().map(createLanguageRequest,Language.class);
		this.languageRepository.save(language);
	}

	@Override
	public void delete(int idLanguage) {
this.languageRepository.deleteById(idLanguage);		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
Language language=this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
this.languageRepository.save(language);
		
	}











	@Override
	public GetByIdLanguageResponse getById(int id) {

		Language language=this.languageRepository.findById(id).orElseThrow();
		GetByIdLanguageResponse response=this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
		
		
		return response;
	}
	
	
	
}
