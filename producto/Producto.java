/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2.producto;

/**
 *
 * @author paveg
 */
public class Producto {
    private String nombre;
    private float existencia;
    private float precio=0.01f;
    private float costo;
    static float margenGanancia;
    
    public Producto(String nombre, float existencia, float precio, float costo) {
        setNombre(nombre);
        setExistencia(existencia);
        setPrecio(precio);
        setCosto(costo);
    }
    
    public Producto(String nombre, float precio){
        setNombre(nombre);
        setPrecio(precio);
        if(margenGanancia==0)
            costo=this.precio*.9f;
        else
            costo=this.precio*(100-margenGanancia)/100;
        //setCosto(precio*.9f);
        //costo=precio*.9f;
        //costo=precio*90/100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre=nombre.trim();
        if(nombre.length()>=1 && nombre.length()<=50){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre no válido (entre 1 y 50 caracteres)");
        }
    }

    public float getExistencia() {
        return existencia;
    }

    public void setExistencia(float existencia) {
        if(existencia>=0 && existencia<=1000000){
            this.existencia = existencia;
        }else{
            System.out.println("Existencia no válida (de 0 a 1000000)");
        }
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if(precio>0 && precio<=999999.99){
            this.precio = precio;
        }else{
            System.out.println("Precio no válido (mayor 0 y  hasta 999999.99)");
        }
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        if(costo>=0 && costo<=999999.99){
            this.costo = costo;
        }else{
            System.out.println("Costo no válido (de 0 hasta 999999.99)");
        }
    }
    
    public void comprar(float cant, float costo){
        if(cant>0 && cant+existencia<=1000000){
            existencia+=cant;
            setCosto(costo);
        }else{
            System.out.println("La cantidad a comprar no es válida");
        }    
    }
    
    
    
    public float vender(){
        return vender(1);
    }
//    public float vender(int cant){
//        return vender(cant);
//    }
    public float vender(float cant){
        float total=0;
        if(cant>0 && cant<=existencia){
            existencia-=cant;
            total=cant*precio;
        }else{
            System.out.println("La cantidad a vender no es válida");
        }    
        return total;
    }
    
    public void ajustarPrecio(float porcentaje){
        float ajuste=precio*porcentaje/100; //-2
        float nuevoPrecio=precio+ajuste; //20-2=18
        //setPrecio(nuevoPrecio);
        if(nuevoPrecio>0 && nuevoPrecio<=999999.99){
            this.precio = nuevoPrecio;
        }else{
            System.out.println("El ajuste generó un precio no válido (mayor 0 y  hasta 999999.99)");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
