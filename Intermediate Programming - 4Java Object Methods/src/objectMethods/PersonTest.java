package objectMethods;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Makki", "Hi", 4, 27);
		Person p2 = new Person("Anne", "Hello", 4, 27);
		
		//***void introduce()
		//p1.introduce();
		//System.out.println(p1.dialog);
		//p2.introduce();
		//System.out.println(p2.dialog);

		//***void sayDialog()
		//p1.sayDialog();
		//p2.sayDialog();
		
		//***void talkTo(String name)
		//p1.talkTo("Marcus");
		//p2.talkTo("Marcus");
		
		//***void talkToEx(Person ex)
		p1.talkToEx(p2);
		p2.talkToEx(p1);
	}

}
