package graphics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.List;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;

public class Main1 {

	private JFrame frmLcmsid;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 window = new Main1();
					window.frmLcmsid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLcmsid = new JFrame();
		frmLcmsid.setTitle("LCMS2ID");
		frmLcmsid.setBounds(100, 100, 707, 484);
		frmLcmsid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmLcmsid.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Input");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmFile = new JMenuItem("File");
		mnNewMenu.add(mntmFile);
		
		JMenu mnNewMenu_1 = new JMenu("Settings");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmChemspiderToken = new JMenuItem("ChemSpider Token");
		mnNewMenu_1.add(mntmChemspiderToken);
		
		JMenuItem mntmR = new JMenuItem("R");
		mnNewMenu_1.add(mntmR);
		
		JMenuItem mntmOutput = new JMenuItem("Output");
		mnNewMenu_1.add(mntmOutput);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmMannual = new JMenuItem("Mannual");
		mnHelp.add(mntmMannual);
		frmLcmsid.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmLcmsid.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panel.add(panel_12, BorderLayout.EAST);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_13.add(panel_14);
		
		JLabel lblIonization = new JLabel("Ionization");
		panel_14.add(lblIonization);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Neutral", "Positive", "Negative"}));
		panel_14.add(comboBox_2);
		
		JPanel panel_15 = new JPanel();
		panel_13.add(panel_15);
		panel_15.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAdduct = new JButton("Adduct");
		panel_15.add(btnAdduct);
		
		JButton btnDatabase = new JButton("Database");
		panel_15.add(btnDatabase);
		
		JPanel panel_16 = new JPanel();
		panel_13.add(panel_16);
		
		JLabel lblTolerance_2 = new JLabel("Tolerance");
		panel_16.add(lblTolerance_2);
		
		textField_2 = new JTextField();
		panel_16.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPpm_2 = new JLabel("ppm");
		panel_16.add(lblPpm_2);
		
		JPanel panel_18 = new JPanel();
		panel_12.add(panel_18, BorderLayout.NORTH);
		
		JButton btnExample = new JButton("Example");
		btnExample.setVerticalAlignment(SwingConstants.TOP);
		panel_18.add(btnExample);
		
		JButton btnNewButton_1 = new JButton("Reset");
		panel_18.add(btnNewButton_1);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_19, BorderLayout.CENTER);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));
		
		JEditorPane editorPane = new JEditorPane();
		panel_19.add(editorPane);
		
		JPanel panel_17 = new JPanel();
		panel.add(panel_17, BorderLayout.NORTH);
		panel_17.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMsSearch = new JLabel("MS Search");
		lblMsSearch.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(lblMsSearch);
		
		JPanel panel_1 = new JPanel();
		frmLcmsid.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("MS/MS Library Search");
		panel_4.add(chckbxNewCheckBox);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Method");
		panel_6.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"adjfiefjid", "bdfefjdkf", "cdfkefoekof"}));
		panel_6.add(comboBox);
		
		JLabel lblTolerance = new JLabel("              Tolerance");
		panel_6.add(lblTolerance);
		
		textField = new JTextField();
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblPpm = new JLabel("ppm");
		panel_6.add(lblPpm);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxInSilicoIdentification = new JCheckBox("In Silico Identification");
		chckbxInSilicoIdentification.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(chckbxInSilicoIdentification);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		JLabel lblMethod = new JLabel("Method");
		panel_7.add(lblMethod);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"dfjeifj", "dfiefj", "dfje"}));
		panel_7.add(comboBox_1);
		
		JLabel lblTolerance_1 = new JLabel("                   Tolerance");
		panel_7.add(lblTolerance_1);
		
		textField_1 = new JTextField();
		panel_7.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPpm_1 = new JLabel("ppm");
		panel_7.add(lblPpm_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_8.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblConsole = new JLabel("Console");
		lblConsole.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblConsole, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		panel_3.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, BorderLayout.EAST);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_9.add(panel_10);
		
		JLabel lblCore = new JLabel("Core");
		panel_10.add(lblCore);
		
		JSpinner spinner = new JSpinner();
		panel_10.add(spinner);
		
		JPanel panel_11 = new JPanel();
		panel_9.add(panel_11);
		
		JLabel lblStart = new JLabel("Duration");
		panel_11.add(lblStart);
		
		JLabel lblNewLabel_1 = new JLabel("00:00");
		panel_11.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Run");
		panel_9.add(btnNewButton);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
