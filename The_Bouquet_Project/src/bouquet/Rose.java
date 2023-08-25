package bouquet;

public class Rose implements Flower{
	private String roseCode;
	/*
	 * The Unicode for the rose emoji is U+1F339. The UTF-16 encoding for the rose
	 * emoji is \uD83C\uDC39. Also, we can put here directly a specific emoji 🌹.
	 */
	
	Rose(){
		this.roseCode="🌹";
	}
	

	@Override
	public void addIntoBouquet() {
		System.out.println("Adding "+roseCode);	
	}


	@Override
	public String getFlowerCode() {
		return this.roseCode;
	}

}
