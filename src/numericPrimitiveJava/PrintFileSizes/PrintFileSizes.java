package numericPrimitiveJava.PrintFileSizes;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintFileSizes {

	public static void main(String[] args) throws IOException {
		
		for (String name: args) {
			File file = new File("access.txt");
			Path path = FileSystems.getDefault().getPath("logs", "access.log");
		    BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			System.out.println("Size of '" + file + "TrueFalse_File" + file.isFile());
			System.out.println(reader);
		}

	}

}
