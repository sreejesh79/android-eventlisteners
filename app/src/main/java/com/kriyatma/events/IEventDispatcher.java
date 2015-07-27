package com.kriyatma.events;

/**
 * Created by sreejeshpillai on 07/07/15.
 */
public interface IEventDispatcher {
    public void addEventListener(String type,IEventHandler cbInterface);
    public void removeEventListener(String type);
    public void dispatchEvent(Event event);
    public Boolean hasEventListener(String type);
    public void removeAllListeners();
}
