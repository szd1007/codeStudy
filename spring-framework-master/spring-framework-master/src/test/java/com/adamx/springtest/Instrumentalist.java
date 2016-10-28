package com.adamx.springtest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zm on 2016/8/7.
 */
public class Instrumentalist implements Performer {
    private  Instrument instrument;

    @Autowired
    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
    public void perform() {
        instrument.play();
    }
}
