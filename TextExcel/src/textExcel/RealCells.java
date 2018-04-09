package textExcel;

public abstract class RealCells implements Cell {

	private String input;
	
	public RealCells(String input) {
	
		this.input = input;
	}
	
	public abstract double getDoubleValue();
	
	
	@Override
	public String abbreviatedCellText() {

		return null;
	}

	@Override
	public String fullCellText() {

		return null;
	}
	

}
