/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Nota {
    private double porcentaje;
    private double valor;
        
        public Nota(double porcentaje, double valor){
            this.porcentaje = porcentaje;
            this.valor = valor;
        }
        
        public Nota(double porcentaje){
            this.porcentaje = porcentaje;
        }

    public double getPorc (){
        return this.porcentaje;
    }
    public void setPorc (double por){
        this.porcentaje = por;
    }

    public double getVal (){
        return this.valor;
    }
    public void setVal (double value){
        this.valor = value;
    }
    
    @Override
    public String toString() {
        return "Nota: " + valor + "\n" + "Porcentaje:  " + porcentaje;
    }
}