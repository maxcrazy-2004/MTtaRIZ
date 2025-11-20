package LAB3;

public class lab3 {
    public static void main(String[] args)
    {
        board field = new board();
        user player1 = new user("Player #1", 'X');
        user player2 = new user("Player #2", 'O');

        user currentPlayer = player1;
        int moveCount = 0;

        System.out.print("\n");

        while (true)
        {
            field.gameFieldPrint();

            int[] move;
            while (true)
            {
                move = currentPlayer.makeMove();
                if (field.setFieldCell(move[0], move[1], currentPlayer.getSymbol()))
                {
                    break;
                }
            }

            moveCount++;

            if (field.isWin(currentPlayer.getSymbol()))
            {
                field.gameFieldPrint();
                System.out.println("Win = " + currentPlayer.getName());
                break;
            }

            if (moveCount == 9)
            {
                field.gameFieldPrint();
                System.out.println("Draw");
                break;
            }

            if (currentPlayer == player1)
            {
                currentPlayer = player2;
            }
            else
            {
                currentPlayer = player1;
            }
        }
    }
}

