package objectMethods;

public class Person 
{
	String name, dialog;
	int yrlvl, age;
	
	Person(String name, String dialog, int yrlvl, int age)
	{
		this.name = name;
		this.dialog = dialog;
		this.yrlvl = yrlvl;
		this.age = age;
	}
	
	void introduce()
	{
		System.out.println("Good day, I am " + name);
	}
	
	void sayDialog()
	{
		System.out.println(name + ", " + dialog);
	}
	
	void talkTo(String name)
	{
		System.out.println(this.name + " : " + dialog + ", " + name);
	}
	
	void talkToEx(Person ex)
	{
		System.out.println(name + " : " + dialog + ", " + ex.name);
	}
	
}
