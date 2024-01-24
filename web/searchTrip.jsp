<%-- Document : searchFlights12345 Created on : Jan 8, 2024, 4:20:45 AM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aeroreserve</title>
    <link rel="stylesheet" href="./css/review-bookings.css" />
    
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />
  </head>
  <body>
    <div class="headers">
      <h3>Flight Details</h3>
    </div>

    <div class="flight-detials details" onclick="toggleDropdown(this)">
      <div class="flight-description">Outbound Flights</div>
      <div>${trip.departureBooking.category.categoryType}</div>
      <div class="departure-details">
        <div class="departure-location">
          ${trip.departureBooking.flight.origin.name}
        </div>
        <div class="departure-date">
          ${trip.departureBooking.flight.flightTime}
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
          ${trip.departureBooking.flight.arrivaldate}
          <i class="fa-solid fa-caret-down"></i>
        </div>
      </div>
    </div>
    <div class="information flight-info">
      <h5>
        ${trip.departureBooking.flight.flightTime} - ${trip.departureBooking.flight.origin.name}
      </h5>
      <p>Travel Time: 0h 45m</p>
      <h5>
        ${trip.departureBooking.flight.arrivaldate} - ${trip.departureBooking.flight.destination.name}
      </h5>
    </div>

    <div class="flight-detials details" onclick="toggleDropdown(this)">
      <div class="flight-description">Return Flights</div>
      <div>${trip.departureBooking.category.categoryType}</div>
      <div class="departure-details">
        <div class="departure-location">
          ${trip.returnBooking.flight.origin.name}
        </div>
        <div class="departure-date">
           ${trip.returnBooking.flight.flightTime}
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
          ${trip.returnBooking.flight.arrivaldate}
          <i class="fa-solid fa-caret-down"></i>
        </div>
      </div>
    </div>
    <div class="information flight-info">
      <h5>
        ${trip.returnBooking.flight.flightTime} - ${trip.returnBooking.flight.origin.name}
      </h5>
      <p>Travel Time: 0h 45m</p>
      <h5>
        ${trip.returnBooking.flight.arrivaldate} - ${trip.returnBooking.flight.destination.name}
      </h5>
    </div>

    <div class="headers">
      <h3>Passenger(s) details</h3>
    </div>
    <c:forEach var="passenger" items="${passenger}">
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
      <h3>Contact Details</h3>
    </div>
    <div class="contact-details details" onclick="toggleDropdown(this)">
      <div class="contact">
        <p>
          >${trip.departureBooking.contact.fullName}
          <i class="fa-solid fa-caret-down"></i>
        </p>
      </div>
    </div>
    <div class="information passenger-info">
      <h5>Full Name: ${trip.departureBooking.contact.fullName}</h5>
      <h5>Email: ${trip.departureBooking.contact.email}</h5>
      <h5>Phone: ${trip.departureBooking.contact.phone}</h5>
    </div>

    <div class="headers">
      <h3>Pricing Details</h3>
    </div>

    <div class="price-details details" onclick="toggleDropdown(this)">
      <p>
        Pricing Details for Outbound Flights<i
          class="fa-solid fa-caret-down"
        ></i>
      </p>
      <p class="price">&#x20A6; ${trip.departureBooking.category.categoryPrice + 43800}</p>
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

    <footer class="footer-section">
      <a href="homePage" class="btn">Go To Home</a>
    </footer>

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
