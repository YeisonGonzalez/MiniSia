import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Profesor {
    private String name;
    private int id;
    private float ref;
    private Materia[] exp;
    private Grupo[] grupos;
    private int office;
    
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
    }public float getRef (){
        return this.ref;               
    } 
    public void setRef (float ref){
        this.ref = ref;
    }public Materia[] getExp (){
        return this.exp;
    } 
    public void setExp (Materia[] exp){
        this.exp = exp;
    }
    public Grupo[] getGru (){
	return this.grupos;
    }
    public void setGru (Grupo[] grup){
	this.grupos = grup;
    }
    public int getOffice (){
        return this.office;
    } 
    public void setOffice (int office){
        this.office = office;
    }
    public Profesor(String name,int id,float ref,Materia[] exp,Grupo[] grupos,int office)
    {
    this.setName(name);
    this.setId(id);
    this.setExp(exp);
    this.setRef(ref);
    this.setGru(grupos);
    this.setOffice(office);
    }
    
    public Profesor(String name,int id,Materia[] exp)
    {
    this.setName(name);
    this.setId(id);
    this.setExp(exp);        
    }
	@Override
	public String toString() {
		return "Nombre=" + name +"\n"+ "Identificacion=" + id +"\n"+ "Referencias=" + ref+"\n" + "Experiencia=" + Arrays.toString(exp)+"\n" + "Grupos="
				+ Arrays.toString(grupos)+"\n" + "Oficina=" + office;
	}
    
   
    
}
