package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private final Deth8 deth8;

    @Autowired

    public Egg6( Deth8 deth8) {
        this.deth8 = deth8;
    }


    @Override
    public String toString() {
        return ", в яйце иголка " + deth8.toString();
    }
}
