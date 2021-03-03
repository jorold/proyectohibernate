package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web07vistaempelados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--create or replace view vistaempleados\n");
      out.write("as\n");
      out.write("select emp.apellido, emp.salario, emp.salario * 12 as anual\n");
      out.write(", emp.oficio, to_char(fecha_alt, 'dd \" de \" month \" de \" yyyy') as fechaalta\n");
      out.write(", dept.dnombre as departamento, dept.loc as localidad\n");
      out.write("from emp\n");
      out.write("inner join dept\n");
      out.write("on emp.dept_no = dept.dept_no;-->\n");
      out.write("\n");
      controllers.Controller07VistaEmpleados controller = null;
      synchronized (request) {
        controller = (controllers.Controller07VistaEmpleados) _jspx_page_context.getAttribute("controller", PageContext.REQUEST_SCOPE);
        if (controller == null){
          controller = new controllers.Controller07VistaEmpleados();
          _jspx_page_context.setAttribute("controller", controller, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Vista empleados</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <label>Introduzca localidad: </label>\n");
      out.write("            <input type=\"text\" name=\"localidad\" required/>\n");
      out.write("            <button type=\"submit\">Buscar empleados</button>\n");
      out.write("        </form>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Apellido</th>\n");
      out.write("                    <th>Oficio</th>\n");
      out.write("                    <th>Departamento</th>\n");
      out.write("                    <th>Fecha alta</th>\n");
      out.write("                    <th>Localidad</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                    <th>Salario anual</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                String localidad = request.getParameter("localidad");
                if(localidad == null){
                //dibujamos todos los datos
                
      out.write("\n");
      out.write("                ");
      out.print(controller.getTablaVistaEmpleados());
      out.write("\n");
      out.write("                ");

                }else{
                //dibujamos los datos de la búsqueda
                
      out.write("\n");
      out.write("                ");
      out.print(controller.getTablaEmpleadosLocalidad(localidad));
      out.write("\n");
      out.write("                ");

                }
                
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
