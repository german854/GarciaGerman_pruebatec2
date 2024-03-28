<%@page import="java.util.ArrayList"%>
<%@page import="german.test2.gestionturnos.logica.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gestión de turnos</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
    <div class="container mt-5">
        <h1 class="mb-4">Turnero - Gestión de Turnos</h1>

        <div class="row">
            <div class="col-md-6">
                <h2>Agregar Nuevo Turno</h2>
                <form action="CiudadanosSV" method="post">
                    <!--<div class="form-group">
                        <label for="numero">Número de turno:</label>
                        <input type="text" class="form-control" id="numero" name="numero" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="fecha">Fecha (dd/mm/aaaa):</label>
                        <input type="text" class="form-control" id="fecha" name="fecha" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="descripcion">Descripción del trámite:</label>
                        <input type="text" class="form-control" id="descripcion" name="descripcion" required>
                    </div>-->
                    
                    <div class="form-group">
                        <label for="nombre">Nombre del ciudadano:</label>
                        <input type="text" class="form-control" id="nombre" name="nombre" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="apellido">Apellido del ciudadano:</label>
                        <input type="text" class="form-control" id="apellido" name="apellido" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="dni">DNI del ciudadano:</label>
                        <input type="text" class="form-control" id="dni" name="dni" required>
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Agregar Turno</button>
                </form>
            </div>
            
            <div class="col-md-6">
                <h2>Listar Turnos</h2>
                <form action="CiudadanosSV" method="get">
                    <div class="form-group">
                        <label for="consultaDni">Dni:</label>
                        <input type="int" class="form-control" id="consultaDni" name="dni" required>
                    </div>
                    <!--
                    <div class="form-check">
                        <input type="radio" class="form-check-input" id="consultaDni" name="estado" value="enEspera" checked>
                        <label class="form-check-label" for="enEspera">En Espera</label>
                    </div>
                    
                    <div class="form-check">
                        <input type="radio" class="form-check-input" id="consultaDni" name="estado" value="yaAtendido">
                        <label class="form-check-label" for="yaAtendido">Ya Atendido</label>
                    </div>-->
                    
                    <button type="submit" class="btn btn-primary">Listar Turnos</button>
                </form>
            </div>
        </div>
    </div>
        
        <div class="results-table">
        <% if (request.getAttribute("resultados") != null) { %>
            <h3>Resultados:</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Ciudadano ciudadano : (ArrayList<Ciudadano>) request.getAttribute("resultados")) { %>
                        <tr>
                            <td><%= ciudadano.getNombre() %></td>
                            <td><%= ciudadano.getApellidos() %></td>
                            <td><%= ciudadano.getDni() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } %>
    </div>

    <!-- Agregar los scripts de Bootstrap -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
    </body>
</html>
