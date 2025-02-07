package wipro.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class StreamApiTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mayank", "Pradeep", "Lalit", "Kaushik");
//		Stream<String> nameStream = names.stream();
//		System.out.println(nameStream);
		names.stream().forEach(x->System.out.println(x));
		
		List<Integer> l1 = Arrays.asList(12, 43, 65, 32, 87, 36, 98);
		
		System.out.println("==Even==");
		l1.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		System.out.println("==Odd==");
		l1.stream().filter(x->x%2!=0).forEach(x->System.out.println(x));
		
		System.out.println("==Sorted==");
		l1.stream().sorted().forEach(x->System.out.println(x));
		
		System.out.println("==D.Sorted==");
		l1.stream().sorted((x,y)->y.compareTo(x)).forEach(x->System.out.println(x));
		
		System.out.println("==Saving in a List Format==");
		List<Integer> evenList = l1.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<String> names1 = Arrays.asList("hello", "there", "how", "are", "you");
		
		System.out.println("==UpperCase==");
		names1.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		System.out.println("==LowerCase==");
		names1.stream().map(x->x.toLowerCase()).forEach(x->System.out.println(x));
		
		
		
		List<Integer> l2 = Arrays.asList(10, 20, 10, 30, 20, 40, 40, 50);
		
		System.out.println("==Distict==");
		l2.stream().distinct().forEach(x->System.out.println(x));
		
		List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("==Limit==");
		l3.stream().limit(5).forEach(x->System.out.println(x));
		
		System.out.println("==Skip==");
		l3.stream().skip(5).forEach(x->System.out.println(x));
		
		System.out.println("==Reduce(Sum)==");//aggregating functions
		int sum = l3.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum is: " + sum);
		
		System.out.println("==Reduce(Mul)==");//aggregating functions
		int mul = l3.stream().reduce(1, (a,b)->a*b);
		System.out.println("Sum is: " + mul);
		
		System.out.println("==Flatten 2D Array List into Single List==");
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("Mayank", "Pradeep"),
				Arrays.asList("MIET", "KIET")
				);
		System.out.println("=Output in stream format=");
		nestedList.stream().flatMap(x->x.stream()).forEach(x->System.out.println(x));
		System.out.println("=Output in list format=");
		List<String> nestlist = nestedList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(nestlist);
	}
}
