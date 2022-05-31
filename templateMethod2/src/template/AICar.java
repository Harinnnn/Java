package template;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("autonomous driving.");
        System.out.println("The car changes direction on its own.");
    }

    @Override
    public void stop() {
        System.out.println("stop its own.");
    }

    @Override
    public void wiper() {
        System.out.println("The speed automatically adjusts according to the amount of rain and snow");
    }

}
