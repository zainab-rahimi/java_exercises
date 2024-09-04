
public class Imc {
	
	// define default values
	private static final int WEIGHT_DEFAUT = 85;
	private static final int HEIGHT_DEFAUT = 185;
	
	private String name;
	private int weight;
	private int height;
	private double imc;
	

	public Imc(String name, int weight, int height) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		
	}
	public Imc(String name) {
		super();
		this.height = HEIGHT_DEFAUT;
		this.weight = WEIGHT_DEFAUT;
	}
	
	public void calImc() {
		imc = 0.0;
		imc = 10000 *weight / Math.pow(this.height, 2);
	}
	@Override
	public String toString() {
		return "Imc [name=" + name + ", weight=" + weight + ", height=" + height + ", imc=" + imc + "]";
	}
}



