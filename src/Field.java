public class Field{


    protected static final int DEFAULT_FIELD_SIZE = 3;
    protected static final char DEFAULT_CELL_VALUE = ' ';
    public char[][] field = new char[DEFAULT_FIELD_SIZE][DEFAULT_FIELD_SIZE];

     public Field() {
         this.Show_Field();
     }
     public void eraseField() {
        for(int i = 0; i < DEFAULT_FIELD_SIZE; i++) {
        eraseLine(i);
        }
       }

     public void Show_Field() {
        System.out.println();
       for (int i = 0; i < DEFAULT_FIELD_SIZE; i++ ) {
           showLine(i);
           System.out.println();
        }
        System.out.println();
    }


     public void eraseLine(int lineNumber) {
        for(int i = 0; i < DEFAULT_FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }
     public void showLine(int lineNumber) {
        for (int i = 0; i < DEFAULT_FIELD_SIZE; i++ ) {
            showCell(i, lineNumber);
        }
    }
     public void showCell(int x, int y) {
        System.out.print("[" + field[x][y] + "]");

    }


    public void getCell(int x, int y, char symbol) {

        field[x][y] = symbol;
    }


    public boolean isField(int x, int y) {
        return (x < DEFAULT_FIELD_SIZE && x >=0 && y < DEFAULT_FIELD_SIZE && y >= 0);

    }

    public boolean freeField() {
        for (int i = 0; i < DEFAULT_FIELD_SIZE; i++) {
            for (int j = 0; j < DEFAULT_FIELD_SIZE; j++) {
                if (field[i][j] == DEFAULT_CELL_VALUE)
                    return true;

            }
        }
        return false;
    }

    public boolean isEmptyCell(int x, int y) {
        return field[x][y] == DEFAULT_CELL_VALUE;
    }

}


