<%-- 
    Document   : login
    Created on : 19 abr. 2023, 12:09:31
    Author     : leosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <div class="container">
                <form>
              <div class="card" style="width: 30rem;">
              <div class="card-body">
                   <input type="text" name="user" class="form-control pt-2" placeholder="Ingrese Usuario">
                  <input type="password" name="password" class="form-control pt-2" placeholder="Ingrese Contraseña">
                   <input type="submit" class="btn btn-primary btn-block pt-2">
               </div>
            </div>
                </form>
            </div>
        </center>
    </body>
</html>
