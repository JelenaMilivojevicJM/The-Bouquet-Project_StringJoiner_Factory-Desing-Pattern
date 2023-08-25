package bouquet;

public class Daisy implements Flower{
	
	private String daisyCode;
	/*
	 * The Unicode for the blossom emoji, which is often used to represent a daisy,
	 * is U+1F33C. The UTF-16 encoding for the daisy emoji is "\uD83C\uDF3C"
	 */
	Daisy(){
		this.daisyCode = "\uD83C\uDF3C";
	}
	
	@Override
	public void addIntoBouquet() {
		System.out.println("Adding "+daisyCode);	
	}

	@Override
	public String getFlowerCode() {
		return this.daisyCode;
	}

}
