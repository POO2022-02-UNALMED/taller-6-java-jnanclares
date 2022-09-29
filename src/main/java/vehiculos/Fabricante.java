package vehiculos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static vehiculos.Vehiculo.fabricantes;


public class Fabricante {
    private String nombre;
    private Pais pais;
    public static Map<String,Integer> contador_fabricantes = new HashMap<String, Integer>();


    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static String fabricaMayorVentas(){
        for (Fabricante value : fabricantes) {
            Integer count = contador_fabricantes.get(value.getNombre());
            contador_fabricantes.put(value.getNombre(), count == null ? 1 : count + 1);
        }
        return Collections.max(contador_fabricantes.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
