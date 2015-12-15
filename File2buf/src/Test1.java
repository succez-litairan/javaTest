import java.io.*;

/**
 * 类Test1用于实现文本的读取并将读取的内容以byte类型打印到控制台
 * @author 李泰然
 * @time 2015年12月15日09:27:56
 */
public class Test1 {
	
	/**
	 * 主函数main用于调用file2buf函数并打印其返回的byte数组
	 * @author 李泰然
	 * @param args
	 * @return void
	 * @time 2015年12月15日09:33:49
	 */
	public static void main(String[] args) {
		File f = new File("C:/abc.txt");

		byte[] b=file2buf(f);
		for (byte c : b) {
			System.out.print(c);
		}
	}
	
	/**
	 * 函数file2buf用于读取一个文件的内容并将其转化为byte数组
	 * @author 李泰然
	 * @param f 一个文件对象
	 * @return byte[] 一个byte数组
	 * @exception FileNotFoundException 如果指定的文件对象不存在，就会出现此异常
	 * @exception IOException 如果输入输出有错误，就会出现此异常
	 * @time 2015年12月15日09:57:42
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
			System.out.println("文件不存在！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读入错误！");
		}
		
		return buffer;
	}
}
