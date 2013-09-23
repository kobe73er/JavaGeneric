public class WildCardDemo3 {
	public static void main(String args[]){
		GenericStack<String> stack1=new GenericStack<String>();
		GenericStack<Object> stack2=new GenericStack<Object>();
		
		stack2.push("java");
		stack2.push(2);
		stack2.push("Sun");
		
		add(stack1,stack2);
		WildCardDemo2.print(stack2);
	}
	public static <E> void add(GenericStack<E> stack1,
			GenericStack<? super E> stack2) {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}
}
