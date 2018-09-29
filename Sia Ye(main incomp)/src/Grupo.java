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
public class Grupo{
	private Nota[] notas;
	private Estudiante[] lista;
	private String horario;
	private Profesor profe;	

	public Nota[] getNot (){
		return this.notas;
	}
	public void setNot (Nota[] note){
		this.notas =note;
	}

	public Estudiante[] getEstu (){
		return this.lista;
	}
	public void setEstu (Estudiante[] studnts){
		this.lista = studnts;
	}
	
	public String getHor (){
		return this.horario;
	}
	public void setHor (String hora){
		this.horario =hora;
	}

	public Profesor getPro (){
		return this.profe;
	}
	public void setPro (Profesor prof){
		this.profe = prof;
	}
        
        public Grupo(Nota[] notas,Estudiante[] lista,String horario,Profesor profe)
        {
            this.setNot(notas);
            this.setEstu (lista);
            this.setHor(horario);
            this.setPro(profe);
            
        }
        public Grupo(Estudiante[] lista,String horario,Profesor profe)
        {
            this.setEstu(lista);
            this.setHor(horario);
            this.setPro(profe);
            
        }
        
        
		@Override
		public String toString() {
			return "Notas=" + Arrays.toString(notas) + "\n"+"Lista del grupo=" + Arrays.toString(lista) +"\n"+ "Horario="
					+ horario +"\n"+ "Profesor=" + profe;
		}
                
   
}
