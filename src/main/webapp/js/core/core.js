$(document).ready(function () {
    console.log("ready!");

    $("p").on("click", function () {
        helloWorld();
    });
    $("#buildChart").on("click", function () {
        buildChart();
    });
});

function helloWorld() {
    alert("hello world!");
}

function buildChart() {
    console.log("building a chart");   
    var data = [4, 8, 15, 16, 23, 42];
    var x = d3.scale.linear()
            .domain([0, d3.max(data)])
            .range([0, 420]);
    d3.select(".chart")
            .selectAll("div")
            .data(data)
            .enter().append("div")
            .style("width", function (d) {
                return x(d) + "px";
            })
            .text(function (d) {
                return d;
            });
}
