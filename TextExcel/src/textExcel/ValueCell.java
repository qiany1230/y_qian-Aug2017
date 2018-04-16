package textExcel;

public class ValueCell extends RealCells{

	public ValueCell (String userInput) {
		
		super (userInput);
	}
	
	@Override
	public String abbreviatedCellText() {

		return null;
	}

	@Override
	public String fullCellText() {

		return null;
	}

	@Override
	public double getDoubleValue() {
		
		return 0;
	}
	
	
	
}
