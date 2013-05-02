package abdl;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ABDLParserTest {
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public List<File> getFiles(String dir){
		List<File> files = new ArrayList<File>();
		File folder = new File(dir);
		
		for (File f : folder.listFiles()){
			if (f.isFile()){
				files.add(f);
			}
		}
		return files;
	}

}
