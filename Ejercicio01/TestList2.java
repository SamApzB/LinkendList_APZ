package Ejercicio01;

public class TestList2 {
	public static <T> void main (String[] args) {
		System.out.println("Prueba de Linked List");
		OrderListLinked<Node<Person>> lista = new OrderListLinked<>();
		Node<Person> nod1 = new Node<Person>(new Person("Percy","Diaz",30));
		Node<Person> nod2 = new Node<Person>(new Person("Nikol","Luna",17));
		Node<Person> nod3 = new Node<Person>(new Person("Rodrigo","Mechan",12));
		Node<Person> nod4 = new Node<Person>(new Person("Sam","Pinto",18));
		Node<Person> nod5 = new Node<Person>(new Person("Julissa","Paredes",25));
		
		lista.insertar(nod1);
		lista.insertar(nod2);
		lista.insertar(nod3);
		lista.insertar(nod4);
		lista.imprimir();
		
		System.out.println("Buscar "+ nod5.getData().getNombre()+": "+lista.searchOrder(nod5));
		System.out.println("Buscar "+ nod2.getData().getNombre()+": "+lista.searchOrder(nod2));
		
		
		System.out.println("Eliminar "+ nod4.getData().getNombre()+":");
		lista.remove(nod4);
		lista.imprimir();
		
	}
}
