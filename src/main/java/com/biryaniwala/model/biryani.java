package com.biryaniwala.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class biryani {

	@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniPrice;
	private String biryaniDesc;
	
	
	
}
