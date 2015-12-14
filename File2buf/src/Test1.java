import java.io.*;

public class Test1 {
	/**
	 * @author litr
	 * @
	 */
	public static void main(String[] args) {
		File f = new File("C:/abc.txt");

		byte[] b=file2buf(f);
		for (byte c : b) {
			System.out.print(c);
		}
	}
	public static byte[] file2buf(File f){
		byte[] buffer=null;
		try {
			FileInputStream fis=new FileInputStream(f);
			ByteArrayOutputStream bos= new ByteArrayOutputStream();
			
			byte[] bytearray= new byte[2048];//如果文件很长怎么办？
			int n;
			while((n=fis.read(bytearray))!=-1){
				bos.write(bytearray, 0, n);
				//System.out.println(n);
			}
			buffer=bos.toByteArray();
			fis.close();
			bos.close();
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读入错误！");
		}
		
		return buffer;
	}
}
