package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.HipsterController;

import javax.swing.JPanel;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setFrame();
	}
	public String getResponce(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	private void setFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Hipster Code");
		this.setResizable(false);
		this.setSize(500,500);
		this.setVisible(true);
	}
	public HipsterController getBaseController()
	{
		return baseController;
	}
	
}
