package ExcelReadPGM;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
      ExcelCode ob= new ExcelCode();
		
		Double a= ob.readData(0,0);
        System.out.println(a);
	}

}
