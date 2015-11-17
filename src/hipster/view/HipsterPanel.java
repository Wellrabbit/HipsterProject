package hipster.view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import hipster.controller.HipsterController;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	public HipsterPanel(HipsterController baseController)
	{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	phraseComboBox = new JComboBox<String>();
	
	setupComboBox();
		
	setupPanel();
	setupLayout();
	setupListeners();
	}
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
		
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(phraseComboBox);
		this.setBackground(Color.MAGENTA);
	
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
				
			}
		});
	}
}
