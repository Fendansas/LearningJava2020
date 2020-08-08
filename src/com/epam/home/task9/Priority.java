package com.epam.home.task9;

public enum Priority {

    URGENTLY (1),
    CURRENT (2) ,
    LONG (3);

    private int type;

    Priority(int type){
        this.type = type;
    }

    public  int getType(){
        return type;
    }


}
