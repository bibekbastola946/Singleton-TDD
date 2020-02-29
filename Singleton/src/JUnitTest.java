import java.io.IOException;
import java.util.Date;
import junit.framework.TestCase;

public class JUnitTest extends TestCase {
	public void test() throws IOException{
		Date date = new Date();
		MyFileWriter writer = MyFileWriter.getInstance();
		writer.write("Opened new writer.");
		writer.close();
		assertEquals("Opened new writer.Finally!!!"+ date,writer.getvalue());
	}
}
