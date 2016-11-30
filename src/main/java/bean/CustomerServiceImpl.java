package bean;
 
import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
	private String hello;
	private String message;
	
	private Map<String, String> parameters = new HashMap<String, String>();

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	@Override
	public void setHello(String message) {
		this.hello = message;
	}

	@Override
	public String getHello() {
		return this.hello;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}