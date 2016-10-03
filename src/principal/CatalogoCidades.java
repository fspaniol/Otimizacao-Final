package principal;

import java.util.ArrayList;

public class CatalogoCidades {
	private static ArrayList<Cidade> cidadesDestino = new ArrayList<Cidade>();
	
	public static void adicionarCidade(Cidade cidade){
		cidadesDestino.add(cidade);
	}
	
	public static Cidade getCidade(int indice){
		return cidadesDestino.get(indice);
	}
	
	public static int numeroDeCidades(){
		return cidadesDestino.size();
	}

}
