  <html>
  <head>
    <title>Sample Application JSP Page</title>
  </head>

  <body bgcolor=white>

  <table border="0" cellpadding="10">
    <tr>
      <td align=center>
        <img src="images/Pivotal_Logo.png">
      </td>
      <td>
         <h1>Sample Application JSP Page</h1>
      </td>
    </tr>
  </table>

  <br />
  <p>This is the output of a JSP page that is part of the HelloWorld application.</p>

  <%= request.getParameter("a") + request.getParameter("b") %>

  </body>
</html>
