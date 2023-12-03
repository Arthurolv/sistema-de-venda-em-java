/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javavendass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    public static boolean isNumeric(String Numero){
    try {
        Integer.parseInt(Numero);
        return true;
    }catch(NumberFormatException nfe){
        return false;
    }
    }
    
    
    public static int objectToInt(Object obj) {
    if (obj instanceof Integer) {
        return (int) obj;
    } else if (obj instanceof String) {
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException e) {
            // Lidar com a exceção, se necessário
        }
    }
    // Retornar um valor padrão se a conversão falhar
    return 0; // Ou outro valor padrão apropriado
}

    
    public static double objectToDouble(Object obj) {
    if (obj instanceof Double) {
        return (double) obj;
    } else if (obj instanceof String) {
        try {
            return Double.parseDouble((String) obj);
        } catch (NumberFormatException e) {
            // Lidar com a exceção, se necessário
        }
    }
    // Retornar um valor padrão se a conversão falhar
    return 0.0; // Ou outro valor padrão apropriado
}

    public static boolean objectToBoolean(Object obj) {
           String CadBool = objectToString(obj);
           Boolean bool = new Boolean(CadBool);
            return bool;
        }
    
    public static String objectToString(Object obj) {
    if (obj == null) {
        return "null";
    } else {
        return obj.toString();
    }
}

   
//        public static int objectToInt(Object obj) {
//            int NumInt = Integer.parseInt(objectToString(obj));
//            return NumInt;
//        }
//
//        public static double objectToDouble(Object obj) {
//            String Str = obj.toString();
//            double NumDouble = Double.valueOf(Str).doubleValue();
//            return NumDouble;
//        }
//
//        public static boolean objectToBoolean(Object obj) {
//            String CadBool = objectToString(obj);
//            Boolean bool = new Boolean(CadBool);
//            return bool;
//        }
//
//        public static String objectToString(Object obj) {
//            String Str = "";
//
//            if (obj == null) {
//                Str = obj.toString();
//            }
//
//            return Str;
//        }
    
    public static Date StringtoDate(String Data ){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yy/MM/dd");
        Date x = null;
    try{
        x = formatotexto.parse(Data);
        
    }catch (ParseException ex ){
    
    }
    return x;
    }
}








    
    
   