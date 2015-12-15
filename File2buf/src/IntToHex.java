
public class IntToHex {
	public static void main(String[] args) {
		intToHex();
	}
	
	public static String intToHex() {
		String s="";
		int n1=-0x80000000;
		int x=n1&0xffffffff;
		System.out.println(x);
		return "";
	}
}
