package textExcel;

public class FormulaCell extends RealCell {

	public FormulaCell (String userInput) {
		
		super (userInput);
	}

	@Override
	public double getDoubleValue() {
		
		return 0;
	}
	
}
