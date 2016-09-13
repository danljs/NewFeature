package annotation;

public class DirtyCheckTest {

	public static void main(String[] args) {
		DirtyChecker processor = new DirtyChecker();
		AnnotatedDirtyCheck aa = new AnnotatedDirtyCheck();
        System.out.println(processor.process(aa));
        aa.foo();
	}

}
