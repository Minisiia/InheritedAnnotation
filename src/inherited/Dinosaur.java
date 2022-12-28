package inherited;

import inherited.annotation.ClassPreamble;
import inherited.annotation.DinosaurAction;
import inherited.annotation.DinosaurInfo;

@ClassPreamble(
        author = "Anastasiia Dolbina",
        date = "28-12-2022",
        lastModified = "28-12-2022"
)
@DinosaurInfo(dinosaurGenera = "Archosauria")
public class Dinosaur {
    @Deprecated
    public Boolean isHerbivorous;
@DinosaurAction(act = "sleeping")
    public void actionNow(String act) {
        System.out.println(" is " + act);
    }
}
