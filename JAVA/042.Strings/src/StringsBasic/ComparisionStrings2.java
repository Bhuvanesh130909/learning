package StringsBasic;

public class ComparisionStrings2 {

	public static void main(String[] args) {
		String cricketer1="Sachin";
		String cricketer2="Dhoni";
		if( cricketer1== cricketer2)
		{
			System.out.println("reference are Equal");
		}
		else
		{
			System.out.println("reference are UnEqual");
		}
		if( cricketer1.equals( cricketer2))
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Strings are UnEqual");
		}
		if( cricketer1.compareTo( cricketer2)>0)
		{
			System.out.println("Strings 1 is Greater");
		}
		else if( cricketer1.compareTo( cricketer2)<0)
		{
			System.out.println("Strings 2 is Greater");
		}
		else
		{
			System.out.println("Both are equal");
		}

	}

}
