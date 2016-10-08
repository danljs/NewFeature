package newinterface;

public interface NewInterface {
	public void saySomething();
	 
    default public void sayHi() {
      System.out.println("Hi");
    }
}
