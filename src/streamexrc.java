
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.testng.annotations.Test;

public class streamexrc {
//	@Test
//	public void regularCountNumberStartWithA() {
//		int count =0;
//		//count number of names start with 'A' in list
//		List<String> names = new ArrayList<String>();
//		names.add("Alpha");
//		names.add("Shon");
//		names.add("Alex");
//		names.add("Mohammad");
//		names.add("Adam");
//			for(int i=0;i<names.size();i++) {
//				String actual = names.get(i);
//				if(actual.startsWith("A")){
//					System.out.println(actual);
//					count++;
//				}
//			}
//		System.out.println(count); 
//					
//		}
//	
//	
//	//@Test
//	public void StreamFilterCountNumberStartWithA() {
//		//count number of names start with 'A' in list
//		List<String> names = new ArrayList<String>();
//		names.add("Alpha");
//		names.add("Shon");
//		names.add("Alex");
//		names.add("Mohammad");
//		names.add("Adam");
//		
//		//stream is collection of strings, he do opreation parrellel
//		Long c = names.stream()
//		.filter(s->s.startsWith("A")) // each and everytime name value will go into s (because filter method) and do the condition of StartWith("A") and it happen parallel
//		// if element match filter = true, else = false
//		//with this filter its created another stream of strings that Start with A
//		.count(); // count the number of strings which start with A by filter (count s) on the final ofc
//		//if we dont do .count  there is no will be output because it terminal operation
//		//terminal operation will excute only if inter op (filter) return true
//		//All the opreration we filter on names, its not touch and change and modify  the names Array
//	
//		System.out.print(c);
//		 
//		//instead create list and conver to stream we can direcly create the stream with steam API
//		long d = Stream.of("Alpha","Shon","Alex","Mohammad","Adam").filter(s->
//		{	
//			s.startsWith("A");
//			return true;
//		}).count();
//		System.out.println(d);
//		
//		//print all names of arrayList that greater then 4
//		names.stream().filter(f->f.length()>4).forEach(f->System.out.println(f));
//		 // limited the result set so it will give me only 1 result.(ForEach help us to scan all array and print on one single shot)
//		names.stream().filter(f->f.length()>4).limit(1).forEach(f->System.out.println(f));
//		
//	}

	
	
	@Test
	public void streamMap() {
		//print name have last letter "a" with UpperCase
		Stream.of("Alphaa","Shonnn","Alexx","Mohammmmad","Adaaa").filter(s->s.endsWith("a"))
		//map getting 2 names from the filter into s 
		//map make the 2 names Uppercase
		.map(s->s.toUpperCase())
		.forEach(s->System.out.println(s)); //print it
		//OUTPUT == ALPHAA , ADAAA
		
		//make it names in Stream sorts only the one who start with a and make it uppercase.
		List<String> names = Arrays.asList("Alpha","Shon","Alex","Mohammad","Adam");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

}

	
	
	
