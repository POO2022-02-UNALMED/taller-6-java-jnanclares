package vehiculos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static vehiculos.Vehiculo.fabricantes;

public class Pais {
    private String nombre;
    public static Map<Pais,Integer> contador_paises = new HashMap<Pais, Integer>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        for (Fabricante value : fabricantes) {
            Integer count = contador_paises.get(value.getPais());
            contador_paises.put(value.getPais(), count == null ? 1 : count + 1);
        }
        return Collections.max(contador_paises.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
