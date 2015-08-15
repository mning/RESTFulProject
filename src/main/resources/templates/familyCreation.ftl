<html>
<head>
	<title>Family Creation</title>
</head>
<body>
<h2>Family</h2>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("form").submit(function(){
        var data = {};
        var Form = this;
        data["familyName"] = $("input[name=familyName]").val();
        $.ajax({    cache: false,
                    url: 'http://localhost:8080/family',
                                    type:"POST",
                                      data:JSON.stringify(data),
                                      contentType:"application/json; charset=utf-8",
                                      dataType:"json",
                                    success: function(result) {
                                        location.replace("http://localhost:8080");
                                    }
            });
    });
});
</script>
<form action="">
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
	<tbody>
		<tr>
			<td>Family Name</td>
			<td><input name="familyName" type="text" /></td>
		</tr>
		<tr>
        			<td></td>
        			<td><input type="submit" value="Submit"></td>
        		</tr>

	</tbody>
</table>
</form>
<p><a href="http://localhost:8080" id="Create" name="Create" target="_self">View All People</a></p>
</body>
</html>
