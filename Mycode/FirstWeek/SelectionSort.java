import java.lang.Math;
import java.util.ArrayList;
public class SelectionSort{
    public static <E> void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < 10;i ++){
            list.add((int)(Math.random()* 10));
        }
        System.out.println("排列前：");
        print(list);
        selectionSort(list);
        System.out.println("排列后：");
        print(list);
    }

    public static <E extends Comparable<E>>
        void selectionSort(ArrayList<E> list){
            for(int i = 0;i <= list.size();i ++){
                int indexMin = i;
                for(int j = i + 1;j <= list.size();j ++){
                    if(list.get(i).compareTo(list.get(j)) > 0){
                        indexMin = j;
                    }
                }
                E temp = list.get(i);
                list.remove(i);
                list.add(i,list.get(indexMin - 1));
                list.remove(indexMin);
                list.add(indexMin,temp);
            }
        }   

    public static <E> void print(ArrayList<E> list){
        for(int i = 0;i < list.size();i ++){
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }
}

//不知道哪里错了，明天调试//