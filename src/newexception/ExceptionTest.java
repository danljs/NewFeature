package newexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

public class ExceptionTest {
	//Because of:
	//public interface Closeable extends AutoCloseable {...}
	//public abstract class InputStream implements Closeable {...}
	public void testAutoClose() {
		try(
			InputStream is1 = new FileInputStream(new File("foo1.txt"));
			InputStream is2 = new FileInputStream(new File("foo2.txt"))
		){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void preciseThrow() throws IOException,SQLException{
		try{
			
		}catch(final Exception ex){
			System.err.print(ex.getMessage());
			throw ex;
		}
	}
	
	public void multiCatch() throws IOException,SQLException{
		try{
			InputStream is1 = new FileInputStream(new File("foo1.txt"));
			Connection cnn = null;
			cnn.close();
		}catch(SQLException|IOException ex){
			System.err.print(ex.getMessage());
			throw ex;
		}
	}
}
