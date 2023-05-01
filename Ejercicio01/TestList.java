package Ejercicio01;

public class TestList {
	public static <T> void main (String[] args) {
		System.out.println("Prueba de Linked List");
		OrderListLinked<Node<Integer>> lista = new OrderListLinked<>();
		Node<Integer> nod1 = new Node<Integer>(10);
		Node<Integer> nod2 = new Node<Integer>(30);
		Node<Integer> nod3 = new Node<Integer>(20);
		Node<Integer> nod4 = new Node<Integer>(5);
		Node<Integer> nod5 = new Node<Integer>(7);
		
		lista.insertar(nod1);
		lista.insertar(nod2);
		lista.insertar(nod3);
		lista.insertar(nod4);
		lista.imprimir();
		
		System.out.println("Buscar "+ nod5.getData()+": "+lista.searchOrder(nod5));
		System.out.println("Buscar "+ nod2.getData()+": "+lista.searchOrder(nod2));
		
		
		System.out.println("Eliminar "+ nod4.getData()+":");
		lista.remove(nod4);
		lista.imprimir();
		
	}
}
