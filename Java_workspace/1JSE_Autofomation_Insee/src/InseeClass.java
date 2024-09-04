
public class InseeClass {
/* nom mal choisi  inseeNum
 * 
 * 
 * */
	
	private long insee_num; // num13
	private long insee_total ; //num15

	public InseeClass(long insee_num) {
		super();
		this.insee_num = insee_num;
	}
//	public InseeClass(long insee_num, long insee_total) {
//		super();
//		this.insee_num = insee_num;
//		this.insee_total = insee_total;
//	} // not useful, 

	public static int calNum (long insee_num) { // remove static, doesn't need the parameter to pass because it is an attribute
		int two_last_num=  (int)(97 - (insee_num % 97)); //twoLastNum
		return two_last_num;

	}
	public long getInsee_num() {
		return insee_num;
	}
	public void setInsee_num(long insee_num) {
		this.insee_num = insee_num;
	}
//	public long getInsee_total() {
//		return insee_total;
//	}
//	public void setInsee_total(long insee_total) {
//		this.insee_total = insee_total;
//	}
    @Override
    public String toString() {
        return "{insee_num = " + insee_num + "}";
    }
	
}



