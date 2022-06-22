package tw.niq.app.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 7410489532320342402L;
	
	private Long id;
	
}
