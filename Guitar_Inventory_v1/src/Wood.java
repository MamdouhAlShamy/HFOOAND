
public enum Wood {
	INDIAN_ROSEWOOD, BRAZILLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDAC, ALDER, SITKA;
	
	public String toString()
	{
		switch (this) 
		{
			case INDIAN_ROSEWOOD: 		return "Indian Rosewood";
			case BRAZILLIAN_ROSEWOOD: 	return "Brazillian Rosewood";
			case MAHOGANY: 				return "Mahogany";
			case MAPLE: 				return "Maple";
			case COCOBOLO: 				return "Cocobolo";
			case ADIRONDAC: 			return "Adirondac";
			case ALDER: 				return "Adler";
			case SITKA: 				return "Sitka";
			default:					return "";
		}
	}
}
