package repositories;

import java.util.ArrayList;
import java.util.List;
import models.HibernateUtil;
import models.Vistaempleados;
import models.VistaempleadosId;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RepositoryVistaEmpleados {

    Session session;
    Transaction transaction;

    public RepositoryVistaEmpleados() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    private void iniciarTransaccion() {
        if (this.session.isOpen() == false) {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        this.transaction = this.session.beginTransaction();
    }

    public List<VistaempleadosId> getVistaEmpleados() {
        this.iniciarTransaccion();
        //hacemos la consulta sobre el objeto mapeado que es Vistaempleados
        String hql = "from Vistaempleados as vista";
        Query query = this.session.createQuery(hql);
        //recuperamos los datos de la consulta
        List<Vistaempleados> lista = query.list();
        //los datos que necesitamos están en VistaempleadosId
        //por lo que creamos una colección manual
        ArrayList<VistaempleadosId> empleados = new ArrayList<>();
        for (Vistaempleados v : lista) {
            //cogemos cada uno de los datos de empleado que vienen con id
            VistaempleadosId emp = v.getId();
            //añadimos cada empleado a la lista
            empleados.add(emp);
        }
        return empleados;
    }

    public List<VistaempleadosId> getEmpleadosLocalidad(String localidad) {
        this.iniciarTransaccion();
        String hql = "from Vistaempleados as vista where lower(vista.id.localidad)='" + localidad.toLowerCase() + "'";
        Query query = this.session.createQuery(hql);
        List<Vistaempleados> lista = query.list();
        if (lista.isEmpty()) {
            return null;
        } else {
            ArrayList<VistaempleadosId> empleados = new ArrayList<>();
            for (Vistaempleados v : lista) {
                empleados.add(v.getId());
            }
            return empleados;
        }
    }
}
