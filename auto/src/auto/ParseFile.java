package auto;

import org.apache.commons.io.FilenameUtils;

public class ParseFile {
	
	public static void parse(String filename) {
		
		String extension = FilenameUtils.getExtension(filename);
		// compile different type of file
		System.out.println(extension);
		
		if(extension.equals("java")) {
			// try to compile the file first
		}
		else if(extension.equals("py")) {
			
		}
		else {
			//
		}
		
	}
	
	public static void main(String[] args) {
		parse("out.py");
	}
}
