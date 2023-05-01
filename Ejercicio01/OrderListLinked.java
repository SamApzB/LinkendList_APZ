package Ejercicio01;

import Actividad03.ListLinked;
import Actividad03.Node;

public class OrderListLinked<T extends Comparable<T>> extends ListLinked<T> {
	private Node<T> head;
	public OrderListLinked() {
		this.head = null;
	}
	
	public OrderListLinked(Node<T> head) {
		this.head = head;
	}
	
	public int search(T ele) {
		
		return -1;
	}

	public void insertLast(T ele) {
		Node<T> aux = this.head;
		Node<T> last = new Node<T>(ele);
		if(this.head == null) {
			this.head = last;
		}
		else {
			while (aux.getNext() != null) {
				aux = aux.getNext();			
			}
			aux.setNext(last);
		}
	}
	
	public void insertar(T ele) {
		Node<T> aux = this.head;
		Node<T> cond = null;
		T data;
		
		this.insertLast(ele);
		while(aux != null) {
			cond = aux.getNext();
			while(cond != null) {
				if(aux.getData().compareTo(cond.getData()) > 0) {
					data = aux.getData();
					aux.setData(cond.getData());
					cond.setData(data);
				}
				cond = cond.getNext();
			}
			aux = aux.getNext();
		}
		
		
		
	}
	
	
	public void remove(T ele) {
		Node<T> aux = this.head;
		if(aux == null) {
			System.out.println("La Lista esta vacia");
		}
		else {
			if(this.head.getData().equals(ele)){
				this.head = aux.getNext();
			}
			else {
				while(aux !=null && aux.getNext()!=null) {
					if(aux.getNext().getData().equals(ele)) {
						Node<T> BorrarNodo = aux.getNext();
						aux.setNext(aux.getNext().getNext());
						BorrarNodo.setNext(null);
					}
					aux = aux.getNext();
				}
			}
		}
	}
	
	public boolean searchOrder(T item) {
		Node<T> aux = this.head;
		while(aux != null) {
			if(aux.getData().equals(item)) {
				return true;
			}
			else
				aux = aux.getNext();
		}
		
		return false;
	}
	
	public void imprimir() {
		Node<T> aux = this.head;
		while (aux.getNext() != null) {
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
		System.out.println(aux.getData());
	}
}
