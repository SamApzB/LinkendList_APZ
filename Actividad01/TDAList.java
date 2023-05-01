package Actividad01;

public interface TDAList<T> {
	public boolean isEmptyList();
	public void destroyList();
	public int search(T ele);
	public void insertFirst(T ele);
	public void insertLast(T ele);
	public void remove(T ele);
	public int length();
}