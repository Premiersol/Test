
public class Node <DataType> {

	Node<DataType> link;
	DataType data;
	
	public Node (DataType data) {
		this.data = data;
	}
	
	public void add(DataType data) {
		Node<DataType> newNode = new Node<DataType>(data);
		if(link != null) {
			link.add(data);
		} else {
			link = newNode;
		}
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
	
}
