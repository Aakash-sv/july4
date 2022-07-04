

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 30/06/2022
public class a1SwingConceptsInputDropdown {

	public static void main(String[] args) {

		JFrame f = new JFrame("MY First Swing Program"); // Frame Created and Named

		JTextField userName = new JTextField(); // Text field created for UserName and PassWord
		userName.setBounds(100, 20, 120, 30);

		JTextField passWORD = new JTextField();
		passWORD.setBounds(100, 75, 120, 30);

//		final JPasswordField passWORD = new JPasswordField();
//		passWORD.setBounds(100, 75, 100, 30);

		JLabel userNAMElabel = new JLabel("Username"); // Label Created for UserName and Password
		userNAMElabel.setBounds(20, 20, 120, 30);

		JLabel passWORDLabel = new JLabel("Password:");
		passWORDLabel.setBounds(20, 75, 120, 30);

		JButton BUTTON = new JButton("Save"); // Button Created
		BUTTON.setBounds(138, 120, 80, 30);

		JLabel finalRESULT = new JLabel(); // Label created for Showing the entered UserName and Password
		finalRESULT.setBounds(20, 150, 450, 50);

		f.add(userName);
		f.add(passWORD);
		f.add(userNAMElabel);
		f.add(passWORDLabel);// these f.add created for showing into the frame
		f.add(finalRESULT);
		f.add(BUTTON);

		f.setSize(600, 500);// 600 width and 500 height
		f.setLayout(null);//
		f.setVisible(true);// making the frame visible

		// Action Listener created with BUTTON Reference
		BUTTON.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ActionEvent Used
				String data = "username: " + userName.getText(); // UserName

				data += " & Password: " + new String(passWORD.getText()); // Password

				finalRESULT.setText(data); // Displaying the Final result
			}
		});

	}

}
