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

		String abbreviated = "" + getDoubleValue();
		if (abbreviated.length() > 10) {
			abbreviated = abbreviated.substring(0, 10);
		} else {
			for (int i = abbreviated.length(); i < 10; i++) {
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
