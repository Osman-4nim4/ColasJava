package gt.edu.umg.progra3.colas;

import javax.swing.JOptionPane;

public class AutoServicio {

    public static void main(String[] args) {

        int opcion = 0, nodo_informacion = 0;
        Cola cola = new Cola();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Primer Examen Parcial\n\n"
                        +"Taller Osman\n\n"
                        +"Menu de Opciones\n\n"
                        +"1. Ingreso de carro nuevo\n"
                        +"2. Salida de un carro\n"
                        +"3. Mostrar la cola del taller\n"
                        +"4. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingresa el numero de placa"));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un auto con placa: " 
                                    + cola.Extraer());
                        } else {
                            JOptionPane.showMessageDialog(null, "la cola de autos esta vacia");
                        }
                        break;
                    case 3:
                        cola.MostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                        break;
                }

            } catch (NumberFormatException e) {
            }

        } while (opcion != 4);
    }
}