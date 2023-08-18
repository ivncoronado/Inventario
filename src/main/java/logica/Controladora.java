
package logica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import static logica.Equipo_.modeloEquipo;
import static logica.Equipo_.serieEquipo;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(String nombre, String apellido, String nombreUsuario, String contrasenia){
        
        Usuario usu = new Usuario();
        
        usu.setNombreUsu(nombre);
        usu.setApellidoUsu(apellido);
        usu.setNombreUsuario(nombreUsuario);
        usu.setContraseñaUsu(contrasenia);     
       
        controlPersis.crearUsuario(usu);
    }
       public void crearPersonal(String nombrePersonal, String apellidoPersonal, String departamentoPersonal, String correoPersonal) {
        
        Personal per = new Personal();
        
        per.setNombrePers(nombrePersonal);
        per.setApellidoPers(apellidoPersonal);
        per.setDepartamentoPers(departamentoPersonal);
        per.setCorreoPers(correoPersonal);
        
        controlPersis.crearPersonal(per);
       }

        public void altaCosumible(String cantidadConsumible, String marcaConsumible, String tipoConsumible){
        
        Consumible consu = new Consumible();  
        
        consu.setCantidadConsumible(0);
        consu.setMarcaConsumible(marcaConsumible);
        consu.setTipoConsumible(tipoConsumible);
        
       controlPersis.altaCosumible(consu);
        
        }
        public void altaEquipo(String tipoEquipo, String marcaEquipo, String modeloEquipo, String serieEquipo){
            
            Equipo equip = new Equipo();
            
            equip.setTipoEquipo(tipoEquipo);
            equip.setMarcaEquipo(marcaEquipo);
            equip.setModeloEquipo(modeloEquipo);
            equip.setSerieEquipo(serieEquipo);
            
            controlPersis.altaEquipo(equip);
            
            
        }

    public List<Usuario> getUsuarios() {
    return controlPersis.getUsuario();   
    }

    public List<Personal> getPersonal() {
    return controlPersis.getPersonal();   
    }

    public List<Equipo> getEquipos() {
    return controlPersis.getEquipos();   
    }

    public List<Consumible> getConsumibles() {
    return controlPersis.getConsumibles();   
    }
    
            }
