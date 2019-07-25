package com.tarea1.model;

public abstract class Multiplicaciones {
	public static String multiplica(int a, int b) {
		int res;
		res = a*b;
		return String.format("%d x %d = %d", a,b,res);
	}
}
