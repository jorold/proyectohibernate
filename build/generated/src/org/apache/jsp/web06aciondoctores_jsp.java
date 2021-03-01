package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web06aciondoctores_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      controllers.Controller06AccionDoctores controller = null;
      synchronized (request) {
        controller = (controllers.Controller06AccionDoctores) _jspx_page_context.getAttribute("controller", PageContext.REQUEST_SCOPE);
        if (controller == null){
          controller = new controllers.Controller06AccionDoctores();
          _jspx_page_context.setAttribute("controller", controller, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String dato = request.getParameter("cajaiddoctor");
        if (dato != null){
            int iddoctor = Integer.parseInt(dato);
            String accion = request.getParameter("accion");
            if (accion.equalsIgnoreCase("eliminar")){
                controller.eliminarDoctor(iddoctor);
            }else{
                String apellido = request.getParameter("cajaapellido");
                String espe = request.getParameter("cajaespecialidad");
                String datohosp = request.getParameter("cajahospital");
                String datosal = request.getParameter("cajasalario");
                int hospitalcod = Integer.parseInt(datohosp);
                int salario = Integer.parseInt(datosal);
                if (accion.equalsIgnoreCase("insertar")){
                    controller.insertarDoctor(iddoctor, apellido, espe, hospitalcod, salario);
                }else if (accion.equalsIgnoreCase("modificar")){
                    controller.modificarDoctor(iddoctor, apellido, espe, hospitalcod, salario);
                }
            }
        }
        
      out.write("\n");
      out.write("        <h1>Accion Doctores Hibernate</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <label>Id doctor</label>\n");
      out.write("            <input type=\"text\" name=\"cajaiddoctor\" required/><br/>\n");
      out.write("            <label>Apellido</label>\n");
      out.write("            <input type=\"text\" name=\"cajaapellido\"/><br/>\n");
      out.write("            <label>Especialidad</label>\n");
      out.write("            <input type=\"text\" name=\"cajaespecialidad\"/><br/>\n");
      out.write("            <label>Hospital: </label>\n");
      out.write("            <input type=\"text\" name=\"cajahospital\"/><br/>\n");
      out.write("            <label>Salario </label>\n");
      out.write("            <input type=\"text\" name=\"cajasalario\"/><br/>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"insertar\">Insertar</button>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"modificar\">Modificar</button>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"eliminar\">Eliminar</button>\n");
      out.write("        </form>\n");
      out.write("        <hr/>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>Apellido</th>\n");
      out.write("                    <th>Especialidad</th>\n");
      out.write("                    <th>Hospital</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
      out.print(controller.getTablaDoctores());
      out.write("\n");
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
