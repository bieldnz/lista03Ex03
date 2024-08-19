package view;

import controller.ControllerInverte;

public class Principal {
	public static void main(String[] args) {
		ControllerInverte controller = new ControllerInverte();
		String texto = "gabriel";
		char[] vet = new char[texto.length()];
		vet = texto.toCharArray();
		vet = controller.inverteVetor(vet, 0, texto.length()-1);
		for(int x = 0; x < vet.length; x++) {
			System.out.print(vet[x]);
		}
	}
}
