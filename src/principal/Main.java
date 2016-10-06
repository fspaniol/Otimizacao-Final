package principal;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int posicao_x;
		int posicao_y;
		
		System.out.println("Comece a inserir as cidades");
		
		while(in.hasNextInt()){
			//System.out.println("Insira posição X");
			posicao_x = in.nextInt();
			//System.out.println("Insira posição Y");
			posicao_y = in.nextInt();
			Cidade cidade = new Cidade(posicao_x,posicao_y);
			CatalogoCidades.adicionarCidade(cidade);
			System.out.println(cidade.escrevePosicao());
		}
		
		in.close();
		
		/*Cidade cidade = new Cidade(0, 0);
        CatalogoCidades.adicionarCidade(cidade);
        Cidade cidade2 = new Cidade(10, 150);
        CatalogoCidades.adicionarCidade(cidade2);
        Cidade cidade3 = new Cidade(20, 100);
        CatalogoCidades.adicionarCidade(cidade3);
        Cidade cidade4 = new Cidade(30, 180);
        CatalogoCidades.adicionarCidade(cidade4);
        Cidade cidade5 = new Cidade(40, 30);
        CatalogoCidades.adicionarCidade(cidade5);
        Cidade cidade6 = new Cidade(50, 70);
        CatalogoCidades.adicionarCidade(cidade6);
        Cidade cidade7 = new Cidade(60, 80);
        CatalogoCidades.adicionarCidade(cidade7);
        Cidade cidade8 = new Cidade(70, 100);
        CatalogoCidades.adicionarCidade(cidade8);
        Cidade cidade9 = new Cidade(80, 00);
        CatalogoCidades.adicionarCidade(cidade9);
        Cidade cidade10 = new Cidade(90, 180);
        CatalogoCidades.adicionarCidade(cidade10);
        Cidade cidade11 = new Cidade(100, 130);
        CatalogoCidades.adicionarCidade(cidade11);
        Cidade cidade12 = new Cidade(110, 30);
        CatalogoCidades.adicionarCidade(cidade12);
        Cidade cidade13 = new Cidade(120, 80);
        CatalogoCidades.adicionarCidade(cidade13);
        Cidade cidade14 = new Cidade(130, 60);
        CatalogoCidades.adicionarCidade(cidade14);
        Cidade cidade15 = new Cidade(140, 100);
        CatalogoCidades.adicionarCidade(cidade15);
        Cidade cidade16 = new Cidade(150, 160);
        CatalogoCidades.adicionarCidade(cidade16);
        Cidade cidade17 = new Cidade(160, 20);
        CatalogoCidades.adicionarCidade(cidade17);
        Cidade cidade18 = new Cidade(170, 190);
        CatalogoCidades.adicionarCidade(cidade18);
        Cidade cidade19 = new Cidade(180, 20);
        CatalogoCidades.adicionarCidade(cidade19);
        Cidade cidade20 = new Cidade(190, 80);
        CatalogoCidades.adicionarCidade(cidade20);
		*/
		
		Populacao pop = new Populacao(50);
		System.out.println("Distancia inicial: " + pop.maxFitness().distanciaTour());
		int melhor_distancia = pop.maxFitness().distanciaTour();
		
		for(int i = 0; i < 1000; i++){
			pop = AlgGen.novaPop(pop);
			if (melhor_distancia > pop.maxFitness().distanciaTour())
				melhor_distancia = pop.maxFitness().distanciaTour();
		}
		
		System.out.println("Distancia final: " + pop.maxFitness().distanciaTour());
		System.out.println("Distancia melhor: " + melhor_distancia);
		//pop.maxFitness().imprimeTour();
		//pop.imprimePopulacao();
		
	}

}
