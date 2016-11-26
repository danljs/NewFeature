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
	
	public void runnable(){
		Runnable ra = ()->{
			System.out.println("Hello Lambda!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		System.out.println("1");
		ra.run();
		System.out.println("2");
		ra.run();
		System.out.println("3");
		ra.run();
		System.out.println("4");
		ra.run();
		System.out.println("5");
		
		System.out.println("t1");
		Thread t1 = new Thread(ra);
		t1.start();
		System.out.println("t2");
		Thread t2 = new Thread(ra);
		t2.start();
		System.out.println("t3");
		Thread t3 = new Thread(ra);
		t3.start();
		System.out.println("t4");
		Thread t4 = new Thread(ra);
		t4.start();
		System.out.println("t5");
		Thread t5 = new Thread(ra);
		t5.start();
	}
	
	public static void main(String[] args){
		ExceptionTest et = new ExceptionTest();
		et.runnable();
	}
}
