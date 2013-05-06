package abdl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class ABDLParserTest extends TestCase {

	private Parser parser;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		parser = new Parser();
	}

	@Test
	public void testCorrectTests() {
		boolean fail = false;
		for (File f : getFiles("test/correct/")) {
			try {
				assertTrue(parser.parse(f.toString()));
				System.out.println("Correct: " + f.toString());
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println("File not found: " + f.toString());
				fail = true;
			} catch (ParseException e1) {
				System.out.println("Incorrect Parse: " + f.toString());
				e1.printStackTrace();
				fail = true;
			}
		}
		if (fail){ fail(); }
	}

	@Test
	public void testIncorrectTests() {
		for (File f : getFiles("test/incorrect/")) {
			try {
				parser.parse(f.toString());
				System.out.println("Fail, ParseException should be thrown: " + f.toString());
				fail();
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println("File not found: incorrect\\" + f.toString());
				fail();
			} catch (ParseException e1) {
				System.out.println("Correct: incorrect\\" + f.toString());
				//e1.printStackTrace();
				assertTrue(true);
			} catch (TokenMgrError e){
				System.out.println("Incorrect(LEXICAL ERROR): incorrect\\" + f.toString());
				assertTrue(true);
			}
		}
	}

	private List<File> getFiles(String dir) {
		List<File> files = new ArrayList<File>();
		File folder = new File(dir);

		for (File f : folder.listFiles()) {
			if (f.isFile()) {
				files.add(f);
			}
		}
		return files;
	}

}
