/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Estudiante
 */
public class Salon {
    private int capacidad;
private String edificio;
private int NumeroDeSalon;

public Salon(int cap,String ed, int NDS ) {
	this.capacidad = cap;
	this.edificio = ed;
	this.NumeroDeSalon = NDS;
}

public Salon(String ed, int NDS ) {
this.edificio = ed;
this.NumeroDeSalon = NDS;
}
public int getCap (){
return this.capacidad;
}
public void setCap (int capa){
this.capacidad = capa;
}
public String getEdi (){
return this.edificio;
}
public void setEdi (String edifi){
this.edificio = edifi;
}

public int getNum (){
return this.NumeroDeSalon;
}
public void setNum (int nds){
this.NumeroDeSalon = nds;
}

    @Override
    public String toString(){
        return "Capacidad: " + capacidad + "\n" + "Edificio: " + edificio + "\n" + "Numero de Salón: " + NumeroDeSalon;
    }
}