import java.awt.List;
import java.util.*;
public class TestList {
	public static void main (String[] args){
		Collection<String> list1 = Arrays.asList("George","Jim","John","Blake","Mechael");
		Collection<String> list2 = Arrays.asList("George","Ketir","Kevin","Michelle","Ryan");
		
		Collection<String> unionSet = new ArrayList<String>();
		Collection<String> Intersection = new ArrayList<String>();
		Collection<String> differenceSet = new ArrayList<String>();
		
		getUnionSet(list1,list2,unionSet);
		getIntersection(list1,list2,Intersection);
		getDifferenceSet(list1,list2,differenceSet);
		
		System.out.println(list1);
		System.out.println(list1);
		System.out.println(unionSet);
		System.out.println(Intersection);
		System.out.println(differenceSet);
	}
	
	public static <E> void getUnionSet(Collection<E> set1,Collection<E> set2,Collection<E> unionSet){
		unionSet.addAll(set1);
		unionSet.addAll(set2);
	}
	
	public static <E> void getIntersection(Collection<E> set1,Collection<E> set2,Collection<E> Intersection){
		Intersection.addAll(set1);
		Intersection.removeAll(set2);
	}
	
	public static <E> void getDifferenceSet(Collection<E> set1,Collection<E> set2,Collection<E> differenceSet){
		differenceSet.addAll(set1);
		differenceSet.retainAll(set2);
	}
}
