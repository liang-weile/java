import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
			out.write("liangweile");
			out.close();
			System.out.println("文件创建成功！");
		} catch(IOException e){
			
		}
	}
}