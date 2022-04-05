import javax.swing.JFrame;

public class BasicGameFrame extends JFrame{
	
	BasicGameFrame(){
		
		this.add(new BasicGamePanel());
		//instead of GP gp = new GP(); then this.add(gp);
		this.setTitle("BasicSnakeGame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}

}
