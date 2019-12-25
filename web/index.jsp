<%@ page import="ir.mctab.java32.hibernate.projects.webandhibernate.domain.Laptop" %>
<%@ page import="java.util.List" %>
<%@ page import="ir.mctab.java32.hibernate.projects.webandhibernate.repositories.LaptopRepository" %><%--
  Created by IntelliJ IDEA.
  User: Bahram
  Date: 12/25/2019
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<Laptop> laptopList = LaptopRepository.getInstance().findAll();
%>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/web_and_hibernate/resources/css/bootstrap-4.4.1-dist/css/bootstrap.min.css"
          crossorigin="anonymous">

    <title>Welcome to Laptop ...</title>
</head>
<body>
<div class="container">
    <table class="table table-striped table-hover ">
        <thead>
        <th>#</th>
        <th>Title</th>
        <th>PartNumber</th>
        <th>Action</th>
        </thead>
        <tbody>
        <% for (Laptop laptop : laptopList) { %>
        <tr>
            <td><%= laptop.getId()%>
            </td>
            <td>
                <%= laptop.getTitle() %>
            </td>
            <td>
                <%= laptop.getPartNumber() %>
            </td>
            <td>
                <button type="button" class="btn btn-warning btn-sm">Edit</button>
                <button type="button" class="btn btn-danger btn-sm">Remove</button>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="/web_and_hibernate/resources/js/jquery-3.2.1.slim.min.js"
        crossorigin="anonymous"></script>
<script src="/web_and_hibernate/resources/js/popper-1.12.9.min.js"
        crossorigin="anonymous"></script>
<script src="/web_and_hibernate/resources/css/bootstrap-4.4.1-dist/js/bootstrap.min.js"
        crossorigin="anonymous"></script>
</body>
</html>
