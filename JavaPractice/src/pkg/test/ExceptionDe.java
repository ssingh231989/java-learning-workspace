package pkg.test;

class Exc0 extends Exception{
	
}
class Exc1 extends Exc0{
	
}
public class ExceptionDe {

	public static void main(String args[]) {

		try {
			throw new Exc1();
		}catch (Exc0 e) {
			System.out.println("Exc0 catch");
		}catch (Exception e) {
			System.out.println("Exception catch");
		}
		
	}
}
