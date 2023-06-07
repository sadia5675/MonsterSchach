package Business.GameLogic;

import Business.Gamepiece.Gamepiece;
import Business.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class GamefieldImpl implements Gamefield{
    int maxItemAmount = 15 ;
    List<Field> fields;
    Player player1;
    Player player2;
    GamefieldImpl(){
        fields = new ArrayList<>();
        player1 = new PlayerImpl("susi");
        player2 = new PlayerImpl("busi");

    }

    public void createGamefield(){
        Gamepiece gamepiece;
        Item item = null;
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if((int)(Math.random() *10) > 5 && maxItemAmount > 0) {
                    item = null;
                    maxItemAmount--;
                }
                switch (row) {
                    case 3 -> {
                        switch (column) {
                            case 0 -> gamepiece = player1.getOwnGamepieces().get(2);
                            case 1 -> gamepiece = player1.getOwnGamepieces().get(0);
                            case 6 -> gamepiece = player2.getOwnGamepieces().get(0);
                            case 7 -> gamepiece = player2.getOwnGamepieces().get(3);
                            default -> gamepiece = null;
                        }
                    }
                    case 4 -> {
                        switch (column) {
                            case 0 -> gamepiece = player1.getOwnGamepieces().get(3);
                            case 1 -> gamepiece = player1.getOwnGamepieces().get(1);
                            case 6 -> gamepiece = player2.getOwnGamepieces().get(1);
                            case 7 -> gamepiece = player2.getOwnGamepieces().get(2);
                            default -> gamepiece = null;
                        }
                    }
                    default -> gamepiece = null;
                }
                fields.add(new FieldImpl(row, column, gamepiece, item));
            }
        }
    }
}
