<%-- Document : Contact-info Created on : Jan 2, 2024, 2:21:32 AM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />
    <title>Aeroreserve</title>

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
        top: -20px;
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
      .paragraph {
        padding-top: 4rem;
        padding-left: 10rem;
        font-size: 1.5rem;
        font-weight: 500;
        display: flex;
        gap: 4rem;
        margin-top: 3rem;
      }
      .passengercount {
        padding: 1rem;
        padding-left: 2rem;
        border: 2px solid #222;
        justify-content: space-around;
        width: 30%;
        font-size: 20px;
        display: inline-block;
      }
      .passengercount li {
        cursor: pointer;
      }
      input {
        height: 15px;
        font-size: 15px;
        border: 1px solid #222;
        border-radius: 8px;
        color: #222;
        padding: 10px;
        margin: 1rem;
        width: 10rem;
      }
      select {
        height: 2.5rem;
        color: #222;
        font-size: 15px;
        border: 1px solid #222;
        border-radius: 8px;
        padding: 10px;
        margin: 1rem;
        width: 10rem;
      }

      .box {
        border: 2px solid #222;
        padding: 2rem 4rem;
        display: flex;
        justify-content: center;
        text-align: center;
        gap: 1.5rem;
        align-items: center;
        width: 60%;
        margin-left: 12rem;
        margin-top: 5rem;
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
    <header class="header">
      <a href="homePage" class="logo"
        ><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a
      >
    </header>

    <%@include file="alert.jsp" %>

    <div class="container">
      <div class="paragraph"><p>Contact Information</p></div>

      <div class="box">
        <div class="passengercount">
          <ul>
            <li>Contact Info :</li>
          </ul>
        </div>

        <form action="review-bookings" method="post">
          <input type="text" name="fullname" placeholder="Full Name" required />
          <input type="email" name="email" placeholder="Email" required />
          <input
            type="number"
            name="phone"
            placeholder="Phone"
            id="phone"
            required
          />
          <button class="btn" id="submitButton">Review Bookings</button>
        </form>
      </div>
    </div>

    <script>
      // function validateNumberLength(input) {
      //   const maxLength = 11;
      //   const inputValue = input.value;

      //   if (inputValue.length > maxLength) {
      //     input.setCustomValidity("Phone is incorrect.");
      //   } else {
      //     input.setCustomValidity("");
      //   }
      // }
    </script>
  </body>
</html>
