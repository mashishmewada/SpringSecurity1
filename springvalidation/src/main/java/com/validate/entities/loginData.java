package com.validate.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class loginData {
	
	@NotBlank(message = "User Name can not be empty !! ")
	@Size(min = 3, max = 12, message = "User Name must be between 3 - 12 characters")
	private String userName;
	
	//@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !! ")
	@Email(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}")
	private String email;
	
	@AssertTrue(message = "Must agree terms and conditions !!")
	private boolean agreed;

}
