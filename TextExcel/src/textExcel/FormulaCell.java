package textExcel;

public class FormulaCell extends RealCell {

	private String[] array;
	private Spreadsheet spreadsheet;

	public FormulaCell(String input, Spreadsheet spreadsheet) {

		super(input);
		this.spreadsheet = spreadsheet;
		this.array = input.toUpperCase().split(" ");
	}

	@Override
	public double getDoubleValue() {

		double result = 0;
		double operand = 0;
		if (array[1].equals("SUM") || array[1].equals("AVG")) {
			int numOfTimes = 0;
			String[] range = array[2].split("-");
			SpreadsheetLocation start = new SpreadsheetLocation(range[0]);
			SpreadsheetLocation end = new SpreadsheetLocation(range[1]);
			for (int i = start.getCol(); i <= end.getCol(); i++) {
				for (int j = start.getRow(); j <= end.getRow(); j++) {
					result += spreadsheet.getCell(i, j).getDoubleValue();
					numOfTimes ++;
				}
			}
			if (array[1].equals("AVG")) {
				result = result / numOfTimes;
			}
		} else {
			result = getValue(array[1]);
			for (int i = 3; i < array.length - 1; i += 2) {
				operand = getValue(array[i]);
				String operator = array[i - 1];
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
		}
		return result;
	}

	public double getValue(String input) {

		double operand = 0;
		if (input.matches(".*[a-zA-Z]+.*")) {
			SpreadsheetLocation value = new SpreadsheetLocation(input);
			Cell cell = spreadsheet.getCell(value);
			operand = cell.getDoubleValue();
		} else {
			operand = Double.parseDouble(input);
		}
		return operand;
	}
}