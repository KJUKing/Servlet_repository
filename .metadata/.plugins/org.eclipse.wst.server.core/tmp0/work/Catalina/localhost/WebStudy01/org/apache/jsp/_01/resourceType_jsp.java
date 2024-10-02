/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2024-10-02 05:47:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resourceType_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h4> 자원의 분류</h4>\r\n");
      out.write("<pre>\r\n");
      out.write("    1. 자원의 생성 시점과 서비스 대상에 따른 분류\r\n");
      out.write("        1) 정적 자원 : 서버가 구동되기 전에 이미 생성되어 있는 파일, 파일 자체가\r\n");
      out.write("                        서비스 대상이 되는 컨텐츠\r\n");
      out.write("            ex) *.html, *.js, *.css, *.pdf\r\n");
      out.write("        2) 동적 자원 : 클라이언트의 요청에 의해 특정 어플리케이션이 실행되는 시점에\r\n");
      out.write("                        실행의 결과를 서비스의 대상으로.\r\n");
      out.write("            MIME 텍스트 : 실행결과로 동적 생성되는 컨텐츠의 종류를 표현할 수 있는 문자열\r\n");
      out.write("                            maintype/subtype;charset=UTF-8\r\n");
      out.write("            ex) /now1.do 요청에 의해 ServletTimeServlet이 실행되고\r\n");
      out.write("                그결과로 컨텐츠가 생성됨(text/html)\r\n");
      out.write("                /now2.do 요청에 의해 ServerTimeForJsonServlet이 실행되고\r\n");
      out.write("                그 결과로 컨텐츠가 생성됨(application/json)\r\n");
      out.write("    2. 자원의 위치와 접근 방법에 따른 분류\r\n");
      out.write("\t\t1) File System resource : 파일 시스템에 의하여\r\n");
      out.write("\t\t\tex) D:\\00.medias\\movies\\file_example_MP4_1280-10MG.mp4\r\n");
      out.write("\t\t2) Classpath resource : classpath이후의 전체경로를 의미하는 qeulified name(논리 경로) 의 형태로 자원을 식별\r\n");
      out.write("\t\t\tex) /WebStudy01/src/main/resources/kr/or/ddit/images/cute1.PNG\r\n");
      out.write("\t\t\t\t/kr/or/ddit/image.cute1\r\n");
      out.write("                kr.or.ddit.servlet01.HelloServlet\r\n");
      out.write("\t\t3) Web resource :네트워크상에서 url(논리경로)을 통해 식별할 수 있는 자원\r\n");
      out.write("            ex) http://localhost/Webstudy01/resources/images/cat1.jpg\r\n");
      out.write("\t\t\\\\\r\n");
      out.write("</pre>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
