package com.kriyatma.events;

/**
 * Created by sreejeshpillai on 07/07/15.
 */
public class Listener {
    private String type;
    private IEventHandler handler;

    public Listener(String type,IEventHandler handler){
        this.type = type;
        this.handler = handler;
    }

    public String getType(){
        return this.type;
    }

    public IEventHandler getHandler(){
        return this.handler;
    }
}
