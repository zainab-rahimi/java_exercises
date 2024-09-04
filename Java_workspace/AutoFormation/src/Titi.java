interface Titi{
	int m1();
}
interface Tutu extends Titi{
	int m1();
	int m2();
}
abstract class Toto extends Object implements Tutu{
	private int i;
	public Toto(int j){
		super();
		this.i = j;
	}
	public static void main(String[] toto){
		Tete t = new Toto();
		System.out.println(t.m1());
		System.out.println(t.m2());
	}
}
