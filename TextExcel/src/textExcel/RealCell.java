package textExcel;

public abstract class RealCell implements Cell {

	private String input;
	
	public RealCell(String input) {
	
		this.input = input;
	}
	
	public double getDoubleValue() {
		
		double doubleValue = Double.parseDouble(input);
		return doubleValue;
	}
	
	public String getInput() {
		
		return this.input;
	}
	
	@Override
	public String abbreviatedCellText() {

		String abbreviated = "";
		if (input.length() > 10) {
			abbreviated = input.substring(0, 10);
		} else {
			abbreviated += input;
			for (int i= 0; i < 10 - input.length(); i++) {
				abbreviated += " ";
			}
		}
		return abbreviated;
	}

	@Override
	public String fullCellText() {

		return input;
	}
	

}
