package task3;

public class Glasses implements IProduct {
	
	IProductPart FirstPart;
	IProductPart SecondPart;
	IProductPart ThirdPart;
	
	
public Glasses() {
		
		System.out.println("Glasses");
}

@Override
public void installFirstPart(IProductPart productRart) {
	
	FirstPart = productRart;	
	System.out.println(productRart.toString()+"installed");
}

@Override
public void installSecondPart(IProductPart productRart) {
	
	SecondPart = productRart;	
	System.out.println(productRart.toString()+"installed");
	
}

@Override
public void installThirdPart(IProductPart productRart) {
	
	ThirdPart = productRart;	
	System.out.println(productRart.toString()+"installed");
	
}
}