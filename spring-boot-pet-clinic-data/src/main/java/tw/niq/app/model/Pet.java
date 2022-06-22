package tw.niq.app.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {

	private static final long serialVersionUID = -5046320596108888534L;

	private PetType petType;
	
	private Owner owner;
	
	private LocalDate birthday;
	
}
