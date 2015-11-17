package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

public class HipsterController
{
	private HipsterFrame baseFrame;
	private Hipster firstHipster;

	public HipsterController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}

	public void setBaseFrame(HipsterFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}

	public void start()
	{
		String myName = baseFrame.getResponce("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s Hipster Project");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}

	public void setFirstHipster(Hipster firstHipster)
	{
		this.firstHipster = firstHipster;
	}

	

	
}
