package hashMap;

public class MapUse {
	
	public static void main(String[] args) {
		Map<String, Integer> m = new Map<>();
		
		for(int i=0; i<20; i++) {
			m.insert("abc"+i, i);
			System.out.println("loadfactor: " + m.loadFactor());
		}
		System.out.println(m.removeKey("abc3"));
		System.out.println(m.removeKey("abc18"));
		for(int i=0; i<20; i++) {
			System.out.print(m.getValue("abc"+i) + " ");
		}
	}
}
