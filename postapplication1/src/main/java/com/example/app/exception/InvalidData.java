package com.example.app.exception;

public class InvalidData extends  RuntimeException{

    public InvalidData(){}
    public InvalidData(String msg){
        super(msg);
    }
}
