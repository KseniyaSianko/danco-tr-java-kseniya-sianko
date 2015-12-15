package task3;

public class KorpusBuilder implements ILineStep {
	
public KorpusBuilder() {
		
		System.out.println("KorpusBuilder");
	}

	@Override
	public IProductPart buildPoductPart() {
		
		Korpus korpus = new Korpus ();
		return korpus;
	}

}
