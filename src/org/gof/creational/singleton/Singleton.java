package org.gof.creational.singleton;

/**
 * 单例模式
 * 
 * @author TungWang
 */
public class Singleton {

	/**
	 * 懒汉模式
	 * 
	 * @author TungWang
	 */
	public static class Singleton1 {

		private static Singleton1 instance = null;

		private Singleton1() {
		}

		// synchronized来保证线程安全
		public static synchronized Singleton1 instance() {
			// 如果还没有被实例化过，就实例化一个，然后返回
			if (instance == null) {
				instance = new Singleton1();
			}
			return instance;
		}

	}

	/**
	 * 饿汉模式
	 * 
	 * @author TungWang
	 */
	public static class Singleton2 {
		// 类加载的时候instance就已经指向了一个实例
		private static Singleton2 instance = new Singleton2();

		private Singleton2() {
		}

		public static Singleton2 getInstance() {
			return instance;
		}
	}

	/**
	 * 双重校验锁
	 * 
	 * @author TungWang
	 */
	public static class Singleton3 {

		// volatile 避免外部程序看见不完全的 instance
		private static volatile Singleton3 instance = null;

		private Singleton3() {
		}

		public static Singleton3 getInstance() {
			if (instance == null) {
				// 在这里初始化后
				synchronized (Singleton3.class) {
					if (instance == null) {
						instance = new Singleton3();
					}
				}
			}
			// 其他程序可能会看见不完全的 instance
			return instance;
		}
	}

	/**
	 * 静态内部类的特性是
	 * <p>
	 * 加载的时候不会加载内部静态类，使用的时候才会进行加载。
	 * <p>
	 * 而使用到的时候类加载又是线程安全的，这就完美的达到了我们的预期效果
	 * 
	 * @author TungWang
	 */
	public static class Singleton4 {

		private static class SingletonHolder {
			private static Singleton4 instance = new Singleton4();
		}

		private Singleton4() {
		}

		public static Singleton4 getInstance() {
			return SingletonHolder.instance;
		}
	}

	/**
	 * 枚举
	 * 
	 * @author TungWang
	 */
	public enum Singleton5 {
		INSTANCE;
	}

}
