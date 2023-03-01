package kodlama.io.languagesUpdate.business.abstracts;

import java.util.List;

import kodlama.io.languagesUpdate.business.requests.CreateFrameworkRequest;
import kodlama.io.languagesUpdate.business.requests.UpdateFrameworkRequest;
import kodlama.io.languagesUpdate.business.responses.GetAllFrameworksResponse;
import kodlama.io.languagesUpdate.business.responses.GetByIdFrameworkResponse;

public interface FrameworkService {
	
public List<GetAllFrameworksResponse> getAll();
void add(CreateFrameworkRequest createFrameworkRequest)throws Exception;
void delete(int idFramework);
void update(UpdateFrameworkRequest updateFrameworkRequest);
GetByIdFrameworkResponse getById(int id);

}
