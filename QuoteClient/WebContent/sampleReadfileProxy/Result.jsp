<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleReadfileProxyid" scope="session" class="edu.ap.quotes.ReadfileProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleReadfileProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        String word_0id=  request.getParameter("word5");
            java.lang.String word_0idTemp = null;
        if(!word_0id.equals("")){
         word_0idTemp  = word_0id;
        }
        java.lang.String[] getQuotes2mtemp = sampleReadfileProxyid.getQuotes(word_0idTemp);
if(getQuotes2mtemp == null){
%>
<%=getQuotes2mtemp %>
<%
}else{
        String tempreturnp3 = null;
        if(getQuotes2mtemp != null){
        java.util.List listreturnp3= java.util.Arrays.asList(getQuotes2mtemp);
        tempreturnp3 = listreturnp3.toString();
        }
        %>
        <%=tempreturnp3%>
        <%
}
break;
case 7:
        gotMethod = true;
        java.lang.String[] getAllQuotes7mtemp = sampleReadfileProxyid.getAllQuotes();
if(getAllQuotes7mtemp == null){
%>
<%=getAllQuotes7mtemp %>
<%
}else{
        String tempreturnp8 = null;
        if(getAllQuotes7mtemp != null){
        java.util.List listreturnp8= java.util.Arrays.asList(getAllQuotes7mtemp);
        tempreturnp8 = listreturnp8.toString();
        }
        %>
        <%=tempreturnp8%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>