package numericPrimitiveJava;

import java.util.Calendar;
import java.util.Date;

public class TestingObjectCanCastInstanceOf {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = Calendar.getInstance();
		long time = 0;
		
		//if(obj instanceof Calendar)
		//	time = ((Calendar)obj).getTime();
		if(obj instanceof Date)
			time = ((Date)obj).getTime();
			System.out.println("OK");

	}

}
