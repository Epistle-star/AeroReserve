package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import com.aeroreserve.flights.Flight;
import java.util.List;
import com.aeroreserve.trip.TripType;

public final class get_002dflightss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Aeroreserve</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/get-flights.css\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"./Assets/fontawesome-free-6.2.0-web/css/all.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <a href=\"homePage\" class=\"logo\"\n");
      out.write("        ><i class=\"fa-solid fa-plane\"></i><span>Aero</span>Reserve</a\n");
      out.write("      >\n");
      out.write("      \n");
      out.write("      <div class=\"suggestion\">\n");
      out.write("        <p>\n");
      out.write("          Continue as Guest or\n");
      out.write("          <a href=\"Registration\" class=\"btn\">Sign-in</a>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("        \n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

//              String departureTimeStr = (String) pageContext.getAttribute("flightTime");
//              String arrivalTimeStr = (String) pageContext.getAttribute("arrivalTime");
//              System.out.println("Departure Time String: " + departureTimeStr);
//              LocalTime arrivalTime = LocalTime.parse(arrivalTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
//              LocalTime departureTime = LocalTime.parse(departureTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
//
//               
//                long hoursDiff = departureTime.until(arrivalTime, java.time.temporal.ChronoUnit.HOURS);
//                long minutesDiff = departureTime.until(arrivalTime, java.time.temporal.ChronoUnit.MINUTES) % 60;
//
//                request.setAttribute("hoursDiff", hoursDiff);
//                request.setAttribute("minutesDiff", minutesDiff);
//            

            
      out.write("\n");
      out.write("            <form action=\"book-flights\" method=\"post\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                          \n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <button class=\"btn\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("              <script>\n");
      out.write("        function toggleDropdown(element) {\n");
      out.write("          var dropdownContent = element.nextElementSibling;\n");
      out.write("\n");
      out.write("          dropdownContent.classList.toggle(\"show\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        window.onclick = function (event) {\n");
      out.write("          if (!event.target.matches(\".category-price\")) {\n");
      out.write("            var dropdowns = document.getElementsByClassName(\"category-details\");\n");
      out.write("            for (var i = 0; i < dropdowns.length; i++) {\n");
      out.write("              var openDropdown = dropdowns[i];\n");
      out.write("              if (openDropdown.classList.contains(\"show\")) {\n");
      out.write("                openDropdown.classList.remove(\"show\");\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        };\n");
      out.write("      </script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("flightTime");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flightTime}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("arrivalTime");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrivalTime}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("flight");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flightsList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <h3> Departure Flights</h3>\n");
          out.write("                <div class=\"flight-details\">\n");
          out.write("                    <div class=\"departure-details\">\n");
          out.write("                      <p class=\"departure-time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.flightTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      <p class=\"departure-location\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.origin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      <input type=\"hidden\" name=\"flightid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                      <p class=\"arrival-date\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departureDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                    </div>\n");
          out.write("                     <div class=\"flight-description\">\n");
          out.write("                        <p class=\"duration\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hoursDiff}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('h');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${minutesDiff}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("m</p>\n");
          out.write("                        <div class=\"pics\">\n");
          out.write("                          <i class=\"fa-regular fa-circle-dot\"></i>\n");
          out.write("                          <div class=\"line\"></div>\n");
          out.write("                          <i class=\"fa-solid fa-location-dot\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <p>NonStop</p>\n");
          out.write("                      </div>\n");
          out.write("                      <div class=\"arrival-details\">\n");
          out.write("                            <p class=\"arrival-time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.arrivaldate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <p class=\"arrival-location\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.destination.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <p class=\"arrival-date\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departureDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      </div>\n");
          out.write("                      <div class=\"category-container\">\n");
          out.write("                        <div class=\"booking-class\"><p class=\"economy\">Economy</p></div>\n");
          out.write("                        <input type=\"radio\" name=\"categoryType\" id=\"economy\" value=\"ECONOMY\" hidden>\n");
          out.write("                        <p class=\"category-price price1\" onclick=\"toggleDropdown(this)\">\n");
          out.write("                          ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${economyPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </p>\n");
          out.write("                        <div class=\"category-details\">\n");
          out.write("                          <ul>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>refundable tickets with fees</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                          </ul>\n");
          out.write("                                <label for=\"economy\" class=\"btn\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${economyPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                          \n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                        <div class=\"category-container\">\n");
          out.write("                          <div class=\"booking-class\">\n");
          out.write("                            <p class=\"business\">Business</p>\n");
          out.write("                          </div>\n");
          out.write("                          <input type=\"radio\" name=\"categoryType\" id=\"business\" value=\"BUSINESS\" hidden>\n");
          out.write("                        <p class=\"category-price\" onclick=\"toggleDropdown(this)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${businessPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        \n");
          out.write("                        <div class=\"category-details\">\n");
          out.write("                          <ul>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>refundable tickets with fees</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                          </ul>\n");
          out.write("                          <label for=\"business\" class=\"btn\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${businessPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                    </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trip.tripType eq TripType.Round}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setVar("flight");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${returnFlightList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                              <h3>Return Flights</h3>\n");
          out.write("                          \n");
          out.write("                          <div class=\"flight-details\">\n");
          out.write("                            <input type=\"hidden\" name=\"returnflightid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                    <div class=\"departure-details\">\n");
          out.write("                      <p class=\"departure-time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.flightTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      <p class=\"departure-location\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.origin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      <p class=\"arrival-date\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${returndate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                    </div>\n");
          out.write("\n");
          out.write("                     <div class=\"flight-description\">\n");
          out.write("                        <p class=\"duration\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hoursDiff}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('h');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${minutesDiff}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("m</p>\n");
          out.write("                        <div class=\"pics\">\n");
          out.write("                          <i class=\"fa-regular fa-circle-dot\"></i>\n");
          out.write("                          <div class=\"line\"></div>\n");
          out.write("                          <i class=\"fa-solid fa-location-dot\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <p>NonStop</p>\n");
          out.write("                      </div>\n");
          out.write("                      <div class=\"arrival-details\">\n");
          out.write("                            <p class=\"arrival-time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.arrivaldate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <p class=\"arrival-location\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flight.destination.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <p class=\"arrival-date\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${returndate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                      </div>\n");
          out.write("                      <div class=\"category-container\">\n");
          out.write("                        <input type=\"radio\" name=\"returnEconomy\" id=\"returnEconomy\" value=\"ECONOMY\" hidden>\n");
          out.write("                        <p class=\"category-price price1\" onclick=\"toggleDropdown(this)\">\n");
          out.write("                          ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${economyPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                        </p>\n");
          out.write("                        <div class=\"category-details\">\n");
          out.write("                          <ul>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>refundable tickets with fees</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                          </ul>\n");
          out.write("                          <label for=\"returnEconomy\" class=\"btn\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${economyPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                        <div class=\"category-container\">\n");
          out.write("                          <input type=\"radio\" name=\"returnEconomy\" id=\"returBusiness\" value=\"BUSINESS\" hidden>\n");
          out.write("                        <p class=\"category-price\" onclick=\"toggleDropdown(this)\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${businessPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        \n");
          out.write("                        <div class=\"category-details\">\n");
          out.write("                          <ul>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>refundable tickets with fees</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                            <li>Inflight meals</li>\n");
          out.write("                          </ul>\n");
          out.write("                          <label for=\"returnEconomy\" class=\"btn\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${businessPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                        </div>\n");
          out.write("                      </div>\n");
          out.write("                    </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
