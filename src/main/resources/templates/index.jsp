<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>.
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

    <head><title>Example :: Spring Application</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    </head>
    <body>
        <h1>Example - Spring Application</h1>

        <div class="container mt-4">
            <a href="/nuevo" class="btn btn-succes">Agregar Nuevo</a>
            <table class="table">

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Accion</th>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="persona" items="${personas}">
                        <tr>
                            <td>${persona.id}</td>
                            <td>${persona.first_name}</td>
                            <td>
                                <a href="/editar/${persona.id}" class="btn btn-warning">Editar</a>
                                <a href="/eliminar/${persona.id}" class="btn btn-danger">Eliminar</a>
                            </td>

                        </c:forEach>
                    </tr>

            </table>


        </div>
    </body>
</html> 