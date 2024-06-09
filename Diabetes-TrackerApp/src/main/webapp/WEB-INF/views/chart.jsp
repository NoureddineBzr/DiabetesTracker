<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Graphique de Glycémie</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
<h1>Graphique de Glycémie</h1>
<canvas id="bloodSugarChart" width="400" height="200"></canvas>

<!-- Include the chart.js script -->
<script src="/js/chart.js"></script>

<!-- Inject JSON data into the script -->
<script th:inline="javascript">
    /*<![CDATA[*/
    var readings = /*[[${readings}]]*/ '[]';
    document.write('<script id="chartData" type="application/json">' + JSON.stringify(readings) + '</script>');
/*]]>*/
</script>
</body>
</html>
