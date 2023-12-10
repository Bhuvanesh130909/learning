package object;

public class objectapp {
	public static void main(String [] args) {
		object S1=new object();
		object S2=new object();
		S1.eat();
		S2.study();
		S2.sleep();
		S1.study();
		
		S1.id=1;
		S1.name="bhuvi";
		S1.age=20;
		S1.batch="CS";
		
		S2.id=2;
		S2.name="bavi";
		S2.age=19;
		S2.batch="Bds";
		
		System.out.println(S1.id);
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.batch);
		
		System.out.println(S2.id);
		System.out.println(S2.name);
		System.out.println(S2.age);
		System.out.println(S2.batch);
		
		
		
		
	}

}
