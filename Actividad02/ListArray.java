package Actividad02;

import Actividad01.TDAList;

public class ListArray<T> implements TDAList<T> {
	private int tamanio;
	private T[] array;
	
	public ListArray(int tamanio) {
		this.tamanio = tamanio;
		this.array = (T[]) new Object[tamanio];
	}
	
	public ListArray() {
		this.array = null;
	}
	
	public T[] getArray() {
		return this.array;
	}
	
	@Override
	public int length() {
		return this.tamanio;
	}
	
	@Override
	public boolean isEmptyList() {
		return this.array == null;
	}

	@Override
	public void destroyList() {
		T[] aux = null;
		this.array = aux;
		this.tamanio = 0;
	}

	@Override
	public int search(T ele) {
		for (int i = 0; i < this.tamanio-1; i++) {
			if (this.array[i] != null) {
				if (this.array[i].equals(ele)) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public void insertFirst(T ele) {
		T[] aux = (T[]) new Object[tamanio+1];
		aux[0] = ele;
		for (int i = 1; i < tamanio+1; i++) {
			aux[i] = this.array[i-1];
		}
		this.array = aux;
		this.tamanio = tamanio + 1;
	}

	@Override
	public void insertLast(T ele) {
		T[] aux = (T[]) new Object[tamanio+1];
		aux[tamanio] = ele;
		for (int i = 0; i < tamanio; i++) {
			aux[i] = this.array[i];
		}
		this.array = aux;
		this.tamanio = tamanio + 1;
	}

	@Override
	public void remove(T ele) {
		int pos = -1;
		for (int i = 0; i < this.tamanio; i++) {
			if (this.array[i] != null) {
				if (this.array[i].equals(ele)) {
					pos = i;
					break;
				}
			}
			if ((this.array[i] == null) && (ele == null)) {
				pos = i;
				break;
			}
		}
		if (pos > -1) {
			int lon = this.tamanio-1;
			T[] aux = (T[]) new Object[lon];
			for (int i = pos; i < this.tamanio-1; i++) {
				this.array[i] = this.array[i+1];
			}
			for (int j = 0; j < lon; j++) {
				aux[j] = this.array[j];
			}
			this.array = aux;
			this.tamanio = lon;
		}
	}
	
	
}
