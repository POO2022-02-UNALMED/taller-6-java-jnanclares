package vehiculos;


import java.util.ArrayList;

import static vehiculos.Automovil.automoviles;
import static vehiculos.Camion.camiones;
import static vehiculos.Camioneta.camionetas;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;

    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public static int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricantes.add(this.getFabricante());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static String vehiculosPorTipo(){
        return "Automoviles: " + automoviles + "\n" +
                "Camionetas: " + camionetas + "\n" +
                "Camiones: " + camiones;
    }


}

