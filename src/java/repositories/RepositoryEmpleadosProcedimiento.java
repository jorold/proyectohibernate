/*
create or replace procedure updateempleadossalario
(p_iddepartamento emp.dept_no%type, p_salario int)
as

begin
  update emp set salario = salario+p_salario
  where dept_no=p_iddepartamento;
  commit;
end;
 */
package repositories;

import java.util.List;
import models.Emp;
import models.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RepositoryEmpleadosProcedimiento {

    Session session;
    Transaction transaction;

    public RepositoryEmpleadosProcedimiento() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    private void iniciarTransaccion() {
        if (this.session.isOpen() == false) {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        this.transaction = this.session.beginTransaction();
    }

    public List<Emp> getEmpleados() {
        this.iniciarTransaccion();
        String hql = "from Emp as emp";
        Query query = this.session.createQuery(hql);
        //List<Emp> empleados = query.list();
        //una vez que hemos leido los datos o hemos realizado la accion
        //de recuperar un list, cerramos session
        //this.session.close();
        return query.list();
    }

    public void modificarSalarioEmpleado(int iddepartamento, int salario) {
        this.iniciarTransaccion();
        String sql = "call updateempleadossalario(?,?)";
        Query query = this.session.createSQLQuery(sql);
        query.setParameter(0, iddepartamento);
        query.setParameter(1, salario);
        query.executeUpdate();
        this.transaction.commit();
    }
}
