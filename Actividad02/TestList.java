package Actividad02;

public class TestList {

	public static <T> void main (String[] args) {
		System.out.println("Prueba de la ListArray");
		ListArray<String> lista = new ListArray<String>();
		System.out.println("La lista esta vacia? " + lista.isEmptyList());
		lista.insertFirst("Doce");
		lista.insertFirst("Adios");
		lista.insertFirst("14");
		lista.insertLast("asd");
		lista.insertFirst(null);
		
		System.out.println("Adios se encuentra en la lista? " + lista.search("Adios"));
		System.out.println("ADIOS se encuentra en la lista? " + lista.search("ADIOS"));
		System.out.println("La lista esta vacia? " + lista.isEmptyList());
		
		T[] aux = (T[]) lista.getArray();
		for (int i = 0; i < lista.length(); i++) {
			System.out.println("Elemento["+i+"]: " + aux[i]);
		}
		System.out.println("Tamanio: " + lista.length());
		lista.remove("14");
		
		
		aux = (T[]) lista.getArray();
		for (int i = 0; i < lista.length(); i++) {
			System.out.println("Elemento["+i+"]: " + aux[i]);
		}
		System.out.println("Tamanio2: " + lista.length());
		
		
		
		lista.destroyList();
		T[] aux2 = (T[]) lista.getArray();
		for (int i = 0; i < lista.length(); i++) {
			System.out.println("Elemento["+i+"]: " + aux2[i]);
		}
		System.out.println("Tamanio2: " + lista.length());
	}
	
}
