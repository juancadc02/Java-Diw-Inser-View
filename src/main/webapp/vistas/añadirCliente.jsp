<style>

body{
background-color: #FFFACD;
}
.tablaRegistro{ 

 background: #DEB887;
 padding: 20px;
 border:solid 4px #000000;
 width: 150%; 
 max-width: 800px; 
 margin: 0 auto; 
 display: flex; 
 flex-direction: column;
 justify-content:center; 
 align-items: center;
     
 }

.tablaTitle{
background: #DEB887;
	padding: 15px;
	border-collapse: separate;
	border-spacing: 5;
	border: 3px solid black;
	border-radius: 30px;
	-moz-border-radius: 40px;
	padding: 1px;
	width: 100%;
	max-width: 400px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Cliente</title>
</head>
<body>
<table class="tablaTitle">
<tr>
<td><h1>Registrar Nuevo Cliente</h1></td>
</tr>

</table>
<br/><br/>
<form action="registrar" method="post">

<table class="tablaRegistro" border="0">


<tr>
<th> <label for="nombre">Nombre:</label></th>
<td><input type="text" name="nombre" id="nombre"></td>
</tr>


<tr>
<th> <label for="apellidos">Apellidos:</label></th>
<td><input type="text" name="apellidos" id="apellidos"></td>
</tr>


<tr>
<th> <label for="dni">Dni:</label></th>
<td><input type="text" name="dni" id="dni"></td>
</tr>


<tr>
<td colspan="3" align="center"><br/><br/><input type="submit" name="button" id="button" value="Añadir Cliente"></td>
<td  colspan="5" align="center"><br/><br/><input type="button" value="Volver a Inicio" onclick="window.location.href='paginaInicio';return false;"/></td>
</tr>

</table>
</form>


</body>
</html>