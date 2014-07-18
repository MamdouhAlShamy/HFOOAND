
public class GuitarSpec {
	private Type type;
	private Wood topWood;
	private Wood backWood;
	private Builder builder;
	private String model;
	
	public GuitarSpec(Type type, Wood topWood, Wood bacWood, Builder builder, String model)
	{
		this.type = type;
		this.topWood = topWood;
		this.backWood = bacWood;
		this.builder = builder;
		this.model = model;
	}
	
	public Builder getBuilder()
	{
		return this.builder;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	public Wood getBackWood()
	{
		return this.backWood;
	}
	
	public Wood getTopWood()
	{
		return this.topWood;
	}

}
