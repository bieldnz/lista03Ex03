package controller;

public class ControllerInverte {
	
	public ControllerInverte() {
		super();
	}
	
	public char[] inverteVetor(char[] vetor, int esquerda, int direita) {
		char aux;
		char[] vetorChar = new char[vetor.length];
		vetorChar = vetor;
		if(direita ==  esquerda) {
			return vetorChar;
		}else if(direita - esquerda == 1) {
			aux = vetorChar[direita];
			vetorChar[direita] = vetorChar[esquerda];
			vetorChar[esquerda] = aux;
			return vetorChar;
		}else {
			aux = vetorChar[direita];
			vetorChar[direita] = vetorChar[esquerda];
			vetorChar[esquerda] = aux;
			return inverteVetor(vetor, esquerda + 1, direita - 1);
		}
	}
	
}
