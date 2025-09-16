/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeproductos2;

import java.util.Set;
import java.util.TreeSet;

public class Repositorio {

    private static TreeSet<Producto> productos = new TreeSet<>();

    public static boolean agregarProducto(Producto p) {
        return productos.add(p);
    }

    public static boolean eliminarProducto(int codigo) {
        return productos.removeIf(p -> p.getCodigo() == codigo);
    }
    
    
    public static Set<Producto> listarProductos() {
    return productos;
    }
    

    public static Set<Producto> buscarPorNombre(String texto) {
        Set<Producto> filtrados = new TreeSet<>();
        for (Producto p : productos) {
            if (p.getDescripcion().toLowerCase().contains(texto.toLowerCase())) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public static Set<Producto> buscarPorRubro(String rubro) {
        Set<Producto> filtrados = new TreeSet<>();
        for (Producto p : productos) {
            if (p.getRubro().equalsIgnoreCase(rubro)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public static Set<Producto> buscarPorPrecio(double precioMax) {
        Set<Producto> filtrados = new TreeSet<>();
        for (Producto p : productos) {
            if (p.getPrecio() <= precioMax) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    
    public static Set<Producto> buscarPorRangoPrecio(double min, double max) {
    Set<Producto> filtrados = new TreeSet<>();
    for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            filtrados.add(p);
        }
    }
    return filtrados;
}

}
