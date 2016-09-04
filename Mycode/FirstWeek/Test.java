import java.lang.Math;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        GenericStack<Integer> test1 = new GenericStack(5);
        				
        System.out.println("随意添加5个数：");
        for(int i = 0;i < 5;i ++){
            test1.push((int)(Math.random() * 10));
        }
        genericStackTest(test1);
        System.out.println("再随意添加5个数：");
        for(int i = 0;i < 5;i ++){
            test1.push((int)(Math.random() * 10));
        }
        genericStackTest(test1);
    }

    public static <E> void genericStackTest(GenericStack<E> test){

        System.out.println("此栈此时如下：");
        test.print();

        System.out.println("此栈此时元素个数：" + test.getSize());

        System.out.println("此栈此时栈顶元素：" + test.peek());

        char chooseYN = 'o';
        while(chooseYN !='Y' &&chooseYN !='N'){
	        System.out.println("选择是否删除并输出栈顶元素[Y/N]：");
	        Scanner input = new Scanner(System.in);
	        String choose = input.next();
	        chooseYN = choose.charAt(0);
        }
           if(chooseYN == 'Y'){
               E top = test.pop();
               System.out.println("此栈此时如下：");
               test.print();
               System.out.println("删除的元素为：" + top);     
           }
           else if(chooseYN == 'N'){
               System.out.println("此栈此时栈顶元素：" + test.peek());
           }
           System.out.println("请按任意键继续");
           Scanner input = new Scanner(System.in);
           String str = input.next();
    }
}
