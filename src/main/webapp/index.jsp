


<!DOCTYPE html>


<!DOCTYPE html>

<html>
  <head>
    <style>
      body {
        color: brown;
        background-color: lightblue;

      }

      h2 {
        color: green;
      }
    </style>
  </head>
<body>
  <h1>CI/CD<h1>
<h2>Hello World!!hh</h2>
    <%
        String test = "<b><u>bold and underlined</u></b>";
        pageContext.setAttribute("test", test);
        boolean doodad = true;
     %>

    <c:set var="test1" value="<u>underlined</u>" />
    <c:set var="test2" value="${test}" />

    <c:out value="${test}" escapeXml="false" />
    <c:out value="${test1}" escapeXml="false" />
    <c:out value="${test2}" escapeXml="false" />
    
    <% if (doodad) {%>
    <div>Doodad!</div>
<% } else { %>
    <p>Hello!</p>
<% } %>
    
<h3> "Continuous integration doesn't get rid of bugs, but it does make them dramatically easier to find and remove."<h3>
</body>
</html>
