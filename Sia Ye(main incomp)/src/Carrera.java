/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Carrera {
    private String nombre;  
    private Materia[] pensum;
    private Estudiante[] lista;
    private String facultad;
    private int creditos;
    private Profesor[] profesores;
        
        public Carrera(String nombre, Materia[] pensum,Estudiante[] estudiantes, String facultad, int creditos, Profesor[] pdP){
            this.nombre = nombre;
            this.pensum = pensum;
            this.lista = estudiantes;
            this.facultad = facultad;
            this.creditos = creditos;
            this.profesores = pdP;
        }
        
        public Carrera(String nombre, Materia[] pensum, String facultad, int creditos){
            this.nombre = nombre;
            this.pensum = pensum;
            this.facultad = facultad;
            this.creditos = creditos;
        }
    
    public String getNom() {
    	return this.nombre;
    }
    public void setNom(String name) {
    	this.nombre = name;
    }
    
    
    public Materia[] getMat (){
        return this.pensum;
        }
    
    public void addMateria(){
        
    }
    
    
    public void setMat (Materia[] mater){
            this.pensum = mater;
        }
    
    public Estudiante[] getEstu (){
        return this.lista;
    }
    public void setEstu (Estudiante[] studnts){
        this.lista = studnts;
    }

        public String getFacl (){
            return this.facultad;
        } 
        public void setFacl (String facu){
            this.facultad = facu;
        }

    public int getCred (){
        return this.creditos;
    }
    public void setCred (int credi){
        this.creditos = credi;
    }


    public Profesor[] getPro (){
        return this.profesores;
    }
    public void setPro (Profesor[] profs){
        this.profesores = profs;
    }
    
    @Override
    public String toString(){
        String lestudiantes = "";
        if(lista!=null) {
        	for (int i = 0; i<this.lista.length;i++){
            lestudiantes +=  lista[i]+ ", ";
        }
        }
        String lprofesores = "";
        if(profesores!=null) {
        for (int i = 0; i<this.profesores.length;i++){
            lestudiantes +=  profesores[i]+ ", ";
        }
        }
        String lmaterias = "";
        if(pensum!=null) {
        for (int i = 0; i<this.pensum.length;i++){
            lestudiantes +=  pensum[i]+ ", ";
        }
        }
        return "Nombre: " + nombre + "\n" + "Facultad: " + facultad + "\n" + "Numero de Creditos: " + creditos + "\n" + "Materias: " + lmaterias + "\n" + "Profesores: " + lprofesores + "\n" + "Numero de estudiantes: " + lestudiantes.length();
    }
}
