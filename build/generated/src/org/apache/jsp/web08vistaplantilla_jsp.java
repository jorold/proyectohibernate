package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class web08vistaplantilla_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--create or replace view vistaplantilla\n");
      out.write("as\n");
      out.write("select plantilla.apellido, plantilla.funcion, plantilla.salario\n");
      out.write(", hospital.nombre, hospital.telefono\n");
      out.write("from plantilla\n");
      out.write("inner join hospital\n");
      out.write("on plantilla.hospital_cod = hospital.hospital_cod;-->\n");
      out.write("\n");
      controllers.Controller08VistaPlantilla controller = null;
      synchronized (request) {
        controller = (controllers.Controller08VistaPlantilla) _jspx_page_context.getAttribute("controller", PageContext.REQUEST_SCOPE);
        if (controller == null){
          controller = new controllers.Controller08VistaPlantilla();
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
      out.write("        <h1>Vista plantilla</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <label>Introduzca hospital: </label>\n");
      out.write("            <input type=\"text\" name=\"hospital\" required/>\n");
      out.write("            <button class=\"btn btn-outline-info\" type=\"submit\">Buscar plantilla</button>\n");
      out.write("        </form>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Apellido</th>\n");
      out.write("                    <th>Oficio</th>\n");
      out.write("                    <th>Hospital</th>\n");
      out.write("                    <th>Salario</th>\n");
      out.write("                    <th>Teléfono</th>                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                String nombre = request.getParameter("hospital");
                if(nombre == null){
                    
      out.write("\n");
      out.write("                    ");
      out.print(controller.getTablaVistaPlantilla());
      out.write("\n");
      out.write("                    ");

                }else{
                    
      out.write("\n");
      out.write("                    ");
      out.print(controller.getTablaPlantillaHospital(nombre));
      out.write("\n");
      out.write("                    ");

                }
                
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
