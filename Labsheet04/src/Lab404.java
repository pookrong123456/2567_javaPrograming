import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent(){
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDVaild, isSubjectCodeValid;
		while(true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			System.out.print("Enter student code (7 digits): ");
			subjectCode = scanner.nextLine();
			
			isStudentIDVaild = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			if(isStudentIDVaild && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				displayData(isITStudent,isITSubject);
				break;
			}else {
				System.out.println("");
			}
			
		}
	}
	public static boolean isLength(String input,int len) {
		return input.length() == len;
	}
	public static boolean isITStudent(String studentID) {
		if (studentID.charAt(2) == '1') {
	        return true;
	    }else {
	    	return false;
	    }
	    
	}
	public static boolean isITSubject(String studentID) {
		if (studentID.startsWith("211311")) {
	        return true;
	    }else {
	    	return false;
	    }
	    
	}

}
