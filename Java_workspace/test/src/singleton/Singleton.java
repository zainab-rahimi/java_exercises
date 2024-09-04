package singleton;

public class Singleton {

	private static Singleton instance;
	public String example;
	
	private Singleton(String example ) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.example = example;
	}
	public static Singleton getexample(String example) {
		if (instance ==null) {
		instance = new Singleton(example);
		}
		return instance;
		}
	}
