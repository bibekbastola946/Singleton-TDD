import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {

		MyFileWriter writer = MyFileWriter.getInstance();
		
		writer.write("Opened new writer.");
		
		writer.close();

	}

}

