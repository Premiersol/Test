
public class Main {

	public static void main(String[] args) {
		Node<String> head = new Node<String>("Test");
		head.add("test2");
		head.add("test3");
		head.add("test4");
		for(Node<String> itr = head; itr != null; itr = itr.link) {
			System.out.println(itr);
		}
	}
	
}
