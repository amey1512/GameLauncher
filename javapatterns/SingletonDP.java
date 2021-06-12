package javapatterns;

//Eager Initialisation example class
class EagerInitialisation {
	private static EagerInitialisation instance = new EagerInitialisation();
	private EagerInitialisation() {
		
	}
	
	public static EagerInitialisation getInstance() {
		return instance;
	}
	
}

//Lazy Initialisation example class
class LazyInitialisation {
	private static LazyInitialisation instance;
	private LazyInitialisation() {
		
	}
	
	public static  LazyInitialisation getInstance() {
		if(instance == null) {
			instance = new LazyInitialisation();
		}
		
		return instance;
	}
}

//Thread method Initialisation example class
class ThreadMethodInitialisation {
	private static ThreadMethodInitialisation instance;
	private ThreadMethodInitialisation() {
		
	}
	
	public static synchronized ThreadMethodInitialisation getInstance() {
		if(instance == null) {
			instance = new ThreadMethodInitialisation();
		}
		return instance;
	}
}

//Thread blcok method Initialisation example class
class ThreadBlockMethodInitialisation {
	private static ThreadBlockMethodInitialisation instance;
	private ThreadBlockMethodInitialisation() {
		
	}
	
	public static synchronized ThreadBlockMethodInitialisation getInstance() {
		if(instance == null) {
			synchronized(ThreadBlockMethodInitialisation.class) {
			instance = new ThreadBlockMethodInitialisation();
			}
		}
		return instance;
	}
}


public class SingletonDP {
	public static void main( String args[]) {
		
		/*** EagerInitialisation calling.
		EagerInitialisation instance = EagerInitialisation.getInstance();
		System.out.println(instance);
		
		EagerInitialisation instance1 = EagerInitialisation.getInstance();
		System.out.println(instance1);  ***/
		
		
		/*** LazyInitialisation calling.
		LazyInitialisation instance = LazyInitialisation.getInstance();
		System.out.println(instance);
		
		LazyInitialisation instance1 = LazyInitialisation.getInstance();
		System.out.println(instance1);  ***/
		
		
		/*** ThreadMethodInitialisation calling.
		ThreadMethodInitialisation instance = ThreadMethodInitialisation.getInstance();
		System.out.println(instance);
		
		ThreadMethodInitialisation instance1 = ThreadMethodInitialisation.getInstance();
		System.out.println(instance1); ***/
		
		// ThreadBlockMethodInitialisation calling.
		ThreadBlockMethodInitialisation instance = ThreadBlockMethodInitialisation.getInstance();
		System.out.println(instance);
		
		ThreadBlockMethodInitialisation instance1 = ThreadBlockMethodInitialisation.getInstance();
		System.out.println(instance1);
		
		
	}
}
