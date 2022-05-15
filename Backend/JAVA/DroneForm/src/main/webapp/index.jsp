<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registro para Drones</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="centro">
    <h2><%= "Registro de usuarios para drones" %></h2>
    <br/>
    <form method="post" action="HelloServlet" autocomplete="off">
        <div class="campo">
            <input class="elemento" type="text" id="name" name="name">
            <label for="name">Nombre</label>
        </div>
        <div class="campo">
            <input class="elemento" type="text" id="user" name="user">
            <label for="user">UserName</label>
        </div>
        <div class="campo">
            <input class="elemento" type="text" id="email" name="email">
            <label for="user">Email</label><br>
        </div>
        <a href="#">
            <span></span>
            <span></span>
            <span></span>
            <span></span>
            <input class="boton" type="submit" value="Registrate">
        </a>
    </form>
</div>
</body>
</html>