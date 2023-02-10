<html>
<head>
<style>
body{
background-color: #FFFACD;
}
.tablaButton {
	background: #DEB887;
	padding: 15px;
	border: solid 2px #000000;
	width: 100%;
	max-width: 600px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.tablaTitle {
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

h1 {
	text-align: center;
}
</style>

<title>Pagina de inicio</title>
</head>
<body>





<table class="tablaTitle">

<tr>

<td><h1>Esta es la pagina de inicio</h1></td>

</tr>

</table>

<br/>
<table class="tablaButton">
<tr>
<td><input type="button" value="Ver Listado De Clientes" onclick="window.location.href='listadoDeClientes';return false;"/></td>
<td><input type="button" value="Registrar Cliente" onclick="window.location.href='registroDeCliente';return false;"/></td>
</tr>
</table>

</body>
</html>