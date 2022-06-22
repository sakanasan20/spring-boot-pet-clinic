package tw.niq.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {

	private static final long serialVersionUID = 5610097477736336355L;

	private String firstName;
	
	private String lastName;
	
}
