package principal;

public class AlgGen {

	public static Populacao novaPop(Populacao pop){
		Populacao novaPop = new Populacao(pop.tamanhoPop());
		
		//novaPop.setTour(0, pop.maxFitness());
		
		for (int i = 0; i < novaPop.tamanhoPop(); i++){
			Tour pai = Torneio.torneio(pop);
			Tour mae = Torneio.torneio(pop);
			Tour filho = Crossover.crossover(pai,mae);		
			novaPop.setTour(i, filho);
		}
		
		for (int i = 1; i < novaPop.tamanhoPop(); i++){
			novaPop.setTour(i,Mutacao.mutacao(novaPop.getTour(i)));
		}
		
		return novaPop;
	}
}
