
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(75.90, 1.90);
		Paciente p2 = new Paciente(120.25, 2.10);
		Paciente p3 = new Paciente(62.55, 1.87);
		
		//Calcular o IMC
		p1.calcularIMC();
		p2.calcularIMC();
		p3.calcularIMC();
		
		//Receber diagnóstico
		p1.diagnostico();
		p2.diagnostico();
		p3.diagnostico();
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		
	}	
}
