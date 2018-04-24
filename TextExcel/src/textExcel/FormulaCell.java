package textExcel;

public class FormulaCell extends RealCell {

	private String[] array;
	
	public FormulaCell (String input) {
		
		super(input);
		this.array = input.split(" ");
	}

	@Override
	public double getDoubleValue() {

		double result = Double.parseDouble(array[1]);
		if (array.length > 5) {
			for (int i = 3; i < array.length - 1; i += 2) {
				double number = Double.parseDouble(array[i]);
				//do math operations
				result =+ number;
				
			}
		}
		return 0;
	}
	
}