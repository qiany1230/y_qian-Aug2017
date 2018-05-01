package textExcel;

public class FormulaCell extends RealCell {

	private String[] array;
	private Spreadsheet spreadsheet;
	
	public FormulaCell (String input, Spreadsheet spreadsheet) {
		
		super(input);
		this.spreadsheet = spreadsheet;
		this.array = input.split(" ");
	}

	@Override
	public double getDoubleValue() {

		double result = getValue(array[1]);
		double operand = 0;
		for (int i = 3; i < array.length - 1; i += 2) {
			operand = getValue(array[i]);
			String operator = array[i-1];
				if (operator.equals("+")) {
					result += operand;
				} else if (operator.equals("-")) {
					result -= operand;
				} else if (operator.equals("*")) {
					result *= operand;
				} else if (operator.equals("/")) {
					result /= operand;
				}
			}
		return result;
	}
	public double getValue (String input) {
		
		double operand = 0;
		if (input.matches(".*[a-zA-Z]+.*")) {
			SpreadsheetLocation value = new SpreadsheetLocation(input);
			Cell cell = spreadsheet.getCell(value);
			if (cell instanceof RealCell) {
				operand = Double.parseDouble(cell.fullCellText());
			} else 
				operand = 0;
		} else 
			operand = Double.parseDouble(input);
		return operand;
	}
}