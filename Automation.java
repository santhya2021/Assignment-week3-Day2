package week3.day2;

public class Automation extends MultipleLanguage{

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Method Selenium is an Interface/Abstract Method");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Method Java is an Interface/Abstract Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation obj=new Automation();
		obj.Selenium();
		obj.Java();
		obj.python();
		obj.ruby();
	}

}
