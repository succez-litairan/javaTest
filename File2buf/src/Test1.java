import java.io.*;

/**
 * ��Test1����ʵ���ı��Ķ�ȡ������ȡ��������byte���ʹ�ӡ������̨
 * @author ��̩Ȼ
 * @time 2015��12��15��09:27:56
 */
public class Test1 {
	
	/**
	 * ������main���ڵ���file2buf��������ӡ�䷵�ص�byte����
	 * @author ��̩Ȼ
	 * @param args
	 * @return void
	 * @time 2015��12��15��09:33:49
	 */
	public static void main(String[] args) {
		File f = new File("C:/abc.txt");

		byte[] b=file2buf(f);
		for (byte c : b) {
			System.out.print(c);
		}
	}
	
	/**
	 * ����file2buf���ڶ�ȡһ���ļ������ݲ�����ת��Ϊbyte����
	 * @author ��̩Ȼ
	 * @param f һ���ļ�����
	 * @return byte[] һ��byte����
	 * @exception FileNotFoundException ���ָ�����ļ����󲻴��ڣ��ͻ���ִ��쳣
	 * @exception IOException �����������д��󣬾ͻ���ִ��쳣
	 * @time 2015��12��15��09:57:42
	 */
	public static byte[] file2buf(File f){
		byte[] buffer=null;
		try {
			FileInputStream fis=new FileInputStream(f);
			ByteArrayOutputStream bos= new ByteArrayOutputStream();
			
			byte[] bytearray= new byte[2048];
			int n;
			while((n=fis.read(bytearray))!=-1){
				bos.write(bytearray, 0, n);
				//System.out.println(n);
			}
			buffer=bos.toByteArray();
			fis.close();
			bos.close();
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ������ڣ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ��������");
		}
		
		return buffer;
	}
}
