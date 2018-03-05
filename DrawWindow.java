package Application;

//These imports have been initialized by Eclipse WindowBuilder 2018
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JMenuItem;

/**
 * This class is build to contain all the necessary components 
 * of the user friendly interface of the geometry application build by the 
 * class Data Structure Spring 2018. It hosts the instantiations of the canvas
 * J object and the listeners of the panels that contain the buttons.
 * This class contains no logic but rather builds the graphic design for the application. 
 * 
 * @author Ioanna Deni
 * @version Feb. 2018
 *
 */

public class DrawWindow extends JComponent implements ActionListener{
	//Since it is a frame it extends JComponents and has general listeners
	//that apply to the windows functionality
	
	//Instance of the database - TO BE EDITTED
	private DB db = new DB();
	
	//Frame for the application that is divided in 5 parts
	private JFrame frame; 
	
	
	
	//PART 1: THE TOP PANEL - MENUBAR
	
	//This menu hosts the different tabs like "File" "Edit" and "Help"
	private final JMenuBar menuBar = new JMenuBar(); 
	//Drop-down options in the menu bar 
	private final JMenu mnMenu = new JMenu("File"); 
	private final JMenu mnSettings = new JMenu("Settings");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenu mnEdit = new JMenu("Edit");
	// The different items added have temporary names and no functionality 
	// *THEY ARE EXAMPLES*
	private final JMenuItem mntmNewFile = new JMenuItem("New File");
	private final JMenuItem mntmSave = new JMenuItem("Save");
	private final JMenuItem mntmExport = new JMenuItem("Export");
	private final JMenuItem Exit = new JMenuItem("Exit");
	private final JMenuItem mntmUndo = new JMenuItem("Undo");
	private final JMenuItem mntmRedo = new JMenuItem("Redo");
	private final JMenuItem mntmCopy = new JMenuItem("Copy");
	private final JMenuItem mntmMouseMode = new JMenuItem("Mouse Mode");
	private final JMenuItem mntmSystem = new JMenuItem("System");
	private final JMenuItem mntmContactUs = new JMenuItem("Contact us");
	
	
	
	//PART 2: THE SECOND TOP PANEL - SHORTCUTS BUTTONS
	
	//This toolBar will host the buttons on the top of the window under the menuBar
	private final JToolBar toolBar = new JToolBar();	
	// The different buttons added have temporary names and no functionality 
	// *THEY ARE EXAMPLES*
	private final JButton cutButton = new JButton("");
	private final JButton copyButton = new JButton("");
	private final JButton pasteButton = new JButton("");
	private final JButton redoButton = new JButton("");
	private final JButton undoButton = new JButton("");
	private final JButton thicknessButton = new JButton("");
	private final JButton wordsButton = new JButton("");
	private final JButton newFile = new JButton("");
	private final JButton playButton = new JButton("");
	private final JButton saveButton = new JButton("");
	
	
	
	//PART 3: MIDDLE CANVAS AREA
	
	//This is temporary the name of the canvas object
	private DrawLineAndPoint canvasGUI = new DrawLineAndPoint(db);
	
	
	
	//PART 4: LEFT PANEL - SIDE BUTTONS 
	
	//This second toolBar hosts the side buttons of the window
	private final JToolBar toolBar_1 = new JToolBar();
	// The different buttons added have temporary names and no functionality 
	// *THEY ARE EXAMPLES*
	private final JButton revTriangle = new JButton("");
	private final JButton triangle = new JButton("");
	private final JButton squares = new JButton("");
	private final JButton circle = new JButton("");
	private final JButton lineRight = new JButton("");
	private final JButton lineUp = new JButton("");
	private final JButton lineLeft = new JButton("");
	private final JButton makeBigger = new JButton("");
	private final JButton makeSmaller = new JButton("");
	
	
	
	//PART 5: BOTTOM LABEL - CANVAS TAB
	
	//This label is at the bottom of the window and exist because we aim to be able to work in 
	//multiple canvases at the same time like excel and tabs
	private final JLabel bottomLabel = new JLabel("Canvas 1");
	
	
	
	// THE FOLLOWING COMMENTED LINES ARE IMPORTANT
	// **DO NOT DELETE**
	// They are used in window builder as coordinates to make the presentation 
	// If deleted the window will not be generated - but they remain the same so 
	// if copy pasted they should work
		
	/**
	 * @wbp.nonvisual location=64,179
	 */
	/**
	 * Launch the application.
	 *
	 */
	public static void main(String[] args) {
		// this is the main function necessary to run the application
		EventQueue.invokeLater(new Runnable() {
			// It runs - so we can add animations too 
			public void run() {
				try {
					//Creates a new window and makes it visible
					DrawWindow window = new DrawWindow();
					window.frame.setVisible(true);
					// and catches exceptions generated by the window builder
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DrawWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Creates the frame for the application and sets its size and 
		//closing procedure
		frame = new JFrame();
		frame.setBounds(100, 100, 873, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//adds the different JComponents in the frame
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		frame.getContentPane().add(canvasGUI, BorderLayout.CENTER);
		frame.getContentPane().add(bottomLabel, BorderLayout.SOUTH);
		frame.getContentPane().add(toolBar_1, BorderLayout.WEST);
		
		
		//adds the buttons in the top menuBar   
		menuBar.add(mnMenu);
		mnMenu.add(mntmNewFile);
		mnMenu.add(mntmSave);
		mnMenu.add(mntmExport);
		mnMenu.add(Exit);
		menuBar.add(mnEdit);
		mnEdit.add(mntmUndo);
		mnEdit.add(mntmRedo);
		mnEdit.add(mntmCopy);
		menuBar.add(mnSettings);
		mnSettings.add(mntmMouseMode);
		mnSettings.add(mntmSystem);
		menuBar.add(mnHelp);
		mnHelp.add(mntmContactUs);
		// This will give a better color and fond to the Menu options on the menu bar
		mnMenu.setForeground(SystemColor.menuText);
		mnHelp.setForeground(SystemColor.menuText);
		mnSettings.setForeground(SystemColor.menuText);
		mnEdit.setForeground(SystemColor.menuText);
		
		// adds the buttons to the toolBar at the top of the window under the menuBar
		toolBar.add(newFile);
		toolBar.add(saveButton);
		toolBar.add(cutButton);
		toolBar.add(copyButton);
		toolBar.add(pasteButton);
		toolBar.add(redoButton);
		toolBar.add(undoButton);
		toolBar.add(thicknessButton);
		toolBar.add(wordsButton);
		toolBar.add(playButton);
		// These buttons have no displayed text only an icon provided by eclipse - see readme for more info
		newFile.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		saveButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		cutButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		copyButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")));
		pasteButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		redoButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		undoButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		thicknessButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/FontBackgroundColor_16x16_JFX.png")));
		wordsButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/web/skin/Bold_16x16_JFX.png")));
		playButton.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));		
		// and the buttons listeners - TO BE EDITED
		newFile.addActionListener(this);
		saveButton.addActionListener(this);
		cutButton.addActionListener(this);
		copyButton.addActionListener(this);
		pasteButton.addActionListener(this);
		redoButton.addActionListener(this);
		undoButton.addActionListener(this);
		thicknessButton.addActionListener(this);
		wordsButton.addActionListener(this);
		playButton.addActionListener(this);
		saveButton.addActionListener(this);
		
		
		// adds the buttons to the secondary toolBar at the side of the window under the menuBar
		toolBar_1.add(triangle);
		toolBar_1.add(squares);
		toolBar_1.add(revTriangle);
		toolBar_1.add(circle);
		toolBar_1.add(lineUp);
		toolBar_1.add(lineRight);
		toolBar_1.add(lineLeft);
		toolBar_1.add(makeBigger);
		toolBar_1.add(makeSmaller);
		// This allows the toolBar to be vertical instead of horizontal
		toolBar_1.setOrientation(SwingConstants.VERTICAL);
		// These buttons have no displayed text only an icon provided by eclipse - see readme for more info
		triangle.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/sortUp.png")));
		revTriangle.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/sortDown.png")));
		squares.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/javafx/scene/control/skin/caspian/pattern-transparent.png")));
		lineRight.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		circle.setIcon(new ImageIcon(DrawWindow.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		lineRight.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		lineUp.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/expanded.gif")));
		lineLeft.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed.gif")));
		makeBigger.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/maximize.gif")));
		makeSmaller.setIcon(new ImageIcon(DrawWindow.class.getResource("/javax/swing/plaf/metal/icons/ocean/iconify-pressed.gif")));
		// and the buttons listeners - TO BE EDITED
		triangle.addActionListener(this);
		revTriangle.addActionListener(this);
		squares.addActionListener(this);
		circle.addActionListener(this);
		lineRight.addActionListener(this);
		lineUp.addActionListener(this);
		lineLeft.addActionListener(this);
		makeBigger.addActionListener(this);
		makeSmaller.addActionListener(this);
		
		// We set the bottom label to be more user friendly 
		bottomLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		bottomLabel.setForeground(UIManager.getColor("EditorPane.selectionBackground"));
		
		}

	/**
	 * This class has been generated for the distribution of the listeners of the buttons.
	 * It does not hold the functions itself but it is rather responsible for updating the window 
	 * once the functions from the ButtonController class have been completed upon the 
	 * selection of a specific button.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		
		//Finds the source - the button that has been clicked
		Object source = event.getSource();
		
		//**THIS IS AN EXAMPLE**
		// the code for now will identify the buttons clicked and write on the console the name + "was clicked."
		if(source == saveButton){
			System.out.println("save was clicked.");}
		else if(source == cutButton){
			System.out.println("cut was clicked.");}
		else if(source == copyButton){
			System.out.println("copy was clicked.");}
		else if(source == pasteButton){
			System.out.println("paste was clicked.");}
		else if(source == redoButton){
			System.out.println("redo was clicked.");}
		else if(source == undoButton){
			System.out.println("undo was clicked.");}
		else if(source == thicknessButton){
			System.out.println("highlight was clicked.");}
		else if(source == wordsButton){
			System.out.println("letter was clicked.");}
		else if(source == playButton){
			System.out.println("play was clicked.");}
		else if(source == newFile){
			System.out.println("file was clicked.");}
		else if(source == revTriangle){
			System.out.println("reverse triangle was clicked.");}
		else if(source == triangle){
			System.out.println("triangle was clicked.");}
		else if(source == circle){
			System.out.println("circle was clicked.");}
		else if(source == lineUp){
			System.out.println("line up was clicked.");}
		else if(source == lineRight){
			System.out.println("line right was clicked.");}
		else if(source == squares){
			System.out.println("squares was clicked.");}
		else if(source == lineLeft){
			System.out.println("line left was clicked.");}
		else if(source == makeBigger){
			System.out.println("make bigger was clicked.");}
		else if(source == makeSmaller){
			System.out.println("make small was clicked.");}
		
		
	}
}
