public class Game {
        private final int col = 10;
        private final int row = 10;
        private String[][] board = new String[col][row];
        private int selectedCol;
        private int selectedRow;
        public Game(){
                for(int i = 0 ;i<row;i++){ 
                        for(int j=0;j<col;j++){
                                double rand =Math.random();
                                if (rand < 0.5) {
                                    board[i][j] = "0";   
                                }    
                                else if (rand >= 0.5) {
                                        board[i][j] = "#";    
                                }
                        }
                       
                }
           

        }
        public String getPiece(int acol,int arow) {
                return board[arow][acol];
        }
        public void Show(){
                for(int a = 0 ;a<row;a++){
                        for(int b=0;b<col;b++){
                             System.out.print(board[a][b]+"  ");
                        }
                       System.out.println("  ");
                       System.out.println("");
                }
              
        }

     
        public void selectPiece(int aaselectedCol,int aaselectedRow){
                selectedCol = aaselectedCol;
                selectedRow = aaselectedRow;
                if(board[selectedRow][selectedCol].equals("#")){
                 System.out.println("You Lose");}else{
                        System.out.println("You Won");
                 }

}

}
