package maps;

public class Contact {

	private String fname;
	private String lname;
	private String email;
	private String mobile;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param fname
	 * @param lname
	 * @param email
	 * @param mobile
	 */
	public Contact(String fname, String lname, String email, String mobile) {
		super();
		this.fname = fname;
		this.lname = lname;
		setEmail(email);
		this.mobile = mobile;
	}



	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (!email.equals(null) || email.trim().length()!=0 || !email.isEmpty()) {
			this.email = email;			
		}
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
