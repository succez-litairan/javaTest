/**
 * 类Test2用于将一个整数转换为16进制的字符串
 * @author 李泰然
 * @time 2015年12月15日11:27:08
 */
public class Test2 {
	/**
	 * 主函数main用于调用IntToHex，并打印其返回的结果
	 * @param args
	 * @return void
	 * @time 2015年12月15日11:31:53
	 */
	public static void main(String[] args) {
		int n=10;
		String hex=IntToHex(n);
		System.out.println(hex);
	}
	/**
	 * 函数IntToHex将一个整数转换为16进制的字符串
	 * @param n 一个整数
	 * @return String  一个字符串对象
	 */
	public static String IntToHex(int n) {
		String hex="";
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
