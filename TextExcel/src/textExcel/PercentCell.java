package textExcel;

public class PercentCell extends RealCell{
	
	public PercentCell (String userInput) {
		
		super (userInput);
	}
	
	@Override
	public String abbreviatedCellText() {
		int abbreviated = 0;
		int input = Integer.parseInt(super.getInput());
		int decimal = super.getInput().indexOf(".");
		for (int i = decimal - 1; i <= 0; i--) {
			abbreviated.add(input[i]);
		}
		return "";
	}

	@Override
	public String fullCellText() {

		return "" + super.getDoubleValue() / 100;
	}
}

