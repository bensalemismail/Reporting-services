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
import Dashboard from "views/Dashboard.jsx";
import Dashboard2 from "views/Dashboard2";
import UserProfile from "views/UserProfile.jsx";
import TableList from "views/TableList.jsx";
import Typography from "views/Typography.jsx";
import Icons from "views/Icons.jsx";
import Maps from "views/Maps.jsx";
import Notifications from "views/Notifications.jsx";
import Upgrade from "views/Upgrade.jsx";

const dashboardRoutes = [
  {
    path: "/dashboard",
    //name: "Mamda",
    name: "Dashboard 1",
    icon: "pe-7s-graph",
    //icon:"fab fa-amilia",
    component: Dashboard,
    layout: "/admin"
  },
  {
    path: "/dashboad2",
    //name: "Mcma",
    name: "Dashboard 2",
    icon: "pe-7s-user",
    component: Dashboard2,
    layout: "/admin"
  },
  {
    path: "/user",
    name: "Dashboard 3",
    icon: "pe-7s-user",
    component: UserProfile,
    layout: "/admin"
  },
  {
    path: "/table",
    //name: "Courtage",
    name: "Dashboard 4",
    icon: "pe-7s-note2",
    component: TableList,
    layout: "/admin"
  },
  {
    path: "/typography",
    //name: "Typography",
    name: "Dashboard 5",
    icon: "pe-7s-news-paper",
    component: Typography,
    layout: "/admin"
  },
  {
    path: "/icons",
    //name: "Icons",
    name: "Dashboard 6",
    icon: "pe-7s-science",
    component: Icons,
    layout: "/admin"
  },
  {
    path: "/maps",
    name: "Maps",
    icon: "pe-7s-map-marker",
    component: Maps,
    layout: "/admin"
  },
  {
    path: "/notifications",
    //name: "Notifications",
    name: "Branche",
    icon: "pe-7s-bell",
    component: Notifications,
    layout: "/admin"
  },
  /* {
    upgrade: true,
    path: "/upgrade",
    name: "Upgrade to PRO",
    icon: "pe-7s-rocket",
    component: Upgrade,
    layout: "/admin"
  } */
];

export default dashboardRoutes;
