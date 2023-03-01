package kodlama.io.languagesUpdate.business.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor



public class UpdateFrameworkRequest {

private String Name;
private int languageId;
	
	
}
