
import java.io.*;
import java.util.*;

public class wordListSort {
	public static void main(String[] args) throws IOException{
		List<String> list = new ArrayList<String>();
		
		System.out.print("请输入单词本路径：");
		Scanner input = new Scanner(System.in);
		String address = input.next();
		
		File file = new File(address);
		
		while(!file.exists()){
			System.out.print("文件不存在！");
			address = input.next();
			file = new File(address);
		}
		
		readTxtFromFile(list,file);
		
		Collections.sort(list);
		
		for(Object elments:list){
			System.out.print(elments + "\n");
		}
	}
	
	public static <E> void readTxtFromFile(List<E> list,File file)
		throws IOException{
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			list.add((E) input.next());
		}
		
		input.close();
	}
	
}
