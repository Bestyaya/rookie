import java.lang.Math;
public class Max{
    public static <E> void main(String[] args){
        final int ROOM = 10;
        Integer[] list = new Integer[ROOM];
        for(int i = 0;i < ROOM;i ++){
            list[i] = (int)(Math.random() * 10);
        }
        for(int i = 0;i < ROOM;i ++){
        	System.out.print(" " + list[i] + " ");
        }
        System.out.println();
        E Max = (E) max(list);
        System.out.println("MaxNumber: " + Max);
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E maxNumber = list[0];
        for(int i = 0;i < list.length;i ++){
            if(maxNumber.compareTo(list[i]) < 0){
                maxNumber = list[i];
            }
        }
        return maxNumber;
    }
}