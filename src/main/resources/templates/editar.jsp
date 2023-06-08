<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>

  <head><title>Example :: Spring Application</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  
  </head>
  <body>
      <div class="container mt-4">
          <form action="/actualizar" method="POST" class="col-sm-5">
              <div class="card">
                  <div class="card-header">
                      <h4>Actualizar Persona</h4>  
                  </div>
                  <div class="card-body">
                      <div class="form-group">
                          <label>ID</label>
                          <input type="text" name="id" class="form-control" value="${persona.id}" readonly="readonly">
                      </div>
                       <div class="form-group">
                          <label>Nombre</label>
                          <input type="text" name="name" value="${persona.first_name}"class="form-control">
                      </div>
                  </div>
                   <div class="card-footer">
                       <input type="submit"  value="Actualizar" class="btn btn-info"/>
                       <a href="/listar">Regresar</a>
                  </div>
              </div>
              
          </form>
      </div>
          
  </body>