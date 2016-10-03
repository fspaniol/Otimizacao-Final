package principal;

public class Torneio {
	
	public static Tour torneio(Populacao pop){
		Populacao torneio = new Populacao(16);		
		for(int i = 0; i < torneio.tamanhoPop();i++){
			int aleatorio = (int) (Math.random() * torneio.tamanhoPop());
			torneio.setTour(i,pop.getTour(aleatorio));
		}
		Tour melhor = torneio.maxFitness();
		return melhor;
	}

}
