package textExcel;

public class PercentCell extends RealCells{

	public PercentCell (String userInput) {
		
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

