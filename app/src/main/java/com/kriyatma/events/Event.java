package com.kriyatma.events;

/**
 * Created by sreejeshpillai on 07/07/15.
 */
public class Event {
    public static final String COMPLETE = "complete";

    protected String strType = "";
    protected Object params;

    public Event(String type,Object params){
        initProperties(type,params);
    }

    protected void initProperties(String type,Object params){
        strType = type;
        this.params = params;
    }

    public String getStrType(){
        return strType;
    }

    public Object getParams(){

        return this.params;
    }
}
