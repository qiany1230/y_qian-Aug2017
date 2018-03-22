package textExcel;

public class SpreadsheetLocation implements Location {
	
	private String cellName;
	
    @Override
    public int getRow() {
    		
    	int RowNum = Integer.parseInt(cellName.substring(1)) - 1;    
        return RowNum;
    }

    @Override
    public int getCol() {

    	int ColNum = cellName.charAt(0) - 'A';
        return ColNum;
    }
    
    public SpreadsheetLocation(String cellName) {
    	
       this.cellName = cellName;
    }

}
