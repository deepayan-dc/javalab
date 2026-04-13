package lab6.Music.live;

import lab6.Music.Playable;
import lab6.Music.string.Veena;
import lab6.Music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Veena v = new Veena();
        v.play();
        Saxophone s = new Saxophone();
        s.play();
        Playable p;
        p = v;
        p.play();
        p = s;
        p.play();
    }
}
