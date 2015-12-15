package task3;

public class LensesBuilder implements ILineStep {
	
public LensesBuilder() {
		
		System.out.println("LensesBuilder");
	}

	@Override
	public IProductPart buildPoductPart() {
		
		Lenses lenses = new Lenses ();
		return lenses;
	}
}
