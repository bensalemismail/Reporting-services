/*!

=========================================================
* Light Bootstrap Dashboard React - v1.3.0
=========================================================

* Product Page: https://www.creative-tim.com/product/light-bootstrap-dashboard-react
* Copyright 2019 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://github.com/creativetimofficial/light-bootstrap-dashboard-react/blob/master/LICENSE.md)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

*/
import React, { Component } from "react";
import ChartistGraph from "react-chartist";
import { Grid, Row, Col } from "react-bootstrap";
import {Bar,Pie,Line} from "react-chartjs-2";
import { Card } from "components/Card/Card.jsx";
import { StatsCard } from "components/StatsCard/StatsCard.jsx";
import { Tasks } from "components/Tasks/Tasks.jsx";
import {
  dataPie,
  legendPie,
  dataSales,
  optionsSales,
  responsiveSales,
  legendSales,
  dataBar,
  optionsBar,
  responsiveBar,
  legendBar
} from "variables/Variables.jsx";

let mutuelle = [];
let nbrClient = [];
var data;
var legend;
class Dashboard extends Component {
  
  createLegend(tab) {
    var legend = [];
    for (var i = 0; i < tab["names"].length; i++) {
      //console.log(tab["name"]);
      var type = "fa fa-circle text-" + tab["types"][i];
      legend.push(<i className={type} key={i} />);
      legend.push(" ");
      legend.push(tab["names"][i]);
    }
    return legend;
  }
  componentDidMount(){
      
    fetch('http://localhost:8080/home/data')
    .then(results => results.json())
    .then(results =>
      {
        for(var item in results){
          mutuelle.push(results[item].bu);
          nbrClient.push(results[item].nombre);
          
           
        }
        //console.log(mutuelle);
         // console.log(nbrClient);
        //console.log(data);
        //console.log(legend);
      }
      );
      

      data = {
        labels: mutuelle,
        series: nbrClient
      };
        legend = {
        names: mutuelle,
        types: ["info", "danger", "warning","primary"]
      };
      
  
}
constructor(props){
  super(props);
  this.state = {
    data:{
      labels:['Lundi','Mardi','Mercredi'],
      datasets:[
        {
          label:"Test",
          data:[12,43,7]
        }
      ]
    }
  }
}
  render() {
    
    return (
      
      <div className="content">
        <Grid fluid>
          <Row>
            <Col lg={3} sm={6}>
             {/*  <StatsCard
                bigIcon={<i className="pe-7s-server text-warning" />}
                statsText={mutuelle[0]}
                statsValue={nbrClient[0]}
                statsIcon={<i className="fa fa-refresh" />}
                statsIconText="Updated now"
              /> */}
            </Col>
            <Col lg={3} sm={6}>
              <StatsCard
                bigIcon={<i className="pe-7s-wallet text-success" />}
                statsText={mutuelle[1]}
                statsValue={nbrClient[1]}
                statsIcon={<i className="fa fa-calendar-o" />}
                statsIconText="Last day"
              />
            </Col>
            <Col lg={3} sm={6}>
              <StatsCard
                bigIcon={<i className="pe-7s-graph1 text-danger" />}
                statsText={mutuelle[2]}
                statsValue={nbrClient[2]}
                statsIcon={<i className="fa fa-clock-o" />}
                statsIconText="In the last hour"
              />
            </Col>
            <Col lg={3} sm={6}>
              {/* <StatsCard
                bigIcon={<i className="fa fa-twitter text-info" />}
                statsText={mutuelle[3]}
                statsValue={nbrClient[3]}
                statsIcon={<i className="fa fa-refresh" />}
                statsIconText="Updated now"
              /> */}
            </Col>
          </Row>
          <Row>
            <Col md={8}>
              <Card
                statsIcon="fa fa-history"
                id="chartHours"
                title="Users Behavior"
                category="24 Hours performance"
                stats="Updated 3 minutes ago"
                content={
                  <div className="chart">
                    <Bar
                      data={this.state.data}
                      
                    />
                  </div>
                }
                legend={
                  <div className="legend">{this.createLegend(legendSales)}</div>
                }
              />
            </Col>
            
            <Col md={4}>
              <Card
                statsIcon="fa fa-clock-o"
                title="Nombre Client active par BU"
                //category="Last Campaign Performance"
                stats="Campaign sent 2 days ago"
                content={
                  <div
                    id="chartPreferences"
                    className="ct-chart ct-perfect-fourth"
                  >
                    <ChartistGraph data={data} type="Pie" />
                  </div>
                }
                legend={
                  //<div className="legend">{this.createLegend(legend)}</div>
                  <div className="legend">{this.createLegend(legendPie)}</div>

                }
              />
            </Col>
          </Row>

          <Row>
            <Col md={6}>
              <Card
                id="chartActivity"
                title="2014 Sales"
                category="All products including Taxes"
                stats="Data information certified"
                statsIcon="fa fa-check"
                content={
                  <div className="ct-chart">
                    <ChartistGraph
                      data={dataBar}
                      type="Bar"
                      options={optionsBar}
                      responsiveOptions={responsiveBar}
                    />
                  </div>
                }
                legend={
                  <div className="legend">{this.createLegend(legendBar)}</div>
                }
              />
            </Col>

            <Col md={6}>
              <Card
                title="Tasks"
                category="Backend development"
                stats="Updated 3 minutes ago"
                statsIcon="fa fa-history"
                content={
                  <div className="table-full-width">
                    <table className="table">
                      <Tasks />
                    </table>
                  </div>
                }
              />
            </Col>
          </Row>
        </Grid>
      </div>
    );
  }
}

export default Dashboard;
