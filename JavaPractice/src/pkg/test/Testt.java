package pkg.test;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x=0;
			int y=0;
			for ( int z=0;z<5;z++) {
				if((++x>2) && (++y>2)){
					x++;
				}
				
			}
			System.out.println(x+" "+y);
	}

}
