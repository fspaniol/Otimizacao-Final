package principal;

public class Cidade {
	int posicao_x;
	int posicao_y;
	
	public Cidade(){
		this.posicao_x = (int)(Math.random() * 200);
		this.posicao_y = (int)(Math.random() * 200);
	}
	
	public Cidade (int x, int y){
		this.posicao_x = x;
		this.posicao_y = y;
	}
	
	public int getPosicao_x(){
		return this.posicao_x;
	}
	
	public int getPosicao_y(){
		return this.posicao_y;
	}
	
	public String escrevePosicao(){
		return "Posicao X: " + getPosicao_x() + ", Posicao Y: "+ getPosicao_y();
	}
	
	public double distancia(Cidade k){
		int distanciaX = Math.abs(getPosicao_x() - k.getPosicao_x());
		int distanciaY = Math.abs(getPosicao_y() - k.getPosicao_y());
		return Math.sqrt((distanciaX * distanciaX) + (distanciaY * distanciaY));
	}
}
