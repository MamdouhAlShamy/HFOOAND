public class GuitarSpec {
	private Type type;
	private Wood topWood;
	private Wood backWood;
	private Builder builder;
	private String model;
	private int numStrings;

	public GuitarSpec(Type type, int numStrings, Wood topWood, Wood bacWood,
			Builder builder, String model) {
		this.type = type;
		this.numStrings = numStrings;
		this.topWood = topWood;
		this.backWood = bacWood;
		this.builder = builder;
		this.model = model;
	}

	public boolean equals(GuitarSpec otherSpec) {
		if (this.builder != otherSpec.builder)
			return false;
		else if ((model != null) && (!model.equals(""))
				&& (!model.equals(otherSpec.model)))
			return false;
		else if(type != otherSpec.type)
			return false;
		else if(numStrings != otherSpec.numStrings)
			return false;
		else if(this.backWood != otherSpec.backWood)
			return false;
		else if(this.topWood != otherSpec.topWood)
			return false;
		return true;
	}

	public Builder getBuilder() {
		return this.builder;
	}

	public String getModel() {
		return this.model;
	}

	public Type getType() {
		return this.type;
	}

	public int getNumStrings() {
		return this.numStrings;
	}

	public Wood getBackWood() {
		return this.backWood;
	}

	public Wood getTopWood() {
		return this.topWood;
	}

}
