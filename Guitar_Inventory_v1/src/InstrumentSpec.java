public abstract class InstrumentSpec {
	private Type type;
	private Wood topWood;
	private Wood backWood;
	private Builder builder;
	private String model;

	public InstrumentSpec(Builder builder, String model, Type type,
			Wood backWood, Wood topWood) {
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
		this.builder = builder;
		this.model = model;
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

	public Wood getBackWood() {
		return this.backWood;
	}

	public Wood getTopWood() {
		return this.topWood;
	}

	public InstrumentSpec getSpec() {
		return this;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (this.builder != otherSpec.builder)
			return false;
		else if ((model != null) && (!model.equals(""))
				&& (!model.equals(otherSpec.model)))
			return false;
		else if (type != otherSpec.type)
			return false;
		else if (this.backWood != otherSpec.backWood)
			return false;
		else if (this.topWood != otherSpec.topWood)
			return false;
		return true;
	}

}
