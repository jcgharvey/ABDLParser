package abdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Parser {
	public void parse(String filename) {
		FileInputStream is;
		try {
			is = new FileInputStream(new File(filename));

			ABDLParser parser = new ABDLParser(is);
			try {
				parser.AddressBook();
				System.out.println("Input OK");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
