import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List inventory;

	public Inventory() {
		inventory = new LinkedList();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = null;
		if(spec instanceof GuitarSpec)
		
		Instrument instrument = new Guitar(serialNumber, price, spec);
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}

	public List search(MandolinSpec searchMandolin) {
		List<Guitar> matchedGuitars = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// >> lets take a look to the beauty of the code
			if (searchMandolin.getSpec().equals(guitar.getSpec()))
				matchedGuitars.add(guitar);
		}
		return matchedGuitars;
	}
	
	public List search(GuitarSpec searchGuitar) {
		List<Guitar> matchedGuitars = new LinkedList();
		for (Iterator i = inventory.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// >> lets take a look to the beauty of the code
			if (searchGuitar.getSpec().equals(guitar.getSpec()))
				matchedGuitars.add(guitar);
		}
		return matchedGuitars;
	}
}
