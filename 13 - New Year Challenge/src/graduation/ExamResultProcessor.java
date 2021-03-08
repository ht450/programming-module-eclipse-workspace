/**
 * 
 */
package graduation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Hugh
 *
 */
public class ExamResultProcessor {

	/**
	 * 
	 */
	public ExamResultProcessor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<MScStudent> students = new ArrayList<MScStudent>();
		File file = new File("ModuleScoresMSc.csv");

		readResultsFile(file, students);

		for (MScStudent student : students) {
			System.out.println(student.toString() + "\n");
		}

		classificationList(students);
		
		File listForGrad = new File("ListForGraduation.txt");
		makeGraduationList(listForGrad, students);
		
		
	}

	/**
	 * takes the file and uses the data to create an array list of MScStudent
	 * objects
	 * 
	 * @param file
	 * @param students
	 */
	public static void readResultsFile(File file, ArrayList<MScStudent> students) {
		String line;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// read header line
			line = br.readLine();
			line = br.readLine();

			while (line != null) {
				students.add(makeMScStudentFromLine(line));
				line = br.readLine();
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Could not find results file");
		} catch (IOException ioException) {
			System.err.println("IOException reading file");
		} catch (Exception exception) {
			System.err.println("Problem reading file");
			exception.printStackTrace();
		}
	}

	/**
	 * takes a line from the file and returns the info as an MScStudent object
	 * 
	 * @param line
	 * @return
	 */
	public static MScStudent makeMScStudentFromLine(String line) {
		MScStudent student = new MScStudent();
		String[] splitLine = line.split(",");
		student.setStudentNo(Integer.parseInt(splitLine[0]));
		student.setFirstName(splitLine[1]);
		student.setLastName(splitLine[2]);
		student.setProgram(Integer.parseInt(splitLine[3]));
		student.setCompFound(Integer.parseInt(splitLine[4]));
		student.setDatabases(Integer.parseInt(splitLine[5]));
		student.setWeb(Integer.parseInt(splitLine[6]));
		student.setSoftwareEng(Integer.parseInt(splitLine[7]));
		return student;
	}

	/**
	 * method takes an arrayList of students and prints their info and degree
	 * classification
	 * 
	 * @param students
	 */
	public static void classificationList(ArrayList<MScStudent> students) {
		for (MScStudent student : students) {
			System.out.println("Student no. : " + student.getStudentNo());
			System.out.println("First name : " + student.getFirstName());
			System.out.println("Last name : " + student.getLastName());
			System.out.println("Average : " + student.getAverageMark());
			System.out.println("Classification : " + student.getClassification());
			System.out.println();
		}
	}

	/**
	 * method takes an arrayList of students and writes a list for a graduation to file
	 * 
	 * @param students
	 */
	public static void makeGraduationList(File file, ArrayList<MScStudent> students) {
		String line;
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (MScStudent student : students) {
				line = student.getStudentNo()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getClassification();
				bw.write(line+"\n");
			}			
			
			bw.close();
			fw.close();
		} catch (Exception exception) {
			System.err.println("Exception writing to file");
		}
	}
}
