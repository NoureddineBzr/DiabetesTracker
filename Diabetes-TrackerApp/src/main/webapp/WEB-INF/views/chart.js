document.addEventListener("DOMContentLoaded", function() {
    var ctx = document.getElementById('bloodSugarChart').getContext('2d');
    var readings = JSON.parse(document.getElementById('chartData').textContent);

    var labels = readings.map(function(reading) {
        return reading.dateTime;
    });

    var data = readings.map(function(reading) {
        return reading.level;
    });

    var chart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: labels,
            datasets: [{
                label: 'Glycémie',
                data: data,
                borderColor: 'rgba(75, 192, 192, 1)',
                borderWidth: 1,
                fill: false
            }]
        },
        options: {
            scales: {
                xAxes: [{
                    type: 'time',
                    time: {
                        unit: 'day',
                        tooltipFormat: 'll'
                    },
                    scaleLabel: {
                        display: true,
                        labelString: 'Date'
                    }
                }],
                yAxes: [{
                    scaleLabel: {
                        display: true,
                        labelString: 'Glycémie'
                    }
                }]
            }
        }
    });
});
