package textExcel;

public class PercentCell extends RealCell{
	
	public PercentCell (String userInput) {
		
		super (userInput);
	}
	
	@Override
	public String abbreviatedCellText() {
		String abbreviated = super.getInput().substring(0, super.getInput().indexOf('.')) + "%";
		for (int i = abbreviated.length(); i <= 9; i++)
			abbreviated += " ";
		return abbreviated;
	}

	@Override
	public String fullCellText() {
		
		String input = super.getInput().substring(0, super.getInput().length()-1);
		double doubleValue = Double.parseDouble(input);
		return "" + doubleValue / 100;
	}
	
}

