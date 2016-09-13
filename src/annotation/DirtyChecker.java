package annotation;

import java.lang.reflect.Method;

public class DirtyChecker {
	public boolean process(Object instance) {
		Class<?> clazz = instance.getClass();
		for (Method m : clazz.getDeclaredMethods()) {
			if (m.isAnnotationPresent(DirtyCheck.class)) {
				DirtyCheck annotation = m.getAnnotation(DirtyCheck.class);
				String newVal = annotation.newValue();
				String oldVal = annotation.oldValue();
				return newVal.equals(oldVal);
			}
			return false;
		}
		return false;
	}
}