
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		String s = "Rao Safdar Raza";
		String[] splitString = s.split(" ");
		
		for(int i = 0;i<splitString.length;i++) {
			
			System.out.println(splitString[i]);
		}
		
		for(int j=s.length()-1; j>=0; j--) {
			
			System.out.println(s.charAt(j));
		}
	/*	for(String val: splitString) {
		System.out.println(splitString[val]);
		}*/
	}

}
