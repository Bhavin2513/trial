package package1;

class person{
	int age;
	String name;
	
	public void setProperty(int age,String name) {
		this.age = age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Try {
	public static void main(String []args){
        person p1 = new person();
        p1.setProperty(20,"Bhavin Patel");
        int age = p1.getAge();
        String name = p1.getName();
        System.out.println("Person1 is "+name+" and he is "+age+" years old !");
        
        person p2 = new person();
        p2.setProperty(17,"Dev Patel");
        int age2 = p2.getAge();
        String name2 = p2.getName();
        System.out.println("Person2 is "+name2+" and he is "+age2+" years old !");
        
        
        double area = Logic.rectangleArea(5,5);	//rectangleArea function is declared static so we can call it directly by class name
        System.out.println(area);
     }
}
