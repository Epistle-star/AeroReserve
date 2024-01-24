<%-- Document : review-bookings Created on : Dec 26, 2023, 2:58:20 AM Author :
Epistle --%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@ page
import="com.aeroreserve.trip.TripType"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aeroreserve</title>

    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />

    <link rel="stylesheet" href="./css/review-bookings.css" />
  </head>
  <body>
    <header class="header">
      <a href="homePage" class="logo"
        ><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a
      >
    </header>

    <c:set var="trip" value="${trip}" />
    <c:set var="numPassengers" value="${numPassengers}" />
    <c:set
      var="departurePrice"
      value="${trip.departureBooking.category.categoryPrice + 43800}"
    />
    <c:set
      var="returnPrice"
      value="${trip.returnBooking.category.categoryPrice + 43800}"
    />
    <c:set
      var="totaldeparturePrice"
      value="${departurePrice * numPassengers}"
    />
    <c:set var="totalReturnPrice" value="${returnPrice * numPassengers}" />

    <div class="headers">
      <h3>Your Flights</h3>
    </div>
    <form action="successfully-booked" method="post">
      <c:forEach var="flight" items="${flightsList}">
        <div class="flight-detials details" onclick="toggleDropdown(this)">
          <div class="flight-description">Outbound Flights</div>
          <div class="departure-details">
            <div class="departure-location">
              ${trip.departureBooking.flight.origin.name}
            </div>
            <div class="departure-date">
              ${departureDate} - ${flight.flightTime}
            </div>
          </div>
          <div class="flight-duration">
            <p class="duration">0h 45m</p>
            <div class="pics">
              <i class="fa-regular fa-circle-dot"></i>
              <div class="line"></div>
              <i class="fa-solid fa-location-dot"></i>
            </div>
            <p>NonStop</p>
          </div>
          <div class="arrival-details">
            <div class="arrival-location">
              ${trip.departureBooking.flight.destination.name}
            </div>
            <div class="arrival-date">
              ${departureDate} - ${flight.arrivaldate}
              <i class="fa-solid fa-caret-down"></i>
            </div>
          </div>
        </div>
        <div class="information flight-info">
          <h5>
            ${flight.flightTime} - ${trip.departureBooking.flight.origin.name}
          </h5>
          <p>Travel Time: 0h 45m</p>
          <h5>
            ${flight.arrivaldate} -
            ${trip.departureBooking.flight.destination.name}
          </h5>
        </div>
      </c:forEach>

      <c:if test="${trip.tripType eq TripType.Round}">
        <c:forEach var="flight" items="${returnflight}">
          <div class="flight-detials details" onclick="toggleDropdown(this)">
            <div class="flight-description">Return Flights</div>
            <div class="departure-details">
              <div class="departure-location">
                ${trip.returnBooking.flight.origin.name}
              </div>
              <div class="departure-date">
                ${departureDate} - ${flight.flightTime}
              </div>
            </div>
            <div class="flight-duration">
              <p class="duration">0h 45m</p>
              <div class="pics">
                <i class="fa-regular fa-circle-dot"></i>
                <div class="line"></div>
                <i class="fa-solid fa-location-dot"></i>
              </div>
              <p>NonStop</p>
            </div>
            <div class="arrival-details">
              <div class="arrival-location">
                ${trip.returnBooking.flight.destination.name}
              </div>
              <div class="arrival-date">
                ${departureDate} - ${flight.arrivaldate}
                <i class="fa-solid fa-caret-down"></i>
              </div>
            </div>
          </div>
          <div class="information flight-info">
            <h5>
              ${flight.flightTime} - ${trip.departureBooking.flight.origin.name}
            </h5>
            <p>Travel Time: 0h 45m</p>
            <h5>
              ${flight.arrivaldate} -
              ${trip.departureBooking.flight.destination.name}
            </h5>
          </div>
        </c:forEach>
      </c:if>

      <div class="headers">
        <h3>Passenger(s)</h3>
      </div>
      <c:forEach var="passenger" items="${passengers}">
        <div class="passenger-details details" onclick="toggleDropdown(this)">
          <div class="passenger">
            <p>
              <i class="fa-solid fa-person-walking-luggage"></i>
              ${passenger.firstName} ${passenger.lastName}
              <i class="fa-solid fa-caret-down"></i>
            </p>
          </div>
        </div>
        <div class="information passenger-info">
          <h5>First Name: ${passenger.firstName}</h5>
          <h5>Last Name: ${passenger.lastName}</h5>
          <h5>Gender: ${passenger.gender}</h5>
          <h5>Date Of Birth: ${passenger.dateOfBirth}</h5>
        </div>
      </c:forEach>

      <div class="headers">
        <h3>Total Price</h3>
      </div>
      <div class="price-details details" onclick="toggleDropdown(this)">
        <p>
          Pricing Details for Outbound Flights<i
            class="fa-solid fa-caret-down"
          ></i>
        </p>
        <p class="price">&#x20A6; ${totaldeparturePrice}</p>
      </div>
      <div class="information price-info">
        <p>Pricing Details for 1 Passenger</p>
        <div class="price-list">
          <p>Airfare:</p>
          <p>&#x20A6; ${trip.departureBooking.category.categoryPrice}</p>
          <p>Fuel Surcharge:</p>
          <p>&#x20A6;35000.0</p>
          <p>Taxes:</p>
          <p>&#x20A6;7500.0</p>
          <p>Travel Insurance:</p>
          <p>&#x20A6;1300.0</p>
        </div>
      </div>

      <c:if test="${trip.tripType eq TripType.Round}">
        <div class="price-details details" onclick="toggleDropdown(this)">
          <p>
            Pricing Details for Return Flights
            <i class="fa-solid fa-caret-down"></i>
          </p>
          <p class="price">&#x20A6; ${totalReturnPrice}</p>
        </div>
        <div class="information pricing-information">
          <p class="paragraph">Pricing Details for 1 Passenger</p>
          <div class="price-list">
            <p>Airfare:</p>
            <p>&#x20A6; ${trip.returnBooking.category.categoryPrice}</p>
            <p>Fuel Surcharge:</p>
            <p>&#x20A6;35000.0</p>
            <p>Taxes:</p>
            <p>&#x20A6;7500.0</p>
            <p>Travel Insurance:</p>
            <p>&#x20A6;1300.0</p>
          </div>
        </div>
      </c:if>

      <footer class="footer-section">
        <button class="btn">book flights</button>
      </footer>
    </form>

    <script>
      function toggleDropdown(element) {
        var dropdownContent = element.nextElementSibling;

        dropdownContent.classList.toggle("show");
      }
      document.addEventListener("DOMContentLoaded", function () {
        window.onclick = function (event) {
          if (!event.target.matches(".details")) {
            var dropdowns = document.getElementsByClassName("information");
            for (var i = 0; i < dropdowns.length; i++) {
              var openDropdown = dropdowns[i];
              if (openDropdown.classList.contains("show")) {
                openDropdown.classList.remove("show");
              }
            }
          }
        };
      });
    </script>
  </body>
</html>
