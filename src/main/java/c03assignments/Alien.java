package c03assignments;

//class Alien {
//	String invade(short ships) { return "a few"; }
//	String invade(short... ships) { return "many"; }
//}

//class Defender {
//	public static void main(String [] args) {
//		//System.out.println(new Alien().invade(7));
//	}
//}

class Alien {
	public static void main(String[] args) {
		int[][] myArray = new int[3][];
		byte z=0;
		z+=30;
		int[][] a = {{1,2,},{3,4}};
		int[] b = a[1];
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		int[] b2 = (int[]) o1;// vai dar ClassCastException
		System.out.println(z);
	}
}