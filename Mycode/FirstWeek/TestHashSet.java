import java.util.*;
public class TestHashSet {
	public static void main (String[] args){
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Mechael");
		
		set2.add("George");
		set2.add("ketie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		
		Set<String> unionSet = new HashSet<String>();
		Set<String> Intersection = new HashSet<String>();
		Set<String> differenceSet = new HashSet<String>();
		
		getUnionSet(set1,set2,unionSet);
		getIntersection(set1,set2,Intersection);
		getDifferenceSet(set1,set2,differenceSet);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(unionSet);
		System.out.println(Intersection);
		System.out.println(differenceSet);
	}
	
	public static <E> void getUnionSet(Set<E> set1,Set<E> set2,Set<E> unionSet){
		unionSet.addAll(set1);
		unionSet.addAll(set2);
	}
	
	public static <E> void getIntersection(Set<E> set1,Set<E> set2,Set<E> Intersection){
		Intersection.addAll(set1);
		Intersection.removeAll(set2);
	}
	
	public static <E> void getDifferenceSet(Set<E> set1,Set<E> set2,Set<E> differenceSet){
		differenceSet.addAll(set1);
		differenceSet.retainAll(set2);
	}
}
