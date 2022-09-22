package Class6_June19th;

public class Class_6_MyException extends Exception {
		
		String str1;
		
	public Class_6_MyException(String str2) {
		
		str1 = str2;
	}
	public String toStringUpSkill() {
		return("This is user defined exception by UpSkill" + str1);	
	}

	}
