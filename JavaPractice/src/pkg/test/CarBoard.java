package pkg.test;

public class CarBoard {

	Short short1=5;
	
	 CarBoard go(CarBoard	  cb) {
		// TODO 	Auto-generated constructor stub
		 cb=null;
		 return cb;
				 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarBoard c1= new CarBoard();
		CarBoard c2= new CarBoard();
		
		CarBoard c3= c1.go(c2);
		
		c1=null;
	}

}
