/**
 * 
 */
package com.uvg.ejemplo1;

/**
 * @author MAAG
 *
 */
public class Calc implements IBasicArithmetic, IMemory{
	
	private int memory;

	@Override
	public void saveValue(int value) {
		memory = value;
	}

	@Override
	public int getValue() {		
		return memory;
	}

	@Override
	public int addition(int operator1, int operator2) {
		return operator1 + operator2;
	}

	@Override
	public int substraction(int operator1, int operator2) {
		return operator1 - operator2;
	}

	@Override
	public int multiplication(int operator1, int operator2) {
		
		int producto = 0;
		
		for (int i = 0; i < operator2; i++) {
			producto = addition(producto, operator1);
		}
		
		return producto;
	}

	@Override
	public int div(int operator1, int operator2) {
		int cociente = 0;
		int resultado = substraction(operator1, operator2);
		
		while(resultado >= 0) {
			cociente++;
			resultado = substraction(resultado, operator2);
		}
		
		return cociente;
	}

	@Override
	public int mod(int operator1, int operator2) {
		int resultado = substraction(operator1, operator2);
		
		while(resultado >= 0) {
			resultado = substraction(resultado, operator2);
		}
		
		return (resultado + operator2);
	}

}
