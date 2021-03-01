package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web05acciondepartamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      controllers.Controller05AccionDepartamentos controller = null;
      synchronized (request) {
        controller = (controllers.Controller05AccionDepartamentos) _jspx_page_context.getAttribute("controller", PageContext.REQUEST_SCOPE);
        if (controller == null){
          controller = new controllers.Controller05AccionDepartamentos();
          _jspx_page_context.setAttribute("controller", controller, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Hibernate Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String dato = request.getParameter("cajanumero");
        if(dato != null){
            int num = Integer.parseInt(dato);
            String nom = request.getParameter("cajanombre");
            String loc = request.getParameter("cajalocalidad");
            String accion = request.getParameter("accion");
            if(accion.equalsIgnoreCase("insertar")){
                controller.insertarDepartamento(num, nom, loc);
            }else if(accion.equalsIgnoreCase("eliminar")){
                controller.eliminarDepartamento(num);
            }else if(accion.equalsIgnoreCase("modificar")){
                controller.modificarDepartamento(num, nom, loc);
            }           
        }
        
      out.write("\n");
      out.write("        <h1>Consultas acción Hibernate</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <label>Número: </label>\n");
      out.write("            <input type=\"text\" name=\"cajanumero\" placeholder=\"Id departamento\" required/>\n");
      out.write("            <br/>\n");
      out.write("            <label>Nombre </label>\n");
      out.write("            <input type=\"text\" name=\"cajanombre\" placeholder=\"Nombre departamento\"/>\n");
      out.write("            <br/>\n");
      out.write("            <label>Localidad: </label>\n");
      out.write("            <input type=\"text\" name=\"cajalocalidad\" placeholder=\"Localidad\"/>\n");
      out.write("            <br/>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"insertar\">Insertar</button>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"eliminar\">Eliminar</button>\n");
      out.write("            <button type=\"submit\" name=\"accion\" value=\"modificar\">Modificar</button>\n");
      out.write("        </form>\n");
      out.write("        <hr/>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Número</td>\n");
      out.write("                    <td>Nombre</td>\n");
      out.write("                    <td>Localidad</td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
      out.print(controller.getTablaDepartamentos());
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
