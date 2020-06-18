
public class TestaCondicional {

	public static void main(String[] args) {
	
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade>= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo!");
					
		}
		else {
			if (quantidadePessoas >= 3) {
			System.out.println("Voce esta acompanhado por este motivo pode entrar.");
			}
			
			else {
			System.out.println("infelizmente voce não pode entrar");
			}
		}

	}

}
