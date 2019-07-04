<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    form{
        margin: 20px 0;
    }
    form input, button{
        padding: 5px;
    }
    table{
        width: 100%;
        margin-bottom: 20px;
		border-collapse: collapse;
    }
    table, th, td{
        border: 1px solid #cdcdcd;
    }
    table th, table td{
        padding: 10px;
        text-align: left;
    }
</style>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $(".add-row").click(function(){
            var bNum = $("#bNum").val();
            var bDate = $("#bDate").val();
            var bAmt = $("#bAmt").val();
            var file = $("#file").val();
            var markup = "<tr><td><input type='checkbox' name='record'></td><td>" + bNum + "</td><td>" + bDate + "</td></tr>"+ bAmt + "</td><td>"+ file + "</td><td>";
            $("table tbody").append(markup);
        });
        
        // Find and remove selected table rows
        $(".delete-row").click(function(){
            $("table tbody").find('input[name="record"]').each(function(){
            	if($(this).is(":checked")){
                    $(this).parents("tr").remove();
                }
            });
        });
    });    
</script>
</head>
</head>
<body>
	<h3>WELCOME TO Project Entry</h3>
	<form:form action="save" method="POST" modelAttribute="projectDetails">
		<pre><b>
			 Project Number  : <form:input path="projNumber" />
			 Project Name  : <form:input path="projName" />
			 Project Status: <form:select path="status">
				 <c:forEach items="${status}" var="obj">
					<form:option value="${obj.status}">${obj.status}</form:option>
				 </c:forEach>
			</form:select> 
			Project Location: <form:select path="loc">
			 	<c:forEach items="${loc}" var="obj">
					<form:option value="${obj.cityName}">${obj.cityName}</form:option>
				</c:forEach>
			 </form:select> 
			Cloud Account Number  : <form:input path="cloudAccNumber" />
			Select Financial Year: <form:select path="year">
			 	<c:forEach items="${finYear}" var="obj">
					<form:option value="${obj.finYear}">${obj.finYear}</form:option>
				</c:forEach>
			 </form:select> 
			 PI Number  : <form:input  path="pi" />
			 PI Date  : <form:input type="date" path="pi"  />
			 PI Amount  : <form:input path="pi" />
			 Upload PI : <form:input type="file" path="pi" />
			 Bill Number  : <form:input path="bill" id="bNum" />
			 Bill Date  : <form:input type="date" path="bill" id="bDate" />
			 Bill Amount  : <form:input path="bill" id="bAmt" />
			 Upload Bill : <form:input type="file" path="bill" id="file" />
			 
    	<input type="button" class="add-row" value="Add More">
    	<table>
        
        <tbody>
            <tr>
                
            </tr>
        </tbody>
    </table>
    <button type="button" class="delete-row">Delete Row</button>
			 Amount Receive From User  : <form:input path="amtRecvFrmUser" />
			 TDS Amount  : <form:input  path="TdsAmount" />
			 Remarks  : <form:input path="remarks" />
			 
			   <input type="submit" value="Submit" /> 	
			   </b>	
		</pre>
	</form:form>
	${message}
</body>
</html>