/**
 * 
 */
package components;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.*;
/**
 * @author muditvaidya
 *
 */
public class KeyBinderGUI extends JFrame implements ActionListener, MouseListener {
	private int keycount;
	private JLabel label[];
	private JTextField keyentry[];
	private JPanel xpanel[];
	
	public KeyBinderGUI(Map<String,KeyStroke> defaults, List<KeyStroke> reserved) { 
		keycount = defaults.size();
		Iterator it = defaults.keySet().iterator();
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));

		int i=0;
		while(it.hasNext()) {
			String thislabel = (String) it.next();
			label[i] = new JLabel(thislabel);
			keyentry[i] = new JTextField(defaults.get(thislabel).toString());
			keyentry[i].addActionListener(this);
			keyentry[i].addMouseListener(this);
			keyentry[i].setEditable(false);
			xpanel[i] = new JPanel();
			xpanel[i].add(label[i]);
			xpanel[i].add(keyentry[i]);
			xpanel[i].setLayout(new BoxLayout(xpanel[i], BoxLayout.X_AXIS));
			mainPane.add(xpanel[i]);
		}		
		
		mainPane.add(new JButton("Reset Defaults"));
		
		setContentPane(mainPane);	
	}
	
	public void mouseClicked(MouseEvent e) {
		
		JTextField field = (JTextField) e.getSource();
		field.setEditable(true);
		
		// Implement the actual key binding code here. 
		
		
		KeyStroke newBinding = KeyStroke.getKeyStroke(//read from the GUI);
						
				
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub		
	}
	
}
