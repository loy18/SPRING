/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.83
 * Generated at: 2022-11-21 07:20:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1666247059863L));
    _jspx_dependants.put("jar:file:/C:/eGovFrameDev-3.10.0-64bit/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/egovProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/resources/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<!-- 구글 차트 호출을 위한 js 파일 라이브러리 임포트 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https:/www.google.com/jsapi\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\r\n");
      out.write("	//구글 차트 라이브러리 로딩(메모리에 오림)\r\n");
      out.write("	google.load(\"visualization\",\"1\",{\"packages\":[\"corechart\"]\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	//로딩이 완료되면 drawChart 함수를 호출해보자\r\n");
      out.write("	google.setOnLoadCallback(drawChart);\r\n");
      out.write("	//responseText : json 데이터를 텍스트로 읽어들임. console.log로 볼 수 있음\r\n");
      out.write("	function drawChart(){\r\n");
      out.write("		let jsonData = $.ajax({\r\n");
      out.write("			url:\"/resources/json/sampleData2.json\",\r\n");
      out.write("			dataType:\"json\",\r\n");
      out.write("			async:false\r\n");
      out.write("		}).responseText;\r\n");
      out.write("		\r\n");
      out.write("		console.log(\"jsonData : \" + jsonData);\r\n");
      out.write("		\r\n");
      out.write("		//데이터 테이블 생성\r\n");
      out.write("		let data = new google.visualization.DataTable(jsonData);\r\n");
      out.write("		//차트를 출력할 div 선택(PieChart, LineChart, ColumnChart)\r\n");
      out.write("		let chart = new google.visualization.PieChart(document.getElementById(\"chart_div\"));\r\n");
      out.write("		//차트객체(chart).draw(데이터테이블(data), 옵션)\r\n");
      out.write("		chart.draw(data,{\r\n");
      out.write("			title:\"개똥이 제목\",\r\n");
      out.write("			curveType:\"function\",\r\n");
      out.write("			width:600,\r\n");
      out.write("			height:450\r\n");
      out.write("		});\r\n");
      out.write("	}\r\n");
      out.write("});\n");
      out.write("</script>\r\n");
      out.write("<div id=\"chart_div\"></div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
