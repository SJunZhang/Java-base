package proxy.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class SubjectProxy implements MethodInterceptor{
	
	private Enhancer enhance = new Enhancer();
	
	public Object getProxy(Class clazz){
		enhance.setSuperclass(clazz);
		enhance.setCallback(this);
		return enhance.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
