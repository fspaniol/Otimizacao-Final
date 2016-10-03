package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Tour {

	private ArrayList<Cidade> tour = new ArrayList<Cidade>();
	
	public Tour(ArrayList<Cidade> tour){
		this.tour = tour;
	}
	
	public Tour(){
		for (int i = 0; i < CatalogoCidades.numeroDeCidades(); i++){
			tour.add(null);
		}
	}
	
	public void criaTour(){
		for (int i = 0; i < CatalogoCidades.numeroDeCidades(); i++){
			tour.set(i,CatalogoCidades.getCidade(i));
		}
		Collections.shuffle(tour);
	}
	
	public Cidade getCidade(int posicao){
		return tour.get(posicao);
	}
	
	public void setCidade(int posicao, Cidade cidade){
		tour.set(posicao,cidade);
	}
	
	
	public void imprimeTour(){
		for (int i = 0; i < tour.size(); i++){
			System.out.println(imprimeCidade(i));
		}
	}
	
	public String imprimeCidade(int i){
		return ("Cidade " + i + ": " + (getCidade(i)).escrevePosicao());
	}
	
	public int distanciaTour(){
		int distancia = 0;
		for (int i = 0; i < (tour.size() - 1); i++){
			distancia += (getCidade(i).distancia(getCidade(i+1)));
		}
		distancia += (getCidade(tour.size()-1).distancia(getCidade(0)));
		return distancia;
	}
	
	public int getFitness(){
		int fitness = (tour.size() * 300) - distanciaTour();
		fitness *= 8;
		return fitness;
	}
	
	public int tamanhoTour(){
		return tour.size();
	}
	
	public boolean temCidade(Cidade cidade){
		return tour.contains(cidade);
	}

}
