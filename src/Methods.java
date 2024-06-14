
public class Methods {

	public static void main(String[] args) {
		Methods d = new Methods(); // class name - object = new class name (); (we can do it in other class)
		
		d.GetData();
		String test = d.RETURNData();
		System.out.println(test);
		
		//why methods - wrap all lines in one block and for the block give one name.
		//insted of repeting lines again and again (lines u think will be in alot of places) then we create method for it
		 
		//** WE CANT CREATE METHOD IN INSIDE MAIN BLOCK (public static void main) because it might or not might in out execution
	}
	public void GetData() { // when we giving public accsess gives GetData method be accessed by another classes also.
	// void means - what the method returns. if u want the method return int so u'll change void to int, we use void because we dont want return anything (giving back)	
		System.out.println("Hello");
		//to access any methods of class - we need create first object of that class
	}
	
	
	public String RETURNData() { // when we giving public accsess gives GetData method be accessed by another classes also.
		// void means - what the method returns. if u want the method return int so u'll change void to int, we use void because we dont want return anything (giving back)	
			return "hello to name";
			//to access any methods of class - we need create first object of that class
		}
	
	//if i use private void GetSomething(), because i use private and not public, i cant use this method in another classes, only in this class

//there is a way to access my own class methods without create object, need to use static
	public static String GetStuff() { // now this method belong to class and not object and u can call it without object
		//now u dont need to do after Methods d = new Methods(); the d.GetStuff, 
		//now u can only do GetStuff();
		return "hi";

	}
	
	
//SO
// if u use public void GetData in IntroClass, so in another class u need to First open object for it: IntroClass d = new IntroClass; and after it do d.GetData();
//if u use public static void GetData in IntroClass , so in another class u only need to call it by class.Funcition, in this situation just type IntroClass.GetData();



}
