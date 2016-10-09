package newinterface;

public interface NewInterface {
	public void saySomething();
	 
    default public void sayHi() {
      System.out.println("Hi");
    }
    
//    public static<T> FF<T> of(T...values){
//    	return values;
//    }
}
