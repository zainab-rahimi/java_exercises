
class Tete extends Toto{
	private int i;
	public Tete(){
		super();
		this.i = 2;
	}
	public int m1(){return this.i;}
	public int m2(){return super.i;}
}