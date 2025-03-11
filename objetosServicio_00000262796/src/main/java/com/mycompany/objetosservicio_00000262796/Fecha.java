/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetosservicio_00000262796;

import java.util.GregorianCalendar;

/**
 *
 * @author andre
 */
public class Fecha extends GregorianCalendar{

    public Fecha() {
        GregorianCalendar fechaSistema = new GregorianCalendar();
        super.set(0, 0, 0);
        super.setTimeInMillis(0);
    }

    public Fecha(int anio, int mes, int dia, long millis) {
        super(anio, mes, dia);
        //Verificar que esten en 0 para crear el objeto con los mismos valores
        if(anio == 0 && mes == 0 && dia == 0 && millis == 0){
            GregorianCalendar fecha = new GregorianCalendar(anio, mes, dia);
        }
    }
    
    public Fecha(Fecha fecha){
        GregorianCalendar fechaCopia = new GregorianCalendar(anio, mes, dia, millis);
    }
    
    public Fecha(String Fecha){
        GregorianCalendar fechaString = new GregorianCalendar();
        
    }
    
    //Get y set
    public int getDia(){
        return super.DAY_OF_MONTH;
    }
    public int getMes(){
        return super.MONTH;
    }
    public int getAnho(){
        return super.YEAR;
    }
    
    public void setDia(int dia){
        super.DAY_OF_MONTH = dia;
    }
    public void setMes(int mes){
        super.MONTH = mes;
    }
}
