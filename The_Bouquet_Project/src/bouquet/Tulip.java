package bouquet;

public class Tulip implements Flower{

	private String tulipCode;
	/*
	 * The Unicode for the tulip emoji is U+1F337. The UTF-16 encoding for the tulip
	 * emoji (🌷) is "\uD83C\uDF37". 
	 */
	
	Tulip(){
		this.tulipCode= "\uD83C\uDF37";
	}
	
	@Override
	public void addIntoBouquet() {
		System.out.println("Adding "+tulipCode);
	}

	@Override
	public String getFlowerCode() {
		return this.tulipCode;
	}

}
