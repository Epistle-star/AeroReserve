package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class get_002dflights_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>Get Flights</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/get-flights.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"./Assets/fontawesome-free-6.2.0-web/css/all.css\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <a href=\"homePage\" class=\"logo\"\n");
      out.write("        ><i class=\"fa-solid fa-plane\"></i><span>Aero</span>Reserve</a\n");
      out.write("      >\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"booking-class\">\n");
      out.write("      <p class=\"economy\">Economy</p>\n");
      out.write("      <p class=\"business\">Business</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"flight-details\">\n");
      out.write("      <div class=\"departure-details\">\n");
      out.write("        <p class=\"departure-time\">8:35</p>\n");
      out.write("        <p class=\"departure-location\">Port-Harcourt</p>\n");
      out.write("        <p class=\"arrival-date\">04 Dec 2023</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"flight-description\">\n");
      out.write("        <p class=\"duration\">1h 10m</p>\n");
      out.write("        <div class=\"pics\">\n");
      out.write("          <i class=\"fa-regular fa-circle-dot\"></i>\n");
      out.write("          <div class=\"line\"></div>\n");
      out.write("          <i class=\"fa-solid fa-location-dot\"></i>\n");
      out.write("        </div>\n");
      out.write("        <p>NonStop</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"arrival-details\">\n");
      out.write("        <p class=\"arrival-time\">8:35</p>\n");
      out.write("        <p class=\"arrival-location\">Abuja</p>\n");
      out.write("        <p class=\"arrival-date\">04 Dec 2023</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"category-container\">\n");
      out.write("        <p class=\"category-price price1\" onclick=\"toggleDropdown(this)\">\n");
      out.write("          $135.00\n");
      out.write("        </p>\n");
      out.write("        <div class=\"category-details\">\n");
      out.write("          <ul>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>refundable tickets with fees</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("          </ul>\n");
      out.write("          <a href=\"\" class=\"btn\">$135.00</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"category-container\">\n");
      out.write("        <p class=\"category-price\" onclick=\"toggleDropdown(this)\">$150.00</p>\n");
      out.write("        <div class=\"category-details\">\n");
      out.write("          <ul>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>refundable tickets with fees</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("          </ul>\n");
      out.write("          <a href=\"\" class=\"btn\">$150.00</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"flight-details\">\n");
      out.write("      <div class=\"departure-details\">\n");
      out.write("        <p class=\"departure-time\">15:55</p>\n");
      out.write("        <p class=\"departure-location\">Port-Harcourt</p>\n");
      out.write("        <p class=\"arrival-date\">04 Dec 2023</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"flight-description\">\n");
      out.write("        <p class=\"duration\">1h 10m</p>\n");
      out.write("        <div class=\"pics\">\n");
      out.write("          <i class=\"fa-regular fa-circle-dot\"></i>\n");
      out.write("          <div class=\"line\"></div>\n");
      out.write("          <i class=\"fa-solid fa-location-dot\"></i>\n");
      out.write("        </div>\n");
      out.write("        <p>NonStop</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"arrival-details\">\n");
      out.write("        <p class=\"arrival-time\">17:05</p>\n");
      out.write("        <p class=\"arrival-location\">Abuja</p>\n");
      out.write("        <p class=\"arrival-date\">04 Dec 2023</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"category-container\">\n");
      out.write("        <p class=\"category-price price1\" onclick=\"toggleDropdown(this)\">\n");
      out.write("          $135.00\n");
      out.write("        </p>\n");
      out.write("        <div class=\"category-details\">\n");
      out.write("          <ul>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>refundable tickets with fees</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("          </ul>\n");
      out.write("          <a href=\"\" class=\"btn\">$135.00</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"category-container\">\n");
      out.write("        <p class=\"category-price\" onclick=\"toggleDropdown(this)\">$150.00</p>\n");
      out.write("        <div class=\"category-details\">\n");
      out.write("          <ul>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>refundable tickets with fees</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("            <li>Inflight meals</li>\n");
      out.write("          </ul>\n");
      out.write("          <a href=\"\" class=\"btn\">$150.00</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      function toggleDropdown(element) {\n");
      out.write("        var dropdownContent = element.nextElementSibling;\n");
      out.write("\n");
      out.write("        dropdownContent.classList.toggle(\"show\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      window.onclick = function (event) {\n");
      out.write("        if (!event.target.matches(\".category-price\")) {\n");
      out.write("          var dropdowns = document.getElementsByClassName(\"category-details\");\n");
      out.write("          for (var i = 0; i < dropdowns.length; i++) {\n");
      out.write("            var openDropdown = dropdowns[i];\n");
      out.write("            if (openDropdown.classList.contains(\"show\")) {\n");
      out.write("              openDropdown.classList.remove(\"show\");\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      };\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
