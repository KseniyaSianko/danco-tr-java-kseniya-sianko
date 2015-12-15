package task3;

public class EarpiecesBuilder implements ILineStep {
	
public EarpiecesBuilder() {
		
		System.out.println("EarpiecesBuilder");
	}

	@Override
	public IProductPart buildPoductPart() {
		Earpieces earpieces = new Earpieces ();
		return earpieces;
	}

}
