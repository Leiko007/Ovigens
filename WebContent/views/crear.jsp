<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Macho</title>
</head>
<body>
	
	<h1>Crear Macho</h1>
	
	<form action="machos" method="post">
	<input type="hidden" name="opcion" value="guardar">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre" size="50"></td>
			</tr>	
			<tr>
				<td>Número:</td>
				<td><input type="text" name="numero" size="50"></td>
			</tr>	
			<tr>	
				<td>Sexo:</td>
				<td><input type="text" name="sexo" size="50"></td>
			</tr>	
			<tr>	
				<td>Edad:</td>
				<td><input type="text" name="edad" size="50"></td>
			</tr>	
			<tr>	
				<td>Fecha Nacimiento:</td>
				<td><input type="text" name="fechanac" size="50"></td>
			</tr>
		</table>
		<input type="submit" value="Guardar">
	</form>
	
</body>
</html>