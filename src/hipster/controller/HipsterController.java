package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

public class HipsterController
{
	private HipsterFrame baseFrame;
	private Hipster firstHipster;
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
	public void setBaseFrame(HipsterFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	public void setFirstHipster(Hipster firstHipster)
	{
		this.firstHipster = firstHipster;
	}
	public HipsterController()
	{
		baseFrame = new HipsterFrame(this);
	}
public void start()
{
	
}
}
