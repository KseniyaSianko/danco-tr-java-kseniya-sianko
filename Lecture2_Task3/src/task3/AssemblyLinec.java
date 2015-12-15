package task3;

public class AssemblyLinec implements IAssemblyLine {

	ILineStep firstLine;
	ILineStep secondLine;
	ILineStep thirdLine;
	
	
	
	public AssemblyLinec() {
		
		firstLine = new EarpiecesBuilder();
		secondLine = new KorpusBuilder();
		thirdLine = new LensesBuilder();
		
		System.out.println("AssemblyLinec");
	}


	@Override
	public IProduct assembleProduct(IProduct product) {

		
product.installFirstPart(firstLine.buildPoductPart());
product.installSecondPart(secondLine.buildPoductPart());
product.installThirdPart(thirdLine.buildPoductPart());

System.out.println("Product created");
		return product;
	}

}
