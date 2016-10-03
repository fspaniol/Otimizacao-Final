package principal;

public class Populacao {
	
	Tour[] tours;
	
	public Populacao(int tamanho){
		tours = new Tour[tamanho];
		for(int i = 0; i < tamanho; i++){
			Tour tour = new Tour();
			tour.criaTour();
			setTour(i,tour);
		}
	}
	
	public void imprimePopulacao(){
		for(int i = 0; i < tours.length; i++){
			tours[i].imprimeTour();
		}
	}
	
	public Tour getTour(int indice){
		return tours[indice];
	}
	
	public void setTour(int indice, Tour tour){
		this.tours[indice] = tour;
	}
	
	public Tour maxFitness(){
		Tour maior_fitness = getTour(0);
		for (int i = 0; i < tours.length; i++){
			if (maior_fitness.getFitness() < tours[i].getFitness()){
				maior_fitness = getTour(i);
			}
		}
		return maior_fitness;
	}
	
	public int tamanhoPop(){
		return tours.length;
	}
	
}
