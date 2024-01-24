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
<%@ page import="java.util.List, com.aeroreserve.trip.TripType"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aeroreserve</title>
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
      
      <div class="suggestion">
        <p>
          Continue as Guest or
          <a href="Registration" class="btn">Sign-in</a>
        </p>
      </div>
    </header>
        
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

            %>
            <form action="book-flights" method="post">
            <c:forEach var="flight" items="${flightsList}">
                <h3> Departure Flights</h3>
                <div class="flight-details">
                    <div class="departure-details">
                      <p class="departure-time">${flight.flightTime}</p>
                      <p class="departure-location">${flight.origin.name}</p>
                      <input type="hidden" name="flightid" value="${flight.id}">
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
                        <div class="booking-class"><p class="economy">Economy</p></div>
                        <input type="radio" name="categoryType" id="economy" value="ECONOMY" hidden>
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
                                <label for="economy" class="btn">${economyPrice}</label>
                          
                        </div>
                      </div>
                        <div class="category-container">
                          <div class="booking-class">
                            <p class="business">Business</p>
                          </div>
                          <input type="radio" name="categoryType" id="business" value="BUSINESS" hidden>
                        <p class="category-price" onclick="toggleDropdown(this)">${businessPrice}</p>
                        
                        <div class="category-details">
                          <ul>
                            <li>Inflight meals</li>
                            <li>refundable tickets with fees</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                          </ul>
                          <label for="business" class="btn">${businessPrice}</label>
                        </div>
                      </div>
                    </div>
            </c:forEach>
                          
                
                <c:if test="${trip.tripType eq TripType.Round}">
            <c:forEach var="flight" items="${returnFlightList}">
                              <h3>Return Flights</h3>
                          
                          <div class="flight-details">
                            <input type="hidden" name="returnflightid" value="${flight.id}">
                    <div class="departure-details">
                      <p class="departure-time">${flight.flightTime}</p>
                      <p class="departure-location">${flight.origin.name}</p>
                      <p class="arrival-date">${returndate}</p>
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
                            <p class="arrival-date">${returndate}</p>
                      </div>
                      <div class="category-container">
                        <input type="radio" name="returnEconomy" id="returnEconomy" value="ECONOMY" hidden>
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
                          <label for="returnEconomy" class="btn">${economyPrice}</label>
                        </div>
                      </div>
                        <div class="category-container">
                          <input type="radio" name="returnEconomy" id="returBusiness" value="BUSINESS" hidden>
                        <p class="category-price" onclick="toggleDropdown(this)">${businessPrice}</p>
                        
                        <div class="category-details">
                          <ul>
                            <li>Inflight meals</li>
                            <li>refundable tickets with fees</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                            <li>Inflight meals</li>
                          </ul>
                          <label for="returnEconomy" class="btn">${businessPrice}</label>
                        </div>
                      </div>
                    </div>
            </c:forEach>
           </c:if>
            <button class="btn">Submit</button>
            </form>
        
            
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
