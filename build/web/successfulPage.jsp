<%-- Document : successfulPage Created on : Jan 7, 2024, 2:10:03 PM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aeroreserve</title>

    <style>
      body {
        background: whitesmoke;
        display: flex;
        justify-content: center;
        align-items: center;
        text-align: center;
        font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI",
          Roboto, Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue",
          sans-serif;
      }
      a {
        text-decoration: none;
      }

      .btn {
        display: inline-block;
        padding: 0.5rem 1.8rem;
        font-size: 1rem;
        border: 0.1rem solid #3ec1d5;
        outline: 0;
        background: #3ec1d5;
        /* border-radius: 1rem; */
        cursor: pointer;
        text-align: center;
        color: #fff;
        transition: 0.5s;
        margin-left: 1rem;
        margin-right: 1rem;
      }
      .btn:hover {
        background: none;
        color: #3ec1d5;
        transition: 0.5s;
      }
      header {
        position: fixed;
        top: -30px;
        right: 0;
        left: 0;
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 1rem 2%;
        background: none;
      }

      header img {
        height: 60px;
        width: 60px;
        border-radius: 50%;
      }

      header .logo a {
        color: #222;
        display: flex;
      }

      header .logo a span {
        font-size: 2rem;
        margin-top: 1rem;
      }

      nav {
        position: fixed;
        isolation: isolate;
        top: 0;
        width: 100%;
        max-width: var(--max-width);
        margin: auto;
        z-index: 9;
        border-bottom: 1px solid rgba(255, 255, 255, 0.2);
      }

      .container {
        margin-top: 7rem;
        position: relative;
      }
      .container#blur.active {
        filter: blur(20px);
        pointer-events: none;
        user-select: none;
      }
      h1 {
        font-weight: 800;
        margin-top: 0;
      }
      .container p {
        font-size: 1rem;
      }

      .booking-input {
        display: inline-block;
        gap: 5px;
      }

      .booking-input label {
        font-size: 1.2rem;
        font-weight: 500;
      }

      .booking-input input {
        width: 50%;
        padding: 0.5rem;
        font-size: 1rem;
        color: #222;
        outline: none;
        border: 1px solid #222;
        border-radius: 2px;
      }

      .booking-btn {
        margin-top: 4rem;
        display: flex;
        justify-content: space-between;
        width: auto;
        gap: 1rem;
        text-align: right;
      }
      #popup {
        position: fixed;
        top: 40%;
        left: 50%;
        transform: translate(-50%, -50%);
        width: 400px;
        height: 200px;
        padding: 50px;
        box-shadow: 0 5px 30px rgba(0, 0, 0, 0.3);
        background: whitesmoke;
        visibility: hidden;
        opacity: 0;
        transition: 0.5s;
      }
      #popup.active {
        top: 50%;
        visibility: visible;
        opacity: 1;
        transition: 0.5s;
      }

      .container span {
        font-size: 1.5rem;
        text-decoration: underline;
        font-weight: 700;
      }
    </style>
  </head>
  <body>
    <header class="header">
      <nav>
        <div class="nav-bar">
          <div class="logo">
            <a href="homePage"
              ><img src="Images/logo.png" alt="logo" /><span
                >Aeroreserve</span
              ></a
            >
          </div>
        </div>
      </nav>
    </header>

    <div class="container" id="blur">
      <div class="icon">
        <img src="./Images/success.gif" alt="success image" />
      </div>
      <h1>Congratulation</h1>
      <p>Flights has been successfully booked have a safe trip ahead</p>
      <p>
        This is your Reference Code is <span>${tripCode}</span> please keep
        safe
      </p>
      <div class="button-section">
        <a href="homePage" class="btn">Go To Home</a>
        <a href="search-flights" class="btn">Book Flights</a>
        <p class="btn" onclick="toggle()">Search Flights</p>
      </div>
    </div>
    <div id="popup">
      <h2>Search Flight</h2>
      <form action="search-trip" method="post">
        <div class="booking-input">
          <label for="referenceid">Reference Code</label>
          <input
            type="text"
            name="referenceid"
            id="referenceid"
            placeholder="Reference Code"
          />
          <div class="booking-btn">
            <button class="btn">Search Flights</button>
            <p class="btn" onclick="toggle()">Cancel</p>
          </div>
        </div>
      </form>
    </div>
    <script>
      function toggle() {
        var blur = document.getElementById("blur");
        blur.classList.toggle("active");
        var popup = document.getElementById("popup");
        popup.classList.toggle("active");
      }
    </script>
  </body>
</html>
