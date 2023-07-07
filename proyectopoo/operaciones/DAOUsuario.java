/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.operaciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectopoo.modelos.Usuario;

/**
 *
 * @author paveg
 */
public class DAOUsuario {
    public ArrayList<Usuario> leerUsuarios(){
        ArrayList<Usuario> listaUsuarios=new ArrayList<>();
        try{
            ArrayList<String> lineas=Utileria.leerArchivo("usuarios.txt");
            for(String linea:lineas){
                String[] partesLinea=linea.split("-,-");
                Usuario usuario=new Usuario();
                usuario.setNombre(partesLinea[0]);
                usuario.setApellidos(partesLinea[1]);
                usuario.setTipo(partesLinea[2]);
                usuario.setUsuario(partesLinea[3]);
                usuario.setContrasenia(partesLinea[4]);
                listaUsuarios.add(usuario);
            }
            return listaUsuarios;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"No pudo cargar "
                    + "los usuarios");
            return null;
        }
    }
    
    public boolean agregar(Usuario usuario){
        return Utileria.agregarLinea(usuario.toString(), 
                "usuarios.txt");
    }
    
    public Usuario buscar(String usuario){
        ArrayList<Usuario> usuariosExistentes=leerUsuarios();
        
        Usuario usuarioBuscado=new Usuario();
        usuarioBuscado.setUsuario(usuario);
        
        int posicion=usuariosExistentes.indexOf(usuarioBuscado);
        if(posicion>=0){
            return usuariosExistentes.get(posicion);
        }else{
            return null;
        }
//        for (int i = 0; i < usuariosExistentes.size(); i++) {
//                if(usuariosExistentes.get(i).getUsuario().equals(usuario)){
//                    return usuariosExistentes.get(i);
//                }
//        }
//        return null;
    }
    
    public boolean editar(Usuario usuario){
        //Cargar todos los usuarios
        ArrayList<Usuario> usuariosExistentes=leerUsuarios();
        //Buscar cual usuario voy a modificar 
        int posicion=usuariosExistentes.indexOf(usuario);
        if(posicion>=0){
            //Reemplazar el usuario viejo en la lista por el nuevo
            usuariosExistentes.set(posicion, usuario);
            
            //Vaciar esa lista en archivo
            return Utileria.reescribirArchivo(usuariosExistentes, 
                    "usuarios.txt");
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String usuario){
        //Cargar todos los usuarios
        ArrayList<Usuario> usuariosExistentes=leerUsuarios();
        //Buscar cual usuario voy a eliminar
        Usuario usuarioABorrar=new Usuario();
        usuarioABorrar.setUsuario(usuario);
        if(usuariosExistentes.remove(usuarioABorrar)){
            //reescribir el archivo con la lista sin el usuario que borré
            return Utileria.reescribirArchivo(usuariosExistentes, 
            "usuarios.txt");
        }else{
            return false;
        }
        
//        for (int i = 0; i < usuariosExistentes.size(); i++) {
//                if(usuariosExistentes.get(i).getUsuario().equals(usuario)){
//                    usuariosExistentes.remove(i);
//                    //reescribir el archivo con la lista sin el usuario que borré
//                    return Utileria.reescribirArchivo(usuariosExistentes, 
//                    "usuarios.txt");
//                }
//        }
//      return false;
        
    }
}
