import java.util.ArrayList;
import java.util.Arrays;

public class CoreJAVA_1 {

	public static void main(String[] args) {

		
		//one way create string // this is String litral (its still object)
		String s = "hello there people";
				
		//other way
		//String s2 = new String("Welcome"); //created object s2 that storing inside value called "welcome"
		//String is object that represent sequence of character
		//this is using new memory allocate operator
		
		//the different between String litral (String s = "hello" and New memory allocate (String s2 = new String ("hello") is that:
		// in the String litral, same multi values with same name won't create new object,  it will refer to existing
		// in the Object new memory allocate , no matter if its same string value, it will still create new object in memory space
		String[] Splits = s.split(" "); // Splits value will have ["hello","there","people"]
		//if i'll use s.split("there") so the word will dissapear and only will print and be ["hello","people"]
		System.out.println(Splits[0]);
		System.out.println(Splits[1]);
//to remove right and left spaces in there word we can just use Splits[1].trim();
		String ss = "hello guys";
//		// to print one by one h e l l o   g u y s
//		for(int i=0;i<ss.length();i++) {
//			System.out.print(ss.charAt(i));
//			System.out.print("*");

	//	} // h*e*l*l*o* *g*u*y*s*
		
		//to print in reverse the String
//		for(int i=ss.length()-1;i>=0;i--) { // the -1 because its start from 0 index (and ss.length dont count 0 as physical letter
//			System.out.print(ss.charAt(i));
//			System.out.print("*");
//		}
}
}