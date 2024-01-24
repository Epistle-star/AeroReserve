<%-- Document : get-flights Created on : Dec 3, 2023, 12:10:16 AM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Get Flights</title>
    <link rel="stylesheet" href="./css/get-flights.css" />
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />
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

    <div class="flight-details">
      <div class="departure-details">
        <p class="departure-time">8:35</p>
        <p class="departure-location">Port-Harcourt</p>
        <p class="arrival-date">04 Dec 2023</p>
      </div>
      <div class="flight-description">
        <p class="duration">1h 10m</p>
        <div class="pics">
          <i class="fa-regular fa-circle-dot"></i>
          <div class="line"></div>
          <i class="fa-solid fa-location-dot"></i>
        </div>
        <p>NonStop</p>
      </div>
      <div class="arrival-details">
        <p class="arrival-time">8:35</p>
        <p class="arrival-location">Abuja</p>
        <p class="arrival-date">04 Dec 2023</p>
      </div>

      <div class="category-container">
        <p class="category-price price1" onclick="toggleDropdown(this)">
          $135.00
        </p>
        <div class="category-details">
          <ul>
            <li>Inflight meals</li>
            <li>refundable tickets with fees</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
          </ul>
          <a href="" class="btn">$135.00</a>
        </div>
      </div>

      <div class="category-container">
        <p class="category-price" onclick="toggleDropdown(this)">$150.00</p>
        <div class="category-details">
          <ul>
            <li>Inflight meals</li>
            <li>refundable tickets with fees</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
          </ul>
          <a href="" class="btn">$150.00</a>
        </div>
      </div>
    </div>

    <div class="flight-details">
      <div class="departure-details">
        <p class="departure-time">15:55</p>
        <p class="departure-location">Port-Harcourt</p>
        <p class="arrival-date">04 Dec 2023</p>
      </div>
      <div class="flight-description">
        <p class="duration">1h 10m</p>
        <div class="pics">
          <i class="fa-regular fa-circle-dot"></i>
          <div class="line"></div>
          <i class="fa-solid fa-location-dot"></i>
        </div>
        <p>NonStop</p>
      </div>
      <div class="arrival-details">
        <p class="arrival-time">17:05</p>
        <p class="arrival-location">Abuja</p>
        <p class="arrival-date">04 Dec 2023</p>
      </div>
      <div class="category-container">
        <p class="category-price price1" onclick="toggleDropdown(this)">
          $135.00
        </p>
        <div class="category-details">
          <ul>
            <li>Inflight meals</li>
            <li>refundable tickets with fees</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
          </ul>
          <a href="" class="btn">$135.00</a>
        </div>
      </div>

      <div class="category-container">
        <p class="category-price" onclick="toggleDropdown(this)">$150.00</p>
        <div class="category-details">
          <ul>
            <li>Inflight meals</li>
            <li>refundable tickets with fees</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
            <li>Inflight meals</li>
          </ul>
          <a href="" class="btn">$150.00</a>
        </div>
      </div>
    </div>

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
