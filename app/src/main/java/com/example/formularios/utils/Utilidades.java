package com.example.formularios.utils;

public class Utilidades {

    public static Boolean isNumber(String element){
        try {
            return (Integer.parseInt(element)>0 ||Integer.parseInt(element)<=0);

        }catch (Exception e ){
            return false;
        }
    }
}
