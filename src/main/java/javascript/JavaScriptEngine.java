package javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("nashorn");
			engine.eval("load(\"" + "src/main/resource/test.js" + "\");");
		} catch (Exception ex) {
			// ...
		}
		
		try {
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("nashorn");
			engine.eval(
					"function hi(){\nvar a = 'PROSPER'.toLowerCase(); \nmiddle(); \nprint('Live long and' + a)}\n function middle(){\n var b = 1; for(var i=0, max = 5; i<max;i++){\nb++;\n}\n print('b is '+b);}hi();");
		} catch (ScriptException ex) {
			// ...
		}

	}

}
