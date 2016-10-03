package principal;

public class Crossover {

	public static Tour crossover(Tour pai, Tour mae){
		Tour filho = new Tour();
		
		
		int aleatorio = (int) (Math.random() * filho.tamanhoTour());
		
		for (int i = 0; i<aleatorio; i++){
			filho.setCidade(i, pai.getCidade(i));
		}
		
		for (int i = 0; i < filho.tamanhoTour(); i++){
			if(!filho.temCidade(mae.getCidade(i))){
				for (int j = 0; j < filho.tamanhoTour(); j++){
					if (filho.getCidade(j) == null){
						filho.setCidade(j, mae.getCidade(i));
						break;
					}
				}
			}
		}
		
		return filho;
	}
	
}
