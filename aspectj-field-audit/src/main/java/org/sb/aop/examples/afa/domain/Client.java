package org.sb.aop.examples.afa.domain;

import org.sb.aop.examples.afa.audit.markup.AopAudit;

//@AopAudit
public class Client {

	@AopAudit
	private Long id;
	@AopAudit
	private String firstName;
	@AopAudit
	private String lastName;
	@AopAudit
	private String email;
	@AopAudit
	private String mobileNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
