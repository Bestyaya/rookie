import java.io.*;
import java.util.*;
public class wordSort {
	public static void main(String[] args) throws IOException{
		TreeSet<String> arraylist = new TreeSet<String>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入单词本地址：");
		String address = input.next();
		File file = new File(address);
		while(!file.exists()){
			System.out.println("文件不存在！");
			
			/*这里不知道为什么在eclipse里面输入Word.txt中提示文件不存在
			只有输入绝对路径才有用。但是在终端运行输入Word.txt，就可以运行成功。*/
			/*现在两种都不行了QAQ*/
			/*我知道原因了，因为我偷偷的在Word和。txt中间打了个空格>-<,
			 * 一定是偷偷的，不是我傻，只是中间失忆了而已QAQ。
			 */
			System.out.println("请输入单词本地址：");
			address = input.next();
			file = new File(address);
		}
		
		readTxtFromFile(arraylist,file);
		
		for(Object element:arraylist){
			System.out.print(element + "\n");
		}
	}
	
	public static <E> void readTxtFromFile(Set<E> arraylist,File file) 
		throws IOException{
		
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			arraylist.add((E)input.next());
		}
		
		input.close();
	}
}
