<%-- 
    Document   : get-flightss
    Created on : Dec 4, 2023, 1:32:36 PM
    Author     : Epistle
--%>

<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalTime"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.aeroreserve.flights.Flight"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/get-flights.css" />
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"/>
    </head>
    <body>
    <header class="header">
      <a href="homePage" class="logo"
        ><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a
      >
    </header>

    <div class="booking-class">
      <p class="economy">Economy</p>
      <p class="business">Business</p>
    </div>
        
    <c:set var="flightTime" value="${flightTime}" />
    <c:set var="arrivalTime" value="${arrivalTime}"/>
        
        
        <%
//              String departureTimeStr = (String) pageContext.getAttribute("flightTime");
//              String arrivalTimeStr = (String) pageContext.getAttribute("arrivalTime");
//              System.out.println("Departure Time String: " + departureTimeStr);
//              LocalTime arrivalTime = LocalTime.parse(arrivalTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
//              LocalTime departureTime = LocalTime.parse(departureTimeStr, DateTimeFormatter.ofPattern("HH:mm"));
//
//               
//                long hoursDiff = departureTime.until(arrivalTime, java.time.temporal.ChronoUnit.HOURS);
//                long minutesDiff = departureTime.until(arrivalTime, java.time.temporal.ChronoUnit.MINUTES) % 60;
//
//                request.setAttribute("hoursDiff", hoursDiff);
//                request.setAttribute("minutesDiff", minutesDiff);
//            
            List<Flight> flightsList = (List<Flight>) request.getAttribute("flightsList");

            %>
            <c:forEach var="flight" items="${flightsList}">
                <h3> Departure Flights</h3>
                <div class="flight-details">
                    <div class="departure-details">
                      <p class="departure-time">${flight.flightTime}</p>
                      <p class="departure-location">${flight.origin.name}</p>
                      <p class="arrival-date">${departureDate}</p>
                    </div>
                     <div class="flight-description">
                        <p class="duration">${hoursDiff}h ${minutesDiff}m</p>
                        <div class="pics">
                          <i class="fa-regular fa-circle-dot"></i>
                          <div class="line"></div>
                          <i class="fa-solid fa-location-dot"></i>
                        </div>
                        <p>NonStop</p>
                      </div>
                      <div class="arrival-details">
                            <p class="arrival-time">${flight.arrivaldate}</p>
                            <p class="arrival-location">${flight.destination.name}</p>
                            <p class="arrival-date">${departureDate}</p>
                      </div>
                      <div class="category-container">
                        <p class="category-price price1" onclick="toggleDropdown(this)">
                          ${economyPrice}
                        </p>
                        <div class="category-details">
                          <ul>
                            <li>Inflight meals</li>
                            <li>refundable tickets with fees</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                          </ul>
                          <form action="book-oneway-flights" method="post">
                            <input type="hidden" name="flightId" value="${flight.id}">
                            <input type="hidden" name="categoryType" value="ECONOMY">
                            <button class="btn">${economyPrice}</button>
                          </form>
                          
                        </div>
                      </div>
                        <div class="category-container">
                        <p class="category-price" onclick="toggleDropdown(this)">${businessPrice}</p>
                        <div class="category-details">
                          <ul>
                            <li>Inflight meals</li>
                            <li>refundable tickets with fees</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                          </ul>
                            <form action="book-oneway-flights" method="post">
                              <input type="hidden" name="flightId" value="${flight.id}">
                              <input type="hidden" name="categoryType" value="BUSINESS">
                              <button class="btn">${businessPrice}</button>
                            </form>
                        </div>
                      </div>
                    </div>
            </c:forEach>
        
            
            <script>
      function toggleDropdown(element) {
        var dropdownContent = element.nextElementSibling;

        dropdownContent.classList.toggle("show");
      }

      window.onclick = function (event) {
        if (!event.target.matches(".category-price")) {
          var dropdowns = document.getElementsByClassName("category-details");
          for (var i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains("show")) {
              openDropdown.classList.remove("show");
            }
          }
        }
      };
    </script>
    </body>
</html>
