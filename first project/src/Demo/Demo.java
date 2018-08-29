/**
 * 
 */
/**
 * @author j_olasub
 *
 */
package Demo;

public class Demo {
	
	public static void main(String[] args) {
		
		int Val1=432;
		byte Val2=126; //take max of 127
		byte newVal= (byte) (Val2/2); //Casting to byte (not required for long and int)
		long Val3=355L; //double of int, L tells it that it is a long
		short Val4=5435; //max of 32767
		
		float Val5=5f;
		double Val6=5d;
		char Val='\u00A3';
		String Letter="hello";
		
		System.out.print(Val);
		
	}
}