public class Test2 {
	public static void main(String[] args) {
		int n=666;
		String hex=IntToHex(n);
//		System.out.println(hex);
		String a = null;
		System.out.println(a);
	}
	
	public static String IntToHex(int n) {
		String hex="";//为什么定义为NULL不行！
		String hexOpp="";
		while(n!=0){
			int mod=n%16;
			switch (mod) {
			case 0:
				hexOpp+="0";
				break;
			case 1:
				hexOpp+="1";
				break;
			case 2:
				hexOpp+="2";
				break;
			case 3:
				hexOpp+="3";
				break;
			case 4:
				hexOpp+="4";
				break;
			case 5:
				hexOpp+="5";
				break;
			case 6:
				hexOpp+="6";
				break;
			case 7:
				hexOpp+="7";
				break;
			case 8:
				hexOpp+="8";
				break;
			case 9:
				hexOpp+="9";
				break;
			case 10:
				hexOpp+="A";
				break;
			case 11:
				hexOpp+="B";
				break;
			case 12:
				hexOpp+="C";
				break;
			case 13:
				hexOpp+="D";
				break;
			case 14:
				hexOpp+="E";
				break;
			case 15:
				hexOpp+="F";
				break;
			default:
				break;
			}
			n/=16;
			
		}
		//System.out.println(hexOpp);
		char[] c=hexOpp.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			hex+=c[i];
		}
		//System.out.println(hex);
		return hex;
	}
}
