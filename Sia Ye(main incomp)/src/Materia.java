/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Materia {
    private Nota[] notas;
	private String tipologia;
	private Carrera[] carreras;
	private int creditos;
	private Grupo[] grupos;
    private String nombre;
	
        public Materia(Nota[] notas, String tipologia, Carrera[] carreras, int creditos, Grupo[] grupos,String nombre){
            this.notas = notas;
            this.tipologia = tipologia;
            this.carreras = carreras;
            this.creditos = creditos;
            this.grupos = grupos;
            this.nombre = nombre;
        }
        
        public Materia(String tipologia, Carrera[] carreras, int creditos, Grupo[] grupos, String nombre){
            this.tipologia = tipologia;
            this.carreras = carreras;
            this.creditos = creditos;
            this.grupos = grupos;
            this.nombre = nombre;
        }
        
	public Nota[] getNot(){
		return this.notas;
	}
	public void setNot (Nota[] note){
		this.notas =note;
	}

	public String getTipo (){
		return this.tipologia;
	}
	public void setTipo (String tipol){
		this.tipologia =tipol;
	}

	public Carrera[] getCarr (){
		return this.carreras;
	}
	public void setCarr (Carrera[] carre){
		this.carreras = carre;
	}
	
	public int getCred (){
		return this.creditos;
	}
	public void setCred (int credi){
		this.creditos = credi;
	}

	public Grupo[] getGru (){
		return this.grupos;
	}
	public void setGru (Grupo[] grup){
		this.grupos = grup;
	}
        
        @Override
        public String toString(){
            String lcarreras = "";
            if(carreras!=null) {
            for (int i = 0; i<this.carreras.length;i++){
                lcarreras +=  carreras[i]+ ", ";
            }
            }
            if(grupos!=null) {
            
            	return "Nombre: " + nombre + "\n" + "Tipologia: " + tipologia + "\n" + "Numero de Creditos: " + creditos + "\n" + "Ofrecida para: " + lcarreras + "\n" + "Numero de grupos: "+grupos.length ;
            }
            return "Nombre: " + nombre + "\n" + "Tipologia: " + tipologia + "\n" + "Numero de Creditos: " + creditos + "\n" + "Ofrecida para: " + lcarreras + "\n" + "Numero de grupos:desconocido" ;
        }
            
            
}
