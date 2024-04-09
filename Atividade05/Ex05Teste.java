import javax.swing.JFrame;

public class Ex05Teste
{
	public static void main(String[] args) 
	{
		Ex05 painel = new Ex05();
		JFrame aplicativo = new JFrame();
		
		aplicativo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicativo.add( painel );
		aplicativo.setSize( 200, 200 );
		aplicativo.setVisible( true );
	}
}
