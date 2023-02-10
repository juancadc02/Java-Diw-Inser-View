<%@ include file="/vistas/cabecera.jsp" %>
<style type="text/css">

body{
background-color: #FFFACD;
}



table{ 

 background: #DEB887;
 padding: 15px;
 border:solid 2px #000000;
 width: 100%; 
 max-width: 600px; 
 margin: 0 auto; 
 display: flex; 
 flex-direction: column;
 justify-content:center; 
 align-items: center;
     
 }
 h1{

text-align:center;
 }

.inicio{
display: block; 
margin:0 auto; 
}

</style>

<html>
  <head>
  <title>Listado de clientes</title>
  </head>
  <body>
    <h1>Listado de clientes</h1>
    
    

<table  width="35%" border="0">

<tr>

<th>Id</th>

<th>Nombre</th>

<th>Apellidos</th>

<th>Telefono</th>

<th>DNI</th>


</tr>




<c:forEach var="listaClientes" items="${miModelo.listadoCliente}">

	<tr>
	<td>${listaClientes.id}</td>
	<td>${listaClientes.nombre}</td>
	<td>${listaClientes.apellidos}</td>
	<td>${listaClientes.tlf}</td>
	<td>${listaClientes.dni}</td>
	</tr>


</c:forEach>

<tr>
<td colspan="5" align="center"><br/><input type="button" value="Volver a Inicio" onclick="window.location.href='paginaInicio';return false;"/></td>
</tr>
</table>




      
</body>
</html>
