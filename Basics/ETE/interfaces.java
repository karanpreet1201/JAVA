public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}



interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("All 4 directions");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("All 4 directions ... ");
    }
}




class King implements ChessPlayer{
    public void moves(){
        System.out.println("All 4 directions ... diagnol also ");
    }
}