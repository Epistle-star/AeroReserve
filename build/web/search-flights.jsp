<%-- Document : search-flights Created on : Nov 19, 2023, 2:22:34 PM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aeroreserve</title>
    <!-- <link rel="stylesheet" href="./css/search-flights.css" /> -->
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />

    <style>
      * {
        margin: 0;
        padding: 0;
        text-decoration: none;
        font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI",
          Roboto, Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue",
          sans-serif;
        outline: none;
        border: none;
      }
      body {
        background: whitesmoke;
      }
      header {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 1rem 2%;
        background: none;
      }
      header .logo {
        font-size: 3rem;
        color: #2b2c2c;
        text-decoration: none;
        padding: 0.4rem;
      }
      header span {
        color: #3ec1d5;
        font-weight: 500;
      }
      .btn {
        display: inline-block;
        padding: 0.5rem 1.8rem;
        font-size: 1rem;
        border: 0.1rem solid #3ec1d5;
        outline: 0;
        background: #3ec1d5;
        border-radius: 1rem;
        cursor: pointer;
        text-align: center;
        color: #fff;
      }
      .btn:hover {
        background: none;
        color: #3ec1d5;
      }
      header .suggestion {
        text-align: center;
        border: 3px solid #222;
        border-radius: 1rem;
      }
      .suggestion p {
        padding: 0.5rem;
        font-size: 20px;
      }
      h2 {
        margin-top: 10rem;
        display: inline-block;
        margin-bottom: -20rem;
        margin-left: 7rem;
      }
      .form {
        width: 85vw;
        height: auto;
        border: 2px solid #222;
        /* text-align: center; */
        background: rgba(0, 0, 0, 0.006);
        display: block;
        /* flex-direction: column; */
        backdrop-filter: blur(3px);
        align-items: center;
        justify-content: center;
        margin-left: 6rem;
        margin-top: 15px;
        margin-bottom: 5rem;
      }
      .form-contents {
        border: 2px solid #222;
        width: 90%;
        margin-bottom: 30px;
        margin-left: 3rem;
        /* padding: 4rem; */
      }
      .tab-contents {
        display: block;
        /* flex-direction: column; */
        /* align-items: center; */
        text-align: center;
      }
      .tab-contents input,
      button {
        margin: 10px;
        padding: 10px 15px;
        border: none;
        outline: none;
        border-radius: 10px;
        font-size: 16px;
      }
      .tab-contents .date,
      select {
        width: 90%;
        height: 30px;
      }
      label {
        color: #222;
        font-size: 17px;
      }
      .form input[type="radio"] {
        display: inline-block;
        margin-right: 10rem;
      }
      .form .form-row {
        display: inline-flex;
        align-items: center;
        margin-bottom: 10px;
        margin-top: 3rem;
      }

      .form .form-row label {
        width: 150px; /* Adjust width as needed */
        margin-right: 10px 10px;
      }
      .form .form-row select,
      .form .form-row input[type="date"] {
        /* flex-grow: 0.5; */
        border: 0.5px solid #222;
        height: 2.5rem;
        border-radius: 10px;
        padding: 5px 10px;
      }
      .form .form-row:last-child {
        text-align: center;
        /* margin: 9rem;  */
      }
      .row3 {
        justify-content: baseline;
      }

      .feedback-container {
        position: absolute;
        top: 60px;
        left: 50%;
        transform: translateX(-50%);
        padding: 10px 15px;
        text-align: center;
        background-color: #3ec1d5;
        color: #fff;
        display: flex;
        justify-content: space-between;
        align-items: center;
        border-radius: 5px;
        gap: 30px;
        font-size: 0.9rem;
      }
      .feedback-container .close-btn {
        cursor: pointer;
      }
    </style>
  </head>
  <body>
    <%@include file="alert.jsp"%>
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

    <h2>Book a Flight</h2>
    <form
      action="get-flights"
      method="GET"
      class="form active-tab tab-contents"
      id="book"
    >
      <div class="form-row">
        <label for="round-trip">Round Trip</label>
        <input
          type="radio"
          name="trip-type"
          id="round-trip"
          value="Round Trip"
          checked
        />
        <label for="one-way">One Way</label>
        <input type="radio" name="trip-type" id="one-way" value="One Way" />
      </div>
      <div class="form-contents">
        <div id="round-trip-contents">
          <div class="form-row">
            <label for="departurelocation">Flying From:</label>
            <select
              name="departurelocation"
              id="departurelocation"
              onchange="updateArrivalLocations()"
            >
              <option value="From">From</option>
              <option value="Rivers">Rivers</option>
              <option value="Lagos">Lagos</option>
              <option value="Owerri">Owerri</option>
              <option value="Abuja">Abuja</option>
            </select>
          </div>
          <div class="form-row">
            <label for="arrivallocation">Flying To:</label>
            <select name="arrivallocation" id="arrivallocation">
              <option value="To">To</option>
            </select>
          </div>

          <div class="form-row">
            <label for="departuredate">Departure Date:</label>
            <input
              type="date"
              name="departuredate"
              id="departuredate"
              class="date"
            />
          </div>
          <div class="form-row" id="returndatefield">
            <label for="returndate">Return Date:</label>
            <input type="date" name="returndate" id="returndate" class="date" />
          </div>
          <div class="form-row">
            <label for="passengertype">Adults:</label>
            <select name="adult" id="passengertype">
              <option value="1">1 Adult (12 years+)</option>
              <option value="2">2 Adults (12 years+)</option>
              <option value="3">3 Adults (12 years+)</option>
              <option value="4">4 Adults (12 years+)</option>
              <option value="5">5 Adults (12 years+)</option>
              <option value="6">6 Adults (12 years+)</option>
            </select>
          </div>

          <div class="form-row">
            <label for="passengertype">Children:</label>
            <select name="children" id="passengertype">
              <option value="0">select passengertype</option>
              <option value="1">1 Child (2-11 years)</option>
              <option value="2">2 Children (2-11 years)</option>
              <option value="3">3 Children (2-11 years)</option>
              <option value="4">4 Children (2-11 years)</option>
            </select>
          </div>
          <div class="form-row">
            <button class="btn" type="submit">Get Bookings</button>
            <p class="btn tab-links" onclick="opentab('my-booking', event)"><span>Search Flights</span></p>
          </div>
        </div>
      </div>
    </form>

    <form
      action="get-flights"
      method="post"
      class="form tab-contents"
      id="my-booking"
      style="display: none"
    >
      <div class="form-row">
        <label for="search-reference-id" id="reference-id">Reference ID</label>
        <input
          type="text"
          name="reference-id"
          id="search-reference-id"
          placeholder="Reference ID"
        />
      </div>
      <div class="form-row">
        <label for="search-username" id="username">Username</label>
        <input
          type="text"
          name="username"
          id="search-username"
          placeholder="Username"
        />
      </div>

      <div class="form-row">
        <button class="btn" type="submit">Search Flights</button>
        <p class="btn tab-links" onclick="opentab('book', event)">
          <span>Get Bookings</span>
        </p>
      </div>
    </form>
    <script src="./Assets/jquery-3.7.0.min.js"></script>
    <script src="./scripts/search-flights.js"></script>
  </body>
</html>
