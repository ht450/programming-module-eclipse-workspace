/**
 * 
 */
package graduation;

/**
 * @author Hugh
 *
 */
public class MScStudent extends Student {

	private int program;
	private int compFound;
	private int databases;
	private int web;
	private int softwareEng;
	private int averageMark;
	private String classification;

	/**
	 * MScStudent default constructor
	 */
	public MScStudent() {
		
	}
	
	/**
	 * MScStudent constructor with args
	 * 
	 * @param program
	 * @param compFound
	 * @param databases
	 * @param web
	 * @param softwareEng
	 * @param averageMark
	 */
	public MScStudent(int studentNo, String firstName, String lastName, int program, int compFound, int databases, int web, int softwareEng, int averageMark) {
		super(studentNo, firstName, lastName);
		this.program = program;
		this.compFound = compFound;
		this.databases = databases;
		this.web = web;
		this.softwareEng = softwareEng;
		this.averageMark = averageMark;
	}

	/**
	 * @return the program
	 */
	public int getProgram() {
		return program;
	}

	/**
	 * @param program the program to set
	 */
	public void setProgram(int program) {
		if (program >= 0 && program <= 100) {
			this.program = program;
		}
	}

	/**
	 * @return the compFound
	 */
	public int getCompFound() {
		return compFound;
	}

	/**
	 * @param compFound the compFound to set
	 */
	public void setCompFound(int compFound) {
		if (compFound >= 0 && compFound <= 100) {
			this.compFound = compFound;
		}
	}

	/**
	 * @return the databases
	 */
	public int getDatabases() {
		return databases;
	}

	/**
	 * @param databases the databases to set
	 */
	public void setDatabases(int databases) {
		if (databases >= 0 && databases <= 100) {
			this.databases = databases;
		}
	}

	/**
	 * @return the web
	 */
	public int getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(int web) {
		if (web >= 0 && web <= 100) {
			this.web = web;
		}
	}

	/**
	 * @return the softwareEng
	 */
	public int getSoftwareEng() {
		return softwareEng;
	}

	/**
	 * @param softwareEng the softwareEng to set
	 */
	public void setSoftwareEng(int softwareEng) {
		if (softwareEng >= 0 && softwareEng <= 100) {
			this.softwareEng = softwareEng;
		}
	}

	/**
	 * calculates the average mark. method hidden
	 */
	private void setAverageMark() {
		int total = getProgram()*2 + getCompFound() + getDatabases() + getWeb() + getSoftwareEng();
		this.averageMark = total/6;
	}
	
	/**
	 * gets the average mark for the whole course. Calculates the mark before returning.
	 * @return
	 */
	public int getAverageMark() {
		setAverageMark();
		return averageMark;
	}
	
	public void setClassification() {
		String classification = "Not Available";
		int mark = getAverageMark();
		if (mark < 0 || mark > 100) {
			System.err.println("Error setting Degree clasification. Mark out of bounds");
		} else if (mark >= 70) {
			classification = "Distinction";
		} else if (mark >= 60) {
			classification = "Commendation";
		} else if (mark >= 50) {
			classification = "Pass";
		} else if (mark < 50) {
			classification = "Fail";
		}		
		this.classification = classification;
	}
	
	public String getClassification() {
		setClassification();
		return classification;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Module Results\nProgram : " + program + "\nComp Found : " + compFound + "\nDBs : " + databases
				+ "\nWeb : " + web + "\nSoftware E : " + softwareEng + "\nAverage : " + getAverageMark() + "\nClassification : " + getClassification();
	}
	

}
