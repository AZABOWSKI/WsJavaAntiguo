package _02_personalizadas;

//Excepci�n personalizada.
//Si extendemos de Exception son excepciones Checked
//Si extendemos de RuntimeException son excepciones unchecked
public class SaldoNegativoException extends Exception {

	private static final long serialVersionUID = 1L;

	// Constructor vac�o
	public SaldoNegativoException() {
		super();
	}

	// Constructor con mensaje de error
	public SaldoNegativoException(String mensajeError) {
		super(mensajeError);
	}
}