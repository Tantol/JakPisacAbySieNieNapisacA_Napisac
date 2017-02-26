import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

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


		
		JPanel characterMenuWindow = new JPanel();
		frame.getContentPane().add(characterMenuWindow, "characterMenuWindow");
		characterMenuWindow.setLayout(new MigLayout("", "[1%:50%][][][][][][][][1%:50%]", "[25%:50%,grow][][25%:50%]"));
		
		JButton btnClass1 = new JButton("New button");
		characterMenuWindow.add(btnClass1, "cell 1 1");
		JButton btnClass2 = new JButton("New button");
		characterMenuWindow.add(btnClass2, "cell 2 1");
		JButton btnClass3 = new JButton("New button");
		characterMenuWindow.add(btnClass3, "cell 3 1");
		JButton btnClass4 = new JButton("New button");
		characterMenuWindow.add(btnClass4, "cell 4 1");
		JButton btnClass5 = new JButton("New button");
		characterMenuWindow.add(btnClass5, "cell 5 1");
		JButton btnClass6 = new JButton("New button");
		characterMenuWindow.add(btnClass6, "cell 6 1");
		JButton btnClass7 = new JButton("New button");
		characterMenuWindow.add(btnClass7, "cell 7 1");
		
		JPanel characterInfoWindow = new JPanel();
		frame.getContentPane().add(characterInfoWindow, "characterInfoWindow");
		characterInfoWindow.setLayout(null);
		characterInfoWindow.setVisible(false);
	}
}
