public class GuitarSpec extends InstrumentSpec{
	private int numStrings;

	public GuitarSpec(Type type, int numStrings, Wood topWood, Wood backWood,
			Builder builder, String model) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof GuitarSpec))
			return false;
		
		GuitarSpec spec = (GuitarSpec) otherSpec;
		if(numStrings != spec.numStrings)
			return false;
		return true;
	}
	
	public int getNumStrings() {
		return this.numStrings;
	}
}
