package Actividad03;

public class TestList {
	public static <T> void main (String[] args) {
		System.out.println("Prueba de Linked List");
		ListLinked<Node<Integer>> lista = new ListLinked<>();
		Node<Integer> nod1 = new Node<Integer>(1);
		Node<Integer> nod2 = new Node<Integer>(2);
		Node<Integer> nod3 = new Node<Integer>(3);
		
		lista.insertLast(nod1);
		lista.insertLast(nod2);
		lista.insertLast(nod3);
		
		lista.imprimir();
		lista.remove(nod3);
		System.out.println("Eliminar nodo");
		lista.imprimir();
		System.out.println(lista.search(nod1));
	}
}
