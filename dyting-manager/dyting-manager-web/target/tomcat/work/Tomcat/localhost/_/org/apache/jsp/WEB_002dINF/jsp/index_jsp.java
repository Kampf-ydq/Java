/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-29 01:21:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("<title>谛听 ditecting</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/nav.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<style>\r\n");
      out.write("@media screen and (max-width: 750px) {\r\n");
      out.write("\t#main {\r\n");
      out.write("\t\tmargin-top: -80px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#big {\r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t.slogan {\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (min-width: 751px) {\r\n");
      out.write("\t#small {\r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\" aria-expanded=\"false\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(basePath);
      out.write("index\" class=\"navbar-brand\" style=\"font-family:Vladimir Script;font-size:26px\">Ditecting</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li id=\"summary\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("sumary\" title=\"统计总览\">统计总览</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"earth\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("visualMap\" title=\"统计总览\">全球态势</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!--<li id=\"earth\"><a href=\"http://219.216.64.70:8080/Integration/Situation.html\" title=\"统计总览\"  target=\"_blank\">全球态势</a></li>-->\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<a id=\"report\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" title=\"工控报告\">\r\n");
      out.write("\t\t\t\t\t\t工控报告\r\n");
      out.write("\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" style=\"font-family: verdana;\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("world\">ICS全球分布报表</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("china\">ICS中国各省分布报表</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("normal\">ICS常规服务开放报表</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"handbook\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(basePath);
      out.write("handBook\" title=\"用户手册\">用户手册</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-success navbar-btn pull-right\" title=\"联系我们\" data-container=\"body\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"ditecting@gmail.com或关注微信号：ditecting\">\r\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"> 联系我们</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<span class=\"btn  navbar-btn pull-right\" title=\"选择语言\">\r\n");
      out.write("\t\t\t\t<a href=\"?l=zh-cn\">\r\n");
      out.write("\t\t\t\t\t<font color=\"white\">简体中文</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<font color=\"white\">|</font>\r\n");
      out.write("\t\t\t\t<a href=\"?l=en-us\">\r\n");
      out.write("\t\t\t\t\t<font color=\"white\">English</font>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- 以上是导航条 -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div id=\"blank_top\"></div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<img id=\"big\" width=150 height=150 src=\"img/diting2.png\" class=\"img-responsive\" alt=\"logo\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <div align=\"center\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"slogan\">辨工控网间之万物 探恶意漏洞以补天</h1>\r\n");
      out.write("\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 input-group has-success\" style=\"margin:20px\">\r\n");
      out.write("\t\t\t\t\t<input id=\"search_value\" type=\"text\" class=\"form-control\" placeholder=\"service:Modbus\" style=\"font-family:consolas;\">\r\n");
      out.write("\t\t\t\t\t<!-- <span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\" onclick=\"alert('点了地图Map')\" style=\"background-color: #a9a9a9; color: white\">地图视角</button>\r\n");
      out.write("\t\t\t\t\t</span> -->\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"dyting_search\" class=\"btn btn-success\" type=\"button\">谛听一下</button>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- <div>\r\n");
      out.write("\t\t\t\t\t<em>\r\n");
      out.write("\t\t\t\t\t\t为了得到更精确的查询结果，请按\r\n");
      out.write("\t\t\t\t\t\t<strong>用户手册</strong>\r\n");
      out.write("\t\t\t\t\t\t规则搜索或从\r\n");
      out.write("\t\t\t\t\t\t<strong>统计总览</strong>\r\n");
      out.write("\t\t\t\t\t\t找到你想了解的内容\r\n");
      out.write("\t\t\t\t\t</em>\r\n");
      out.write("\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\" style=\"background:#EEEEEE;height:auto;border-top: 1px solid #e4e4e4;border-bottom: 1px solid #e4e4e4;margin-top:150px;\">\r\n");
      out.write("\t\t\t\t<h3>谛听能为你做些什么……</h3>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/earth1.jpg\" width=60 height=60 class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<h4>搜索工控设备</h4>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size:15px;\">搜索联网工控设备，定位工控系统位置</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/shield2.jpg\" width=60 height=60 class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<h4>发现安全威胁</h4>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size:15px;\">发现安全问题，评估安全问题</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4 col-md-4\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lingdang.png\" width=60 height=60 class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t<h4>可视化分析</h4>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size:15px;\">可视化感知工控安全态势，关注你身边的工控系统安全</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\" style=\"margin:10px\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("\t\t\t\tCopyright &copy; 2016 <strong><a href=\"#\">谛听</a></strong> 网络空间工控设备搜索引擎  权利全部保留\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->\r\n");
      out.write("<script src=\"js/jquery-2.1.1.js\"></script>\r\n");
      out.write("<!-- 包括所有已编译的插件 -->\r\n");
      out.write("<script src=\"bootstrap-3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$('#dyting_search').click(function(){\r\n");
      out.write("\t\tvar text = $('#search_value').val();\r\n");
      out.write("\t\tif(text == '' || text == undefined || text == null){\r\n");
      out.write("\t\t\t//搜索内容为空，返回首页\r\n");
      out.write("\t\t\twindow.location.href=\"");
      out.print(basePath);
      out.write("index\";\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\t//console.log(text);\r\n");
      out.write("\t\t//分离关键字和值并判断，若存在多组搜索式，则只取第一组。如port:502;service:tcp...则只取port:502\r\n");
      out.write("\t\tvar map = text.split(\":\",2);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/**************************\\\r\n");
      out.write("\t\t*      搜索式合法性验证                        *\r\n");
      out.write("\t\t\\**************************/\r\n");
      out.write("\t\t//判断value是否有特殊字符或是否为空\r\n");
      out.write("        var flag = new RegExp(\"[`~!@#$^&*()=|{}':;',\\\\[\\\\].<>《》?~！@#￥……&*（）|{}【】‘；：”“'。，、？]\");\r\n");
      out.write("\t\tif((map[1] == '' || map[1] == undefined || map[1] == null) || flag.test(map[1])){\r\n");
      out.write("\t\t\talert(\"搜索式不合法！\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//alert(map[0]+\"--\"+map[1]);\r\n");
      out.write("\t\t//return;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar p = /^[0-9]+.?[0-9]*$/; //当关键字key为port时判断value部分是否为数字\r\n");
      out.write("\t\tif ((map[0] == 'port' && p.test(map[1])) || map[0] == 'service' || map[0] == 'ip' || map[0] == 'time' ||\r\n");
      out.write("\t\t\t\tmap[0] == 'country' || map[0] == 'city') {\r\n");
      out.write("\t\t\twindow.location.href=\"");
      out.print(basePath);
      out.write("search?key=\"+map[0]+\"&val=\"+map[1]+\"&pageNo=\"+1;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(\"语法错误！\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}