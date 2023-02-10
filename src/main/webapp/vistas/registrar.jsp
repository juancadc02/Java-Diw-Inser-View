<%@ include file="/vistas/cabecera.jsp" %>
<!DOCTYPE html>
<style type="text/css">

body{
background: #FFFACD;
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
<meta charset="UTF-8">
<title>Nuevo Usuario Registrado</title>
</head>
<body>

<h1>Usuario Registrado Correctamente</h1>

<table  width="35%" border="0">

<tr>

<th>Nombre</th>

<th>Apellidos</th>

<th>DNI</th>

</tr>


<c:forEach var="listaClientes" items="${miModelo.cliente}">

	<tr>
	
	<td>${listaClientes.nombre}</td>
	<td>${listaClientes.apellidos}</td>
	<td>${listaClientes.dni}</td>
	</tr>


</c:forEach>

<td colspan="5" align="center"><br/><input type="button" value="Volver a Inicio" onclick="window.location.href='paginaInicio';return false;"/></td>
</table>
</body>
</html>