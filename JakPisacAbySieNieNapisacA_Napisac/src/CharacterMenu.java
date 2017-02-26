import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CharacterMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterMenu window = new CharacterMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CharacterMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(800,400));	
		frame.setBounds(100, 100, 950, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));


		ChampionList champion = new ChampionList();
		JPanel characterMenuWindow = new JPanel();
		frame.getContentPane().add(characterMenuWindow, "characterMenuWindow");
		characterMenuWindow.setLayout(new MigLayout("", "[1%:50%][][][][][][][][1%:50%]", "[25%:50%][30%][25%:50%][]"));
		JButton btnClass1 = new JButton(champion.Amazon.getName());
		characterMenuWindow.add(btnClass1, "cell 1 1");
		JButton btnClass2 = new JButton(champion.Assasin.getName());
		characterMenuWindow.add(btnClass2, "cell 2 1");
		JButton btnClass3 = new JButton(champion.Necromancer.getName());
		characterMenuWindow.add(btnClass3, "cell 3 1");
		JButton btnClass4 = new JButton(champion.Barbarian.getName());
		characterMenuWindow.add(btnClass4, "cell 4 1");
		JButton btnClass5 = new JButton(champion.Paladin.getName());
		characterMenuWindow.add(btnClass5, "cell 5 1");
		JButton btnClass6 = new JButton(champion.Sorceress.getName());
		characterMenuWindow.add(btnClass6, "cell 6 1");
		JButton btnClass7 = new JButton(champion.Druid.getName());
		characterMenuWindow.add(btnClass7, "cell 7 1");
		
		JButton btnNewButton = new JButton("Exit");
		characterMenuWindow.add(btnNewButton, "cell 0 3");
		
		JPanel characterInfoWindow = new JPanel();
		frame.getContentPane().add(characterInfoWindow, "characterInfoWindow");
		characterInfoWindow.setLayout(null);
		characterInfoWindow.setVisible(false);
	}
}
