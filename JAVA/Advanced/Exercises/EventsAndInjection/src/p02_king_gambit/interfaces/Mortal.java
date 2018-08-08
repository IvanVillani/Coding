package p02_king_gambit.interfaces;

public interface Mortal extends Attackable{
    boolean isKilled();
    String getName();
    void setIsKilled(boolean state);

}
