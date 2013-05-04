package abdl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Parser {
	public boolean parse(String filename) throws FileNotFoundException,
			ParseException {
		FileInputStream is;
		is = new FileInputStream(new File(filename));

		ABDLParser parser = new ABDLParser(is);

		parser.AddressBook();
		return true;
	}
}
