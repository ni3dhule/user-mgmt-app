<!DOCTYPE html><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>All Students</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet"href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>

<body>
    <div class="container my-2">
        <div class="card">
            <div class="card-body">
                <div class="container my-5">
                    <p class="my-5">
                        <a href="/add-user" class="btn btn-primary">
                            <i class="fas fa-user-plus ml-2">Add User </i>
                        </a>
                    </p>
                    <div class="col-md-10">
                        <c:if test="${users.size()==0}">
                            <h2>No record found !!</h2>
                        </c:if>
                        <c:if test="${users.size() gt 0 }">
                            <div>
                                <table class="table table-striped table-responsive-md">
                                    <thead>
                                        <tr>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Gender Name</th>
                                            <th>DOB</th>
                                            <th>Aadhaar No</th>
                                            <th>PAN No</th>
                                            <th>Email</th
                                            <th>Edit</th>
                                            <th>Delete</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="user" items="${users}">
                                            <tr>
                                                <td>${user.firstName}</td>
                                                <td>${user.lastName}</td>
                                                <td>${user.gender}</td>
                                                <td>${user.aadhaarNo}</td>
                                                <td>${user.panNo}</td>
                                                <td>${user.emailId}</td>
                                                <td>
                                                    <a href="/user-update/${user.userId}" class="btn btn-primary">
                                                    <i class="fas fa-user-edit ml-2"></i></a>
                                               </td>
                                             <td>
                                                    <a href="/user-delete/${user.userId}" class="btn btn-primary">
                                                        <i class="fas fa-user-times ml-2"></i>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>