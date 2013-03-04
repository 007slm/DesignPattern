package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Proxy_ {

	/*
	 * 为其他对象提供一种代理以控制对这个对象的访问,代理模式和动态代理
	 */
	public static void main(String[] args) {
		// 代理模式
		RealSubject realSubject = new RealSubject();
		LogProxySubject proxySubject = new LogProxySubject(realSubject);
		TimecountProxySubject timecountProxySubject = new TimecountProxySubject(
				proxySubject);
		timecountProxySubject.request();

		//动态代理类
		RealSubject rs = new RealSubject(); // 在这里指定被代理类
		InvocationHandler ds = new DynamicSubject(rs);
		Class<? extends Subject> cls = rs.getClass();

		// 以下是一次性生成代理
		Subject subject = (Subject) Proxy.newProxyInstance(
				cls.getClassLoader(), cls.getInterfaces(), ds);
		subject.request();
	}

}
