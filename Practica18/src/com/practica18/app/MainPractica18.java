package com.practica18.app;
import java.util.Stack;
//import java.util.Iterator;

public class MainPractica18 {

	public static void main(String[] args) {
		Stack<String> miStack = new Stack<String>();
		miStack.push("Magda");
		miStack.push("Omar");
		miStack.push("Neltzy");
		miStack.push("Nicole");
		miStack.push("Jesus");
		miStack.add("Emma");
		
		/*//hace un traverse pero no vacia la pila
		Iterator<String> miIterator = miStack.iterator();
		while(miIterator.hasNext()) {
			System.out.println(miIterator.next());
		}*/
		
		while(!miStack.empty()) {
			System.out.println(miStack.pop());
		}
	}

}
