package kodlama.io.languagesUpdate.business.abstracts;

import java.util.List;

import kodlama.io.languagesUpdate.business.requests.CreateLanguageRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateLanguageRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllLanguagesResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdLanguageResponse;

public interface LanguageService {

	public List<GetAllLanguagesResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest)throws Exception;
	void delete(int idLanguage);
	void update(UpdateLanguageRequest updateLanguageRequest);
    GetByIdLanguageResponse getById(int id);
	
	
	
}
