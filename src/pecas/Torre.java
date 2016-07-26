package pecas;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import enums.Time;
import tabuleiro.Casa;
import tabuleiro.FrameTabuleiro;
import tabuleiro.TabuleiroIterator;

public class Torre extends Peca {

	public Torre(Time time) {
		super(time);
	}

	@Override
	public Image getImage() {
		if (getTime() == Time.BRANCO)
			return FrameTabuleiro.torreBranca;
		return FrameTabuleiro.torrePreta;
	}
	
	@Override
	public List<Casa> calcularMovimentosDisponiveis(TabuleiroIterator iterator) {
		ArrayList<Casa> movimentosPossiveis = new ArrayList<Casa>();
		iterator.moverFrenteEnquantoConseguir(movimentosPossiveis);
		iterator.moverTrasEnquantoConseguir(movimentosPossiveis);
		iterator.moverDireitaEnquantoConseguir(movimentosPossiveis);
		iterator.moverEsquerdaEnquantoConseguir(movimentosPossiveis);
		return movimentosPossiveis;
	}


}
