package Actividad03;

import Actividad01.TDAList;

public class ListLinked<T> implements TDAList<T>{
private Node<T> head;
	
	
	public ListLinked() {
		this.head = null;
	}
	
	public ListLinked(Node<T> head) {
		this.head = head;
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	@Override
	public int length() {
		Node<T> aux = this.head;
		int cont = 0;
		while (aux.getNext() != null) {
			aux = aux.getNext();
			cont++;
		}
		return cont;
	}
		
	@Override
	public boolean isEmptyList() {
		return this.head == null;
	}

	@Override
	public void destroyList() {
		this.head = null;
		
	}

	@Override
	public int search(T ele) {
		Node<T> aux = this.head;
		int pos = 0;
		while (aux.getNext() != null) {
			if (aux.getData().equals(ele)) {
				return pos;
			}
			aux = aux.getNext();
			pos++;
		}
		if (aux.getData().equals(ele)) {
			return pos;
		}
		return -1;
	}

	@Override
	public void insertFirst(T ele) {
		Node<T> aux = new Node<T>(ele, this.head);
		this.head = aux;
		
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

	
	public void remove(T ele) {
		Node<T> aux = this.head;
		if(isEmptyList()) {
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
	
	public void imprimir() {
		Node<T> aux = this.head;
		while (aux.getNext() != null) {
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
		System.out.println(aux.getData());
	}
}
