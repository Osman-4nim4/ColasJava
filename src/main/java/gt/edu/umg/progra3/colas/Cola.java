
package gt.edu.umg.progra3.colas;

import javax.swing.JOptionPane;

public class Cola {
     private Nodo inicioTaller, finalTaller;
    String Cola="";
    
    public Cola(){
        inicioTaller= null;
        finalTaller= null;
    }
    
    //metodo para saber si la cola de los autos del taller esta vacia
    public boolean ColaVacia(){
        if (inicioTaller == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar a la cola
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioTaller = nuevo_nodo;
            finalTaller = nuevo_nodo;
        } else {
            finalTaller.siguiente = nuevo_nodo;
            finalTaller = nuevo_nodo;
        }
    }
    
    //Método para extraer de la cola
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioTaller.informacion;
            
            if (inicioTaller == inicioTaller) {
                inicioTaller = null;
                finalTaller = null;
            } else {
                inicioTaller = inicioTaller.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioTaller;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " +cadena[i];                    
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}