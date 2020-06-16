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
import { Grid, Row, Col } from "react-bootstrap";
import { StatsCard } from "components/StatsCard/StatsCard.jsx";
import {Bar,Pie,Line} from "react-chartjs-2";
import { Card } from "components/Card/Card.jsx";
import {
  legendPie,
  
} from "variables/Variables.jsx";
var buTable = [];
var numberTable = [];
var mutuelleName = [];
var tableNombreClientActiveParMutuelle = [];
var idProduitTable = [];
var nombrePoliceBUProduit = [];






class Dashboard extends Component {
  
  createLegend(tab) {
    var legend = [];
    for (var i = 0; i < tab["names"].length; i++) {
     // console.log(tab["name"]);
      var type = "fa fa-circle text-" + tab["types"][i];
      legend.push(<i className={type} key={i} />);
      legend.push(" ");
      legend.push(tab["names"][i]);
    }
    return legend;
  }
  componentDidMount(){
    fetch('http://localhost:8080/home/pie')
    .then(results => results.json())
    .then(results =>
      {
        if(buTable.length === 0 && numberTable.length === 0){
          for(var item in results){
            buTable.push(results[item].bu);
            numberTable.push(results[item].nombrePolice);
            
          }
           this.setState({
            dataNombreClientActiveParBU:{
              labels:buTable,
              datasets:[
                {
                  data:numberTable,
                  backgroundColor:['#009858','#F66416','#8F166C','#0094DA']
                }
              ]
            }
          }
           
          ); 
        }
        
        console.log(buTable,numberTable);
       
      }
      );

      fetch('http://localhost:8080/home/pie2')
      .then(results => results.json())
      .then(results =>
        {
          if(mutuelleName.length === 0 && tableNombreClientActiveParMutuelle.length === 0){
            for(var item in results){
              mutuelleName.push(results[item].bu);
              tableNombreClientActiveParMutuelle.push(results[item].nombrePolice);
              
            }
             this.setState({
              dataNombreClientActiveParBU:{
                labels:buTable,
                datasets:[
                  {
                    data:numberTable,
                    backgroundColor:['#009858','#F66416','#8F166C','#0094DA']
                  }
                ]
              }
            }
             
            ); 
          }
          
          console.log(mutuelleName,tableNombreClientActiveParMutuelle);
         
        }
        );

    fetch('http://localhost:8080/home/twolines')
    .then(results => results.json())
    .then(results =>
      {
        if(idProduitTable.length === 0 && nombrePoliceBUProduit.length === 0){
          for(var item in results){
            idProduitTable.push(results[item].idproduit);
            nombrePoliceBUProduit.push(results[item].nombrePolice);
            
          }
          console.log(idProduitTable,nombrePoliceBUProduit);
           this.setState({
            chartwithtwodata:  {
              labels: buTable,
              datasets: [{
                label: 'Police Active Par BU',
                yAxesID: 'A',
                borderColor:'rgba(54, 162, 235, 1)',
                backgroundColor:'rgba(54, 162, 235, 0.2)',
                data: nombrePoliceBUProduit
              }, {
                label: 'BU Par Produit',
                yAxesID: 'B',
                borderColor:'rgba(75, 192, 192, 1)',
                backgroundColor:'rgba(75, 192, 192, 0.2)',
                data: idProduitTable
              }]
            },
            options: {
              scales: {
                yAxes: [{
                  id: 'A',
                  type: 'linear',
                  position: 'left',
                }, {
                  id: 'B',
                  type: 'linear',
                  position: 'right',
                  ticks: {
                    max: 2,
                    min: 1,
                    stepSize:1
                  }
                }]
              }
            }
          }
           
          ); 
        }
        
        console.log(buTable,numberTable);
       
      }
      ); 

}



constructor(props){
  super(props);
  this.state = {
    
    dataNombreClientActiveParBU:{
      labels:buTable,
      datasets:[
        {
          data:numberTable,
          backgroundColor:['#009858','#F66416','#8F166C','#0094DA']
        }
      ]
    },
    dataNombreClientActiveParMutuelle:{
      labels:mutuelleName,
      datasets:[
        {
          data:tableNombreClientActiveParMutuelle,
          backgroundColor:['#009858','#8F166C']
        }
      ]
    },
    chartwithtwodata:  {
      labels: buTable,
      datasets: [{
        label: 'Police Active Par BU',
        yAxesID: 'A',
        borderColor:'rgba(54, 162, 235, 1)',
        backgroundColor:'rgba(54, 162, 235, 0.2)',
        data: nombrePoliceBUProduit
      }, {
        label: 'BU Par Produit',
        yAxesID: 'B',
        borderColor:'rgba(75, 192, 192, 1)',
        backgroundColor:'rgba(75, 192, 192, 0.2)',
        data: idProduitTable
      }]
    },
    options: {
      scales: {
        yAxes: [{
          id: 'A',
          type: 'linear',
          position: 'left',
        }, {
          id: 'B',
          type: 'linear',
          position: 'right',
          ticks: {
            max: 2,
            min: 1,
            stepSize:1
          }
        }]
      }
    }
  }
}
  render() {
    
    return (
      
      <div className="content">
        <Grid fluid>
        <Row>
            <Col lg={3} sm={6}>
              <StatsCard
                bigIcon={<i className="pe-7s-server text-warning" />}
                statsText={buTable[0]}
                statsValue={nombrePoliceBUProduit[0]}
                statsIcon={<i className="fa fa-refresh" />}
                statsIconText="Updated now"
              />
            </Col>
            <Col lg={3} sm={6}>
              <StatsCard
                bigIcon={<i className="pe-7s-wallet text-success" />}
                statsText={buTable[1]}
                statsValue={nombrePoliceBUProduit[1]}
                statsIcon={<i className="fa fa-calendar-o" />}
                statsIconText="Last day"
              />
            </Col>
            <Col lg={3} sm={6}>
              <StatsCard
                bigIcon={<i className="pe-7s-graph1 text-danger" />}
                statsText={buTable[2]}
                statsValue={nombrePoliceBUProduit[2]}
                statsIcon={<i className="fa fa-clock-o" />}
                statsIconText="In the last hour"
              />
            </Col>
            <Col lg={3} sm={6}>
               <StatsCard
                bigIcon={<i className="fa fa-twitter text-info" />}
                statsText={buTable[3]}
                statsValue={nombrePoliceBUProduit[3]}
                statsIcon={<i className="fa fa-refresh" />}
                statsIconText="Updated now"
              /> 
            </Col>
          </Row>
         
          <Row>
            <Col md={6}>
              <Card
                id="bar1"
                title="Nombre de client active par BU"
                content={
                  
                     <div className="chart">
                    <Bar
                      data={this.state.dataNombreClientActiveParBU}
                     
                    />
                  </div>
                  
                }
                
              />
            </Col>
            
            <Col md={6}>
              <Card
                id="pie1"
                title="Nombre de client active par Mutuelle"
                content={
                  <div className="chart">
                   <Pie
                      data={this.state.dataNombreClientActiveParMutuelle}
                     
                    />
                  </div>
                }
                
              />
            </Col>
          </Row>

          <Row>
            <Col md={12}>
              <Card
                id="chartActivity"
                title="CPolice actives par BU et Produit"
                
                statsIcon="fa fa-check"
                content={
                  <div className="chart">
                      <Line
                      data={this.state.chartwithtwodata}
                      height={80}
                    /> 
                    
                  </div>
                }
                
              />
            </Col>

            {/* <Col md={4}>
              <Card
                statsIcon="fa fa-clock-o"
                title="Nombre polices en cours par BU"
                //category="Last Campaign Performance"
                stats="Campaign sent 2 days ago"
                content={
                  <div
                    id="chartPreferences"
                    className="chart"
                  >
                    
                  </div>
                }
                legend={
                  //<div className="legend">{this.createLegend(legend)}</div>
                  <div className="legend">{this.createLegend(legendPie)}</div>

                }
              />
            </Col> */}
          </Row>
        </Grid>
      </div>
    );
  }
}

export default Dashboard;
