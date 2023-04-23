<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Gestor de polizas</title>
    </head>
    <body>
        <center>
            <div class="container mt-5">
                <form method="post" action="/index/RegisterController">
              <div class="card" style="width: 30rem;">
              <div class="card-body">
                  <h2>Login</h2>
                   <input type="text" name="user" class="form-control mt-2" placeholder="Ingrese Usuario">
                  <input type="password" name="password" class="form-control mt-2" placeholder="Ingrese Contraseña">
                 
                  
                   <input type="submit" name="btn-login" value="Ingresar" class="btn btn-primary btn-block mt-2">
                   <text>No tiene cuenta?</text>
                   <a href="register.jsp">register</a>
               </div>
            </div>
                </form>
            </div>
        </center>
    </body>
</html>