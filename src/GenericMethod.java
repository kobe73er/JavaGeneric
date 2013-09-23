public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] integers = { 1, 2, 3, 4, 5 };

		String[] strings = { "London", "Paris", "New York", "Austin" };
		GenericMethod.<Integer>printInfo(integers);
		GenericMethod.printInfo(strings);
		
	
	}

	public static <E> void printInfo(E[] list) {
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}

}
