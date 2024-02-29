import java.util.ArrayList;
import java.util.Collections;
public class DominoPile {

    private ArrayList<Domino>pile;

    public DominoPile() {
        pile = new ArrayList<Domino>();
    }
    public void newStack6(){
        for(int top = 0; top <= 6; top++){
            for(int bottom = 0; bottom <= 6; bottom++){
                Domino domino = new Domino(top, bottom);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(pile);
    }
}
