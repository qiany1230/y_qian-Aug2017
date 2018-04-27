package textExcel;

public class FormulaCell extends RealCell {

	private String[] array;
	private Spreadsheet grid;
	
	public FormulaCell (String input, Spreadsheet grid) {
		
		super(input);
		this.grid = grid;
		this.array = input.split(" ");
	}

	@Override
	public double getDoubleValue() {

		double result = Double.parseDouble(array[1]);
		for (int i = 3; i < array.length - 1; i += 2) {
			//cell reference
			if (array[1]) {
			double operand = Double.parseDouble(array[i]);
			} else() {
			
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
		}
		return result;
	}
	
	public double getValue(String s) {