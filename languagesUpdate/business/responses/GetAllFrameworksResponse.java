package kodlama.io.languagesUpdate.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public class GetAllFrameworksResponse {

	private int id;
	private String Name;
	private int languageId;
}
