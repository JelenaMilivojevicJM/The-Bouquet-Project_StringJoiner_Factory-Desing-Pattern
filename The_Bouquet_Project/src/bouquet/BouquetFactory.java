package bouquet;

public class BouquetFactory {

	public Flower choose(String flower) {
		if (flower.equalsIgnoreCase("Rose")) {
			return new Rose();
		} else if (flower.equalsIgnoreCase("Daisy")) {
			return new Daisy();
		} else if (flower.equalsIgnoreCase("Tulip")) {
			return new Tulip();
		} else {
			return null;
		}
	}

}
