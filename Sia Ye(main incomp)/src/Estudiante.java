/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    private String name;
    private int id;
    private Carrera carrera;
    private double papa;
    private Grupo[] grupos;
    private double porcentaje;
    
    public String getName (){
        return this.name;
    } 
    public void setName (String n){
        this.name = n;
    }

    public int getId (){
        return this.id;
    } 
    public void setId (int id){
        this.id = id;
    }

    public Carrera getCarr (){
	return this.carrera;
    }
    public void setCarr (Carrera carre){
	this.carrera = carre;
    }

    public double getPa (){
        return this.papa;
    } 
    public void setPa (double pap){
        this.papa = pap;
    }

    public Grupo[] getGru (){
	return this.grupos;
    }
    public void setGru (Grupo[] grup){
	this.grupos = grup;
    }

    public double getPorDC (){
        return this.porcentaje;
    } 
    public void setPorDC (double porcn){
        this.porcentaje = porcn;
    }
    
    public Estudiante(String name,int id,Carrera carreras,double papa,Grupo[] grupos,double porcentaje)
    {
        this.setName(name);
        this.setId(id);
        this.setCarr(carreras);
        this.setPa(papa);
        this.setGru(grupos);
        this.setPorDC(porcentaje);
    }
    public Estudiante(String name,int id,Carrera carreras,double porcentaje)
    {
        this.setName(name);
        this.setId(id);
        this.setCarr(carreras);              
        this.setPorDC(porcentaje);
    }
    
   @Override
   public String toString(){
       
       String agrupos="";
       if(grupos!=null) {
    	   for (int j=0; j<grupos.length;j++)    		   
       {
        agrupos+=grupos[j]+",";
       }
   }
       return "Nombre:"+name+ "\n"+"Identificacion:"+id+"\n"+"Carrera:"+this.carrera+"\n"+"PAPA:"+papa+"\n"+"Grupos:"+agrupos+"\n"+"porcentaje"+porcentaje;
   }

    
}
