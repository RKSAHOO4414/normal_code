import java.io.*;
import  java.util.zip.DeflaterOutputStream;
public class Compress 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("Admit Card1.pdf");
		DeflaterOutputStream dos=new DeflaterOutputStream(new FileOutputStream("b.pdf"));
		
		int ch;
		while((ch=fis.read())!=-1)
		{
			dos.write((byte)ch);
		}
		System.out.println("Compress Done...");
		
		dos.close();
		fis.close();

	}
}
