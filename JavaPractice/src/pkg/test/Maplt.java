package pkg.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class KeyMp {
	public int i;

	public KeyMp(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public boolean equals(Object obj) {

		return i == ((KeyMp) obj).i;
	}

}

public class Maplt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<KeyMp> keyMps = new HashSet<KeyMp>();
		KeyMp keyMps1 = new KeyMp(1);
		KeyMp keyMps2 = new KeyMp(2);
		
		keyMps.add(keyMps1);
		keyMps.add(keyMps1);
		
		keyMps.add(keyMps2);
		keyMps.add(keyMps2);
		
		System.out.println(keyMps.size()+":");
		keyMps1.i=1;
		System.out.println(keyMps.size()+":");
		keyMps.remove(keyMps1);
		System.out.println(keyMps.size()+":");
		keyMps.remove(keyMps2);
		System.out.println(keyMps.size());
		
	}

}
