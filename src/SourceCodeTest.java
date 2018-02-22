import java.security.CodeSource;

import net.sf.cglib.proxy.Enhancer;

public class SourceCodeTest {
	public static void main(String[] args) {
		
		CodeSource codeSource = new Enhancer().getClass().getProtectionDomain().getCodeSource();
		System.out.println(codeSource);
	}

}
