package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	}
	private void setupArray()
	{
		hipsterPhrases[0] = "I listened to Uganden death metal before you did";
		hipsterPhrases[1] = "My bowtie isnt tilted your looking at it wrong";
		hipsterPhrases[2] = "my glasses aren't even broken I'm just trying to look cool";
		hipsterPhrases[3] = "I played BTD5 before it was cool";      
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
}
