package Business.GameLogic;

import Business.Gamepiece.Gamepiece;

import java.util.List;

public interface Player {
    public void moveGamepiece(Gamepiece gamepiece, Field field);

    Gamepiece chooseGamepiece(Gamepiece gamepiece);

    public void useItem(Gamepiece gamepiece);

    public void setName(String name);
    public String getName();
    public void removeGamepiece(Gamepiece gamepiece);
    public List<Gamepiece> getOwnGamepieces();



}
