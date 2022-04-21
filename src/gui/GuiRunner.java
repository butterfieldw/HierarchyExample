/*
Look for the FOUR comments in this code to insert your own additions.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GuiRunner extends JFrame
{
    private JLabel pictureLbl;
    
    public GuiRunner(String title)
    {
	super(title);
	setupJFrame();
    }

    private void setupJFrame()
    {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(600, 400);
	setLocationRelativeTo(null);
	
	JLabel titleLbl = new JLabel("Marvel Heros And Villains");
	titleLbl.setFont(new Font("Trajan Pro", Font.PLAIN, 28));
	titleLbl.setForeground(Color.RED);
	titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
	getContentPane().add(titleLbl, BorderLayout.NORTH);
	
	JComboBox selectionComboBox = new JComboBox();
	selectionComboBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (selectionComboBox.getSelectedIndex() == 0)
			{
				pictureLbl.setIcon(ImageLoader.setImage("gotg.jpg"));
			}
			else
			{
				Selection.setCharacter(pictureLbl, selectionComboBox.getSelectedItem().toString());
			}
		}
	});
	
	selectionComboBox.setModel(new DefaultComboBoxModel(Selection.selectionOptions().toArray()));
	getContentPane().add(selectionComboBox, BorderLayout.SOUTH);
	
	JPanel panel = new JPanel();
	getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
	Component verticalGlue = Box.createVerticalGlue();
	panel.add(verticalGlue);
	
	pictureLbl = new JLabel("Your picture will display here.");
	pictureLbl.setHorizontalAlignment(SwingConstants.CENTER);
	pictureLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
	pictureLbl.setIcon(ImageLoader.setImage("gotg.jpg"));
	panel.add(pictureLbl);
	
	Component verticalGlue_1 = Box.createVerticalGlue();
	panel.add(verticalGlue_1);
	setVisible(true);
    }

	public static void main(String[] args)
    {
	GuiRunner runner = new GuiRunner("Marvel Characters");
    }
}