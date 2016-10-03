package principal;

public class Mutacao {
	
	public static Tour mutacao(Tour tour){
		if ((Math.random() % 100 < 15)){
			int posicao1 = (int) (Math.random() * tour.tamanhoTour());
			int posicao2 = (int) (Math.random() * tour.tamanhoTour());
			
			Cidade cidade1 = tour.getCidade(posicao1);
			Cidade cidade2 = tour.getCidade(posicao2);
			
			tour.setCidade(posicao1, cidade2);
			tour.setCidade(posicao2, cidade1);
			
		}
		return tour;
	}

}
