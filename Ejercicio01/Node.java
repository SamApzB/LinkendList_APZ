package Ejercicio01;

public class Node<T extends Comparable <T>> implements Comparable<Node<T>> {
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this(data, null);
	}
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public int compareTo(Node<T> comp) {
		if(this.data.compareTo(comp.getData()) > 0) {
			return 1;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "Dato: " + data.toString();
	}
	
}