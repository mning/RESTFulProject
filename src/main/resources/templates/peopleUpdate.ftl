<html>
<head>
	<title>People Creation</title>
</head>
<body>
<h2>People</h2>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("form").submit(function(){
        var data = {};
        var Form = this;
        data["firstName"] = $("input[name=firstName]").val();
        data["lastName"] = $("input[name=lastName]").val();
        data["familyName"] = $('select[name=families]').val();
        console.log(data);
        $.ajax({
                    url: 'http://localhost:8080/people/'+$("input[name=id]").val(),
                                      type:"PUT",
                                      data:JSON.stringify(data),
                                      contentType:"application/json; charset=utf-8",
                                      dataType:"json",
                                    fail: function(data,textStatus,jqXHR) {
                                        if (jqXHR.status == "200") {
                                        location.replace("http://localhost:8080");
                                            }
                                    }
            }) ;
    });
});
</script>
<form action="">
<table border="1" cellpadding="1" cellspacing="1" style="width: 500px;">
<input type="hidden" name="id" value = "${people.id}">
	<tbody>
		<tr>
			<td>First Name</td>
			<td><input name="firstName" type="text" value = "${people.firstName}"/></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input name="lastName" type="text" value = "${people.lastName}"/></td>
		</tr>
		<tr>
			<td>Family</td>
			<td><select name="families">
			 <option value="n/a">N/A</option>
			 <#list families as family>
			 <option value="${family.familyName}"
			 <#if family.familyName == people.familyName>
               selected
             </#if>
			 >${family.familyName}</option>
			 </#list>
			</select></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</tbody>
</table>
<p><a href="http://localhost:8080" id="Create" name="Create" target="_self">View All People</a></p>
</form>

</body>
</html>