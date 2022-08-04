/*
	@author : name
	Tittle  : inheritance
	
	quiz    : printing students details usring constructor



*/
class Student
{
	int Student_id;
	Student(){
		System.out.println("No -args Students cons");
	}
	Student(int i){
		System.out.println("1 -args Students cons = "+ i);
	}
	Student(int i,String s1){
		System.out.println("2 -args Students cons = "+i+", "+s1);
	}
public static void main(String[] args) 
	{
		
		Student Student_Object = new Student();
		Student Student_Object1 = new Student(100);
		Student Student_Object2 = new Student(40,"Anudip");
		Batch Batch_Object = new Batch();
		Batch Batch_Object1 = new Batch(100);
		Batch Batch_Object2 = new Batch(40,"java");
		Batch Batch_Object3 = new Batch(40,".net","Running");
		
	}	
	
}
class Batch 
{
	int Batch_id; 
	String Batch_name;
	Batch(){
		System.out.println("From Batch No-args Constructer");
	}
	Batch(int Batch_id){
		System.out.println("From Batch 1 - args Constructer");
	}
	Batch(int Batch_id,String Batch_name){
		System.out.println("From Batch 2-args Constructer");
	}
	Batch(int Batch_id,String Batch_name,String Batch_Status)
	{
		System.out.println("From Batch 3-args Constructer "+Batch_id+", "+Batch_name+", "+Batch_Status);
	}
	
}
class Con3 
{
	
	public static void main(String[] args) 
	{
		
		Student Student_Object = new Student();
		Student Student_Object1 = new Student(100);
		Student Student_Object2 = new Student(40,"Anudip");
		Batch Batch_Object = new Batch();
		Batch Batch_Object1 = new Batch(100);
		Batch Batch_Object2 = new Batch(40,"java");
		Batch Batch_Object3 = new Batch(40,".net","Running");
		
	}

}
