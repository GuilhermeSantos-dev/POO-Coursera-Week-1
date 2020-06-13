
public class Paciente {
	double peso;
	double altura;
	String resultado;
	double imc;
	
	//Construtor
	public Paciente(double pesoPaciente, double alturaPaciente) {
		peso = pesoPaciente;
		altura = alturaPaciente;
	}
	
	//Métodos
	void calcularIMC() {
		imc = peso/(altura*altura);		
	}
	
	void diagnostico() {
		if(imc<16) {
			resultado = "Baixo peso muito grave";
		}
		
		else if((imc>=16) && (imc<=16.99)) {
			resultado = "Baixo peso grave";
		}
		
		else if((imc>=17) && (imc<=18.49)) {
			resultado = "Baixo peso";
		}
		
		else if((imc>=18.50) && (imc<=24.99)) {
			resultado = "Peso normal";
		}
		
		else if((imc>=25) && (imc<=29.99)) {
			resultado = "Sobrepeso";
		}
		
		else if((imc>=30) && (imc<=34.99)) {
			resultado = "Obesidade grau I";
		}
		
		else if((imc>=34.99) && (imc<=39.99)) {
			resultado = "Obesidade grau II";
		}
		
		else{
			resultado = "Obesidade grau III";
		}
	}
	void imprimir() {
			System.out.println("---");
			System.out.println("IMC: "+imc);
			System.out.println("Resultado: "+resultado);
		}

}
