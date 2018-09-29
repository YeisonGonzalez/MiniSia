import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Carrera carrera1 = new Carrera("Ingenieria Mecatronica",null,"Ingenieria", 179);
		Carrera carrera2 = new Carrera("Ciencias de la Computacion",null,"Ciencias", 180);
                
		Materia materia1 = new Materia("Fundamentacion",null,4,null,"Calculo Diferencial");
        Materia materia2 = new Materia("Fundamentacion",null,4,null,"Calculo Integral");
                
        Profesor profesor1 = new Profesor("Alexei Ochoa",15641654,null);
        Profesor profesor2 = new Profesor("Gabriel Manana",15132148,null);
                
        Grupo grupo1 = new Grupo(null,null,"Lunes y Miercoles de 2 a 4",profesor1);
        Grupo grupo2 = new Grupo(null,null,"Lunes y Miercoles de 4 a 6",profesor2);
                
        Salon salon1 = new Salon(60,"Ciencia y Tecnolgia",404);
        Salon salon2 = new Salon(60,"Ciencia y Tecnolgia",403);
                
        Estudiante crack = new Estudiante("Andres Medina",135137,carrera1,5,null,85.85);
        Estudiante mediocre = new Estudiante("Yeison Gonzalez",135145,carrera2,0,null,5.85);
                
        Nota nota1 = new Nota(25,0);
        Nota nota2 = new Nota(50,0);
      
 System.out.println ("Seleccione su opcion:"+"\n"+"1.Carreras"+"\n"+"2.Estudiantes"+"\n"+"3.Grupos"+"\n"+"4.Materias"+"\n"+
 "5.Notas"+"\n"+"6.Profesores"+"\n"+"7.Salones"+"\n"+"8.Salir") ; 
 
 int elegido=0; 
 
 while (elegido!=8) {
	 Scanner opcion1= new Scanner(System.in);
	 elegido=opcion1.nextInt();
 switch(elegido) {
 case 1:
	 System.out.println(carrera1.toString());
	 System.out.println(carrera2.toString());
	 break;
 case 2:
	 System.out.println(crack.toString());
	 System.out.println(mediocre.toString());
	 break;
 case 3:
	 System.out.println(grupo1.toString());
	 System.out.println(grupo2.toString());
	 break;
 case 4:
	 System.out.println(materia1.toString());
	 System.out.println(materia2.toString());
	 break;
 case 5:
	 System.out.println(nota1.toString());
	 System.out.println(nota2.toString());
	 break;
 case 6:
	 System.out.println(profesor1.toString());
	 System.out.println(profesor2.toString());
	 break;
 case 7:
	 System.out.println(salon1.toString());
	 System.out.println(salon2.toString());
	 break;
 case 8:
	 break;

 }
 }
        }
	

}
