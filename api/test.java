class Test {

	public static Integer sumar(Integer a, Integer b) {

		/* declaro lo que necesito */
		Integer respuesta;

		/* hago cálculos */
		respuesta = a + b;

		/* retorno el resultado */
		return respuesta;
	}

	public static void main(String[] args) {

		/* declaro lo que necesito */
		Integer numero1 = 2;
		Integer numero2 = 3;
		Integer resultado;

		/* hago cálculos */
		resultado = sumar(numero1, numero2);
		System.out.println("El resultado es " + resultado);

		/* no retorno nada, pero bueh! */
	}
}
