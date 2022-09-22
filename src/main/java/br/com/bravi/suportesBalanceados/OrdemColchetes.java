package br.com.bravi.suportesBalanceados;

public class OrdemColchetes {

	public String verificarOrdemColchetes(String sequencia) {
		int countParenteses = 0;
		int countChave = 0;
		int countColchete = 0;

		for (int i = 0; i < sequencia.length(); i++) {
			if (i == 0 && (sequencia.charAt(i) == ')' || sequencia.charAt(i) == ']' || sequencia.charAt(i) == '}')) {
				System.out.println("entriu if");
				return "sequência de colchetes é inválida";
			}
			
			switch (sequencia.charAt(i)) {
				case '(':
					countParenteses++;
					break;
				case ')':
					countParenteses--;
					break;
				case '[':
					countChave++;
					break;
				case ']':
					countChave--;
					break;
				case '{':
					countColchete++;
					break;
				case '}':
					countColchete--;
					break;
				default:
					break;
			}
		}

		if (countParenteses + countChave + countColchete == 0) {
			return "sequência de colchetes é válida";
		} else {
			return "sequência de colchetes é inválida";
		}
	}

}
