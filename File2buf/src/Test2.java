/**
 * ��Test2���ڽ�һ������ת��Ϊ16���Ƶ��ַ���
 * @author ��̩Ȼ
 * @time 2015��12��15��11:27:08
 */
public class Test2 {
	/**
	 * ������main���ڵ���IntToHex������ӡ�䷵�صĽ��
	 * @param args
	 * @return void
	 * @time 2015��12��15��11:31:53
	 */
	public static void main(String[] args) {
		int n=10;
		String hex=IntToHex(n);
		System.out.println(hex);
	}
	/**
	 * ����IntToHex��һ������ת��Ϊ16���Ƶ��ַ���
	 * @param n һ������
	 * @return String  һ���ַ�������
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
