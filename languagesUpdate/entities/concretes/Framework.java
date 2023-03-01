package kodlama.io.languagesUpdate.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="frameworks")
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Data


public class Framework {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="Name")
	@NotNull
	@NotBlank
	
	private String Name;
	
	@ManyToOne(targetEntity=Language.class)
	
	@JoinColumn(name="LanguageId")
	private Language language ;
	
	
}
