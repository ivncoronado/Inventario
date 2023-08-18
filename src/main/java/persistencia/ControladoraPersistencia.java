package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Consumible;
import logica.Equipo;
import logica.Personal;
import logica.Usuario;

public class ControladoraPersistencia {

    UsuarioJpaController usuJPA = new UsuarioJpaController();
    PersonalJpaController perJPA = new PersonalJpaController();
    EquipoJpaController equiJPA = new EquipoJpaController();
    DepartamentoJpaController depaJPA = new DepartamentoJpaController();
    ConsumibleJpaController consuJPA = new ConsumibleJpaController();
    entradasSalidasJpaController ensaJPA = new entradasSalidasJpaController();

    public ControladoraPersistencia() {
    }
    
    

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public void crearPersonal(Personal per) {
        perJPA.create(per);
    }

    public void altaCosumible(Consumible consu) {
        consuJPA.create(consu);
    }

    public void altaEquipo(Equipo equip) {
        equiJPA.create(equip);
    }

    
    public List<Usuario> getUsuario() {
        return usuJPA.findUsuarioEntities();
    }

    public List<Personal> getPersonal() {
        return perJPA.findPersonalEntities();
    }

    public List<Equipo> getEquipos() {
        return equiJPA.findEquipoEntities();
    }

    public List<Consumible> getConsumibles() {
        return consuJPA.findConsumibleEntities();
    }

}
