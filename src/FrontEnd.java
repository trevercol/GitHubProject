import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

//JComboBox
public class FrontEnd 
{
	public static final Font font = new Font("Comic Sans MS", Font.BOLD, 12);
	
	private JFrame myFrontEnd;
	
	public FrontEnd()
	{
		myFrontEnd = new JFrame();
		
		final JFrame frame = new JFrame("Add or Get your Message");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(600,400));
		frame.setLocation(320, 250);
		
		Box vBox = Box.createVerticalBox();
		frame.add(vBox);
		
		Box newMsgBox = Box.createHorizontalBox();
		Box getMsgBox = Box.createHorizontalBox();
		final JTextArea returnMsg = new JTextArea();
				
		returnMsg.setLineWrap(true);	
		//setWordWrapStyle???
		//JScrollPane scrollPane = new JScrollPane(results);
		
		vBox.add(newMsgBox);
		vBox.add(Box.createHorizontalStrut(42));
		vBox.add(getMsgBox);
		vBox.add(Box.createVerticalStrut(42));
		vBox.add(returnMsg);
		//vBox.add(scrollPane);
		
		// addMsgBox
		
		//JTextField newUsername = new JTextField();
		final JTextField newUsername = new JTextField();
		//JTextField newMessage = new JTextField();
		final JTextField newMessage = new JTextField();
		//JButton addMsg = new JButton("Add Message");
		final JButton addMsg = new JButton("Add Message");
		
		newUsername.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				//JOptionPane.showMessageDialog(frame, arg0.getKeyCode());
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER)
				{
					addMsg.doClick();
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}} );
		
		newUsername.setFont(font);
		newUsername.setForeground(Color.RED);
		newUsername.setBackground(Color.GREEN);
		newUsername.setPreferredSize(new Dimension(300, 20));
		
		newMessage.setFont(font);
		newMessage.setForeground(Color.RED);
		newMessage.setBackground(Color.GREEN);
		newMessage.setPreferredSize(new Dimension(300, 20));
		
	/*	addMsg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String word = inputWord.getText();
				List<String> defs = myDictionary.lookup(word);
				
				String s = results.getText();
				
				s += word + "\n";
				s += "\n";
				for (String def : defs)
				{
					s += "   " + def + "\n";
				}
				s += "\n";
				s += "\n";
				
				results.setText(s);				
				
			}} );	*/
		
		newMsgBox.add(newUsername);
		newMsgBox.add(newMessage);
		newMsgBox.add(addMsg);
		newMsgBox.add(Box.createHorizontalStrut(100));
		
		
		//getMsgBox
		JTextField getUsername = new JTextField();
		JButton getMsg = new JButton("Get Message");
		
		getUsername.setFont(font);
		getUsername.setForeground(Color.BLACK);
		getUsername.setBackground(Color.ORANGE);
		getUsername.setPreferredSize(new Dimension(300, 10));
		
		getMsgBox.add(getUsername);
		getMsgBox.add(getMsg);
		getMsgBox.add(Box.createHorizontalStrut(10));
		
		
		/*//loadBox
		JButton loadButton = new JButton("Load");
		
		loadBox.add(Box.createHorizontalStrut(500));
		loadBox.add(loadButton);
		
		
		loadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Loading...");
				
				JFileChooser chooser = new JFileChooser("../r ");
				
				int x = chooser.showOpenDialog(frame);
				
				if (x == JFileChooser.APPROVE_OPTION)
				{
					File theFile = chooser.getSelectedFile();
					
					String path = theFile.getPath();
					String name = theFile.getName();
					
					//JOptionPane.showMessageDialog(frame, path);
					//JOptionPane.showMessageDialog(frame, name);
					
					int n = myDictionary.load(path);
					JOptionPane.showMessageDialog(frame, n + " words added to Dictionary.");
				}
			}
			
			
			
		} );	*/
		
		
		frame.pack();
		frame.setVisible(true);
		
	}



	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { new FrontEnd(); }
		});
	}

}