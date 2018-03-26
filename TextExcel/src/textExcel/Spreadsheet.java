package textExcel;

public class Spreadsheet implements Grid {

	private int numOfRows;
	private int numOfCols;
	private Cell[][] spreadsheet;
	
	public Spreadsheet () {
		
		this.numOfRows = 20;
		this.numOfCols = 12;
		spreadsheet = new EmptyCell[numOfRows][numOfCols];
	}
	
	@Override
	public String processCommand(String command) {
		
		String [] splitOfCommand = command.split(" ");	
		 
		int numOfChar = command.length();
		if (command.contains("=")) {

			String userCommand = splitOfCommand[2];
			int colNum = Character.toUpperCase(splitOfCommand[0].charAt(0)) - 'A';
			int rowNum = splitOfCommand[0].charAt(1);
			//spreadsheet [rowNum][colNum] = userCommand
			return getGridText();
			
		} else if(numOfChar <= 3) {

			String commandClear = splitOfCommand[1];
			int colNum = Character.toUpperCase(splitOfCommand[1].charAt(0)) - 'A';
			int rowNum = splitOfCommand[1].charAt(1);
			return getGridText();
			
		} else if(command.contains("clear") && command.contains(" ")) {
		
			return getGridText();
			
		} else {
			
			//spreadsheet.le;
			return getGridText();
		}
	}

	@Override
	public int getRows() {

		return numOfRows;
	}

	@Override
	public int getCols() {
		
		return numOfCols;
	}

	@Override
	public Cell getCell(Location loc) {
		
		Cell getCell = spreadsheet [loc.getRow()] [loc.getCol()];
		return getCell;
	}

	@Override
	public String getGridText() {
		
		String getgridText = "   |";
		
		for(char a = 'A'; a < 'M'; a++){
			getgridText = getgridText + a + "         |";
		}
		
		for(int i = 1; i <= numOfRows; i++){
			
			getgridText += "\n" + i;
			
			if(i < 10){
				getgridText += "  |";
			}else if(i >= 10){
				getgridText += "  |";
			}
			for(int j = 0; j < numOfCols; j++){
				getgridText += spreadsheet[i-1][j].abbreviatedCellText() + "|";
			}
		}
		getgridText += "\n";
		return getgridText;
	}

}
