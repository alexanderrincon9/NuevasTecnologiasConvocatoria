/*
Reinaldo Rueda técnico de la selección Colombia de futbol, lo 
contrata para elaborar un programa en la consola de JAVA que 
cumpla las siguientes condiciones: 
 
Codificar Menú de 5 opciones 
- op1 Agregar un jugador (NUMERO CAMISETA, NOMBRE, 
APELLIDOS,  POSICION,  EDAD  Y  EQUIPO  DONDE  JUEGA)  a  la 
convocatoria 
- op2  Buscar  un  jugador  por  numero  y  si  no  existe 
notificarlo mediante un mensaje en consola 
- op3 Editar información de un jugador por id y si no existe 
notificarlo 
- op4 Mostrar toda la convocatoria de jugadores 
- op5 Salir 
 
Nota1:  El  inventario  solo  existe  mientras  se  ejecute  el 
programa considere que solo se deben convocar 23 jugadores en 
total 
Nota2:  Trabaje  en  una  interfaz  cómoda  POR  CONSOLA  para  el 
técnico 
Nota3:  (PLUS)  Intente  buscar  una  alternativa  de  JAVA  para 
almacenar un número indeterminado de jugadores en la 
convocatoria 
 */
package convocatoriareinaldorueda;

import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author Alexander_Rincon
 */
public class ConvocatoriaReinaldoRueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner objetoentrada = new Scanner(System.in);
        
        int opcion;
        int contador=0;
        int buscarjugador;
        int modificarjugador;
    
        Jugador []objetojugadores = new Jugador [23];
        
        do{
            System.out.println("----------------------");
            System.out.println("MENU CONVOCATORIA COLOMBIA");
            System.out.println("----------------------");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. Editar Jugador");
            System.out.println("4. Mostrar Jugador");
            System.out.println("5. Salir");
            System.out.println("----------------------");
            System.out.println("DIGITE UNA OPCION: ");
            opcion=objetoentrada.nextInt();
        
        switch(opcion){
                case 1:
                    System.out.println("----------------------");
                    System.out.println("REGISTRAR JUGADOR");
                    objetojugadores[contador]= new Jugador();
                    System.out.println("----------------------");
                    System.out.println("Se requieren los siguientes datos:");
                    System.out.println("Numero:");
                    objetojugadores[contador].setIddorsal(objetoentrada.nextInt());
                    System.out.println("Nombre:");
                    objetojugadores[contador].setNombre(objetoentrada.next());
                    System.out.println("Apellido:");
                    objetojugadores[contador].setApellido(objetoentrada.next());
                    System.out.println("Posicion:");
                    objetojugadores[contador].setPosicion(objetoentrada.next());
                    System.out.println("Edad:");
                    objetojugadores[contador].setEdad(objetoentrada.nextInt());
                    System.out.println("Club:");
                    objetojugadores[contador].setEquipo(objetoentrada.next());
                    contador = contador + 1;
                    System.out.println("----------------------");     

                break;    
                
                case 2:
                    System.out.println("BUSCAR JUGADOR");
                    System.out.println("----------------------");  
                    System.out.println("Digite Numero jugador: ");
                    System.out.println("----------------------");  

                    buscarjugador=objetoentrada.nextInt();
                    
                    for(int i=0; i<contador; i++){
               
                    if ( buscarjugador == objetojugadores[i].getIddorsal()){
                        
                        System.out.println("EL JUGADOR "+buscarjugador+" ES:" );                        
                        System.out.println("NOMBRE: "+objetojugadores[i].getNombre());
                        System.out.println("APELLIDO: "+objetojugadores[i].getApellido());
                        System.out.println("POSICION: "+objetojugadores[i].getPosicion());
                        System.out.println("EDAD: "+objetojugadores[i].getEdad());
                        System.out.println("CLUB: "+objetojugadores[i].getEquipo());
                   
                 break; 
                 
                     }else { 
                        System.out.println("Numero no convocado");
                        System.out.println("Ingresa un numero valido");
                    }
                }
            
                 break;     
                      
                case 3:
                    System.out.println("MODIFICAR DATOS JUGADOR");
                    System.out.println("----------------------");  
                    System.out.println("Digite Numero jugador a modificar: ");
                    System.out.println("------------------------------------");  

                    modificarjugador=objetoentrada.nextInt();

                     for(int i=0; i<contador; i++){

                     if ( modificarjugador == objetojugadores[i].getIddorsal()){
                           
                        System.out.println("El jugador con numero "+modificarjugador+" es " +objetojugadores[i].getNombre()+ " " +objetojugadores[i].getApellido());  
                        System.out.println("Para modificar, ingresa nuevos datos:");
                        System.out.println("----------------------");  
                        System.out.println("Ingresa Nuevo Numero:");
                        objetojugadores[i].setIddorsal(objetoentrada.nextInt());
                        System.out.println("----------------------");  
                        System.out.println("Nombre actual: "+objetojugadores[i].getNombre());
                        System.out.println("Ingresa nuevo nombre:");
                        System.out.println("----------------------");  
                        objetojugadores[i].setNombre(objetoentrada.next());
                        System.out.println("----------------------");  
                        System.out.println("Apellido actual: "+objetojugadores[i].getApellido());
                        System.out.println("Ingresa nuevo apellido:");
                        System.out.println("----------------------");  
                        objetojugadores[i].setApellido(objetoentrada.next());
                        System.out.println("----------------------");  
                        System.out.println("Posicion actual: "+objetojugadores[i].getPosicion());
                        System.out.println("Ingresa nueva posicion:");
                        System.out.println("----------------------");  
                        objetojugadores[i].setPosicion(objetoentrada.next());
                        System.out.println("----------------------");  
                        System.out.println("Edad actual: "+objetojugadores[i].getEdad());
                        System.out.println("Ingresa nueva edad:");
                        System.out.println("----------------------");  
                        objetojugadores[i].setEdad(objetoentrada.nextInt());
                        System.out.println("----------------------");  
                        System.out.println("Club actual: "+objetojugadores[i].getEquipo());
                        System.out.println("Ingresa nuevo club:");
                        System.out.println("----------------------");  
                        objetojugadores[i].setEquipo(objetoentrada.next());
                   
                  
                     }else { 
                        System.out.println("Numero no convocado");
                        System.out.println("Ingresa un numero valido");
                    }
                 }
                break;       
                
                     
                        
                case 4:
                    System.out.println("--------------------"); 
                    System.out.println("JUGADORES CONVOCADOS");
                    System.out.println("--------------------");
                  
                    for(int i=0; i<contador; i++){
                        
                        System.out.println("NUMEO: "+objetojugadores[i].getIddorsal());            
                        System.out.println("NOMBRE: "+objetojugadores[i].getNombre());
                        System.out.println("APELLIDO: "+objetojugadores[i].getApellido());
                        System.out.println("POSICION: "+objetojugadores[i].getPosicion());
                        System.out.println("EDAD: "+objetojugadores[i].getEdad());
                        System.out.println("CLUB: "+objetojugadores[i].getEquipo());
                    }                    
                break;
            
                 case 5:
                        System.exit(0);
                break;
            
                default : 
                break;    
        }
    
        
              }while(opcion!=5);
                  
    }
}
              
              
              

    

              