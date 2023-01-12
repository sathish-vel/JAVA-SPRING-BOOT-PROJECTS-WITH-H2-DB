<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<title>satz website</title>
</head>
<body>
	<h2>Display User Details</h2>
	${userdetails}
	<table class="table table-dark table-striped container">
		<tr>
			<th scope="col">id</th>
			<th scope="col">Name</th>
			<th scope="col">Email</th>
		</tr>
		<tbody>
			<tr>
				<th scope="row">${userdetails.id}</th>
				<th scope="row">${userdetails.name}</th>
				<th scope="row">${userdetails.email}</th>
			</tr>
		</tbody>
	</table>




</body>
</html>