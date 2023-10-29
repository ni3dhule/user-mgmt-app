<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Add User</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-5">
        <h3>Add User</h3>
        <div class="card">
            <div class="card-body">
                <div class="col-md-10">
                    <form:form action="/save-user" method="post" modelAttribute="command">
                        <form:hidden path="userId" />
                        <div class="row">
                            <div class="form-group col-md-8">
                                <label for="fistName" class="col-form-label">First Name</label>
                                <form:input type="text" class="form-control" id="firstName" path="firstName" placeholder="Enter First Name" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="lastName" class="col-form-label">Last Name</label>
                                <form:input type="text" class="form-control" id="lastName" path="lastName" placeholder="Enter Last Name" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="gender" class="col-form-label">Gender</label>
                                <form:radiobutton class="form-control" id="gender" path="gender" value="Male" label="Male" onclick="enable()" />
                                <form:radiobutton class="form-control" id="gender" path="gender" value="Female" label="Female" onclick="disable()" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="lastName" class="col-form-label">User DOB </label>
                                <div class="col-sm-5">
                                 <div class='input-group date' id='datetimepicker5'>
                                     <input type='text' class="col-sm-3 form-control" data-date-format="YYYY/MM/DD"/>
                                        <span class="input-group-addon">
                                            <span class="glyphicon glyphicon-calendar"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group col-md-8">
                                <label for="aadhaarNo" class="col-form-label">Aadhaar Card No</label>
                                <form:input type="text" class="form-control" id="aadhaarNo" path="aadhaarNo" placeholder="Enter Aadhaar Card No" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="panNo" class="col-form-label">PAN No</label>
                                <form:input type="text" class="form-control" id="panNo" path="panNo" placeholder="Enter PAN Card No" />
                            </div>
                            <div class="form-group col-md-8">
                                <label for="emailId" class="col-form-label">Email Id</label>
                                <form:input type="text" class="form-control" id="emailId" path="emailId" placeholder="Enter Email Id" />
                            </div>

                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary" value=" Submit ">
                            </div>

                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>