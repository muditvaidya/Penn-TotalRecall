/**
 * 
 */
package behaviors.singleact;

import info.UserPrefs;

import java.awt.event.ActionEvent;

import components.KeyBinder;

/**
 * @author muditvaidya
 *
 */
public class KeyBinderAction extends IdentifiedSingleAction {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new KeyBinder();   //pass a map of current preferences and a list of reserved key combinations as parameteres to this constructor. 
		
	}

}
