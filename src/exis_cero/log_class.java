
package exis_cero;

public class log_class {
    private registro[] arregloPersonas;
    private int tamaño;

    public log_class() {
        arregloPersonas = new registro[10]; // Tamaño inicial del arreglo
        tamaño = 0;
    }
    public registro buscarPersona(String nombreUser) {
        for (int i = 0; i < tamaño; i++) {
            registro persona = arregloPersonas[i];
            if (persona != null) {
                if (persona.getNombreUser().equals(nombreUser)) {
                    return persona;
                
                }
            }
        }
        return null;
    }
    public boolean agregarPersona(registro persona) {
        registro aux = buscarPersona(persona.getNombreUser());
        if (aux == null) {
            if (tamaño < arregloPersonas.length) {
                arregloPersonas[tamaño] = persona;
                tamaño++;
                return true;
            }
        }
        return false;
    }

   // Object getControlador() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody


}