import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		// Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER,
		// "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		GuitarSpec spec = new GuitarSpec(Type.ELECTRIC, 6, Wood.ALDER,
				Wood.ALDER, Builder.FENDER, "Stratocastor");
		Guitar whatErinLikes = new Guitar("", 0, spec);

		List<Guitar> guitars = inventory.search(whatErinLikes);
		if (!guitars.isEmpty()) {
			System.out.println("Eric, you might like these guitars: ");
			for (Iterator i = guitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				System.out.println(" We have a "
						+ whatErinLikes.getGuitarSpec().getBuilder() + " "
						+ whatErinLikes.getGuitarSpec().getType() + " "
						+ whatErinLikes.getGuitarSpec().getNumStrings() + " "
						+ whatErinLikes.getGuitarSpec().getModel()
						+ " guitar:\n  "
						+ whatErinLikes.getGuitarSpec().getBackWood()
						+ " back and sides, \n  "
						+ whatErinLikes.getGuitarSpec().getTopWood()
						+ " top.\nYou can have it for only $"
						+ guitar.getPrice() + "!\n ------");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothin for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Type.ELECTRIC,
				12, Wood.ALDER, Wood.ALDER, Builder.FENDER, "Stratocastor"));
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Type.ELECTRIC, 6,
				Wood.ALDER, Wood.ALDER, Builder.FENDER, "Stratocastor"));
	}
}
