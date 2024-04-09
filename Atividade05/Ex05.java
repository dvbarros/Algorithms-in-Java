import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ex05 extends JPanel
{	
	public void paintComponent( Graphics g)
	{
		super.paintComponent( g );
		int passos = 10;
		
		// coordenadas do centro da espiral
		int coordX = getWidth() / 2;
		int coordY = getHeight() / 2;
		
		// coordenadas da outra ponta da linha
		// a coordenada X fica estática na primeira linha, mas a Y muda pra maior
		int coord2X = getWidth() / 2;
		// resolvi fazer por passos pra poder redimensionar a tela e a espiral redimensionar também
		int coord2Y = getHeight() / 2 + ( getHeight() / passos );
		
		g.setColor( Color.blue ); // muda a cor das linhas para azul
		
		// início do loop for que desenha as linhas e muda os valores das coordenadas
		for ( int contador = 1; contador  <= 10; contador++ )
		{			
			// desenha a primeira linha com os valores iniciais
			g.drawLine( coordX, coordY, coord2X, coord2Y );
			
                        // decide se o contador é par ou ímpar
			if ( contador % 2 == 1)
			{
				// muda a coordX e coordY para desenhar a outra linha
				// caso o contador for ímpar
				coordX -= contador * ( getWidth() / passos );
				coordY += contador * ( getHeight() / passos );
			}
			else
			{
				// muda a coordX e coordY caso contador seja par
				coordX += contador * ( getWidth() / passos );
				coordY -= contador * ( getHeight() / passos );
			}
			
			// desenha a outra linha a partir do ultimo ponto
			g.drawLine( coord2X, coord2Y, coordX, coordY);
			
			// muda os valores para desenhar de onde parou
			if ( contador % 2 == 1)
			{
				// muda a coord2X e coord2Y caso seja ímpar
				coord2X -= contador * ( getWidth() / passos );
				// aqui o calculo inclui 1 ao contador para a altura ser o dobro
				// da ultima linha vertical
				coord2Y -= ( 1 + contador ) * ( getHeight() / passos );
			}
			else
			{
				// muda a coord2X e coord 2Y para desenhar a outra linha
				// mesmo caso da anterior em relação ao 1 + contador
				coord2Y += ( 1 + contador ) * ( getHeight() / passos );
				coord2X += contador * ( getWidth() / passos );
			}
		}
	}
}