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
	<form action="adduser" class="container my-5">
		<div class="mb-3">
			<label class="form-label">Enter Your ID</label> <input type="number"
				class="form-control" name="id" autocomplete="off">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter Your Name</label> <input type="text"
				class="form-control" name="name" autocomplete="off">
		</div>

		<div class="mb-3">
			<label class="form-label">Enter Your Email</label> <input
				type="email" class="form-control" name="email">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>

	</form>




</body>
</html>