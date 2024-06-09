<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Diabetes Tracker</title>
</head>
<body>
<h2>Glucose Readings</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Date</th>
        <th>Glucose Level</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="reading" items="${listReadings}">
        <tr>
            <td>${reading.id}</td>
            <td>${reading.timestamp}</td>
            <td>${reading.glucoseLevel}</td>
            <td>
                <a href="deleteReading/${reading.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="showNewReadingForm">Add New Reading</a>
</body>
</html>
