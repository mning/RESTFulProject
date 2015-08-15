<html>
<head>
	<title>index</title>
	</head>
<body>
<h2>People</h2>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
	<tbody>
		<tr>
			<td>FirstName</td>
			<td>LastName</td>
			<td>FamilyName</td>
			<td>Action</td>
		</tr>
<#list peopleList as people>
			<tr>
				<td>${people.firstName}</td>
				<td>${people.lastName}</td>
				<td>${people.familyName}</td>
				<td>
				<a href='#' onclick="deleteOne('${people.id}')">Delete</a>
				<a href="http://localhost:8080/update?id=${people.id}">Update</a></td>
			</tr>
</#list>
	</tbody>
</table>

<p><a href="http://localhost:8080/create" id="Create" name="Create" target="_self">Create</a></p>

<script>
function deleteOne(id) {
		$.ajax({    url: 'http://localhost:8080/people/'+id,
                    type: 'DELETE',
                    success: function(result) {
                        location.reload();
                    }
                });

    }
</script>
</body>
</html>

