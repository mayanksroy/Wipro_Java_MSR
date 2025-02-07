package com.wipro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamAPIPractice {
	public static void main(String[] args) {
		List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenlist = arr1.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenlist);
		
		List<String> l1 = Arrays.asList("rk", "mayank", "shekhar", "ravi");
		List<String> uppercase = l1.stream().map(x->x.toUpperCase()).collect(Collectors.toList()); 
		System.out.println(uppercase);
		
		List<String> l2 = Arrays.asList("Ark", "mayank", "ashekhar", "ravi");
		List<String> startingwitha = l2.stream().filter(x->x.startsWith("A") || x.startsWith("a")).collect(Collectors.toList());
		System.out.println(startingwitha);
		
		List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> squarelist = arr2.stream().map(x->(x*x)).collect(Collectors.toList());
		System.out.println(squarelist);
		
		List<Integer> arr3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = arr3.stream().reduce(0, (a,b)->(a+b));
		System.out.println(sum);
		
		List<Integer> arr4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer min = arr4.stream().min(Comparator.naturalOrder()).orElseThrow();
		System.out.println(min);
		
		List<Integer> arr5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer max = arr5.stream().max(Comparator.naturalOrder()).orElseThrow();
		System.out.println(max);
		
		List<String> l3 = Arrays.asList("rk", "mayank", "shekhar", "bavi");
		List<String> sortedlist = l3.stream().sorted().toList(); 
		System.out.println(sortedlist);
		
		List<String> l4 = Arrays.asList("rk", "mayank", "shekhar", "bavi");
		List<String> reversesortedlist = l4.stream().sorted(Comparator.reverseOrder()).toList(); 
		System.out.println(reversesortedlist);
		
		List<Integer> arr6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		long countgreater = arr6.stream().filter(x-> x>5).count();
		System.out.println(countgreater);
		
		List<Integer> arr7 = Arrays.asList(1, 2, 3, 4, 3, 6, 2, 9, 5, 6, 7, 8, 9, 10);
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicates = arr7.stream().filter(x-> !seen.add(x)).collect(Collectors.toSet());
		System.out.println(duplicates);
		
		List<Integer> arr8 = Arrays.asList(1, 2, 3, 4, 3, 6, 2, 9, 5, 6, 7, 8, 9, 10);
		List<Integer> unique = arr8.stream().distinct().toList();
		System.out.println(unique);
		
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("Mayank", "Pradeep"),
				Arrays.asList("MIET", "KIET")
				);

		List<String> nestlist = nestedList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(nestlist);
		
		List<Integer> arr9 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer secondhighest = arr9.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		System.out.println(secondhighest);
		
		List<String> l5 = Arrays.asList("rk", "mayank", "shekhar", "bavi");
		Map<Integer, List<String>> groupedbylength = l5.stream().collect(Collectors.groupingBy(String::length)); 
		System.out.println(groupedbylength);
		
		List<Long> numbers = LongStream.rangeClosed(1, 50000).boxed().collect(Collectors.toList());
		long longsum = numbers.parallelStream().mapToLong(Long::longValue).sum();
		System.out.println(longsum);
		
		
	}
}
