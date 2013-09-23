public class WildCardDemo2 {

	public static void main(String argsp[]) {
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);

		print(intStack);
	}

	public static void print(GenericStack<?> stack) {
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
