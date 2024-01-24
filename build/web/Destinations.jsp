<%-- Document : Destinations Created on : Dec 11, 2023, 12:44:37 AM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Destinations</title>
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

      .section__container {
        max-width: var(--max-width);
        margin: auto;
        padding: 5rem 1rem;
      }

      .section__header {
        font-size: 2rem;
        font-weight: 700;
        color: var(--text-dark);
      }

      .section__description {
        margin-top: 1rem;
        max-width: 600px;
        color: var(--text-light);
      }
      img {
        width: 100%;
        display: flex;
      }
      .offer_header {
        display: flex;
        gap: 2rem;
        flex-direction: column;
      }

      .offer_header a {
        color: var(--primary-color);
        transition: 0.3s;
      }

      .offer_header a:hover {
        color: var(--primary-color-dark);
      }

      .offer_grid {
        margin-top: 4rem;
        display: grid;
        gap: 1rem;
      }

      .offer_card {
        padding: 1rem;
        border-radius: 2px;
        box-shadow: 5px 5px 20px rgba(0, 0, 0, 0.1);
        transition: 0.3s;
      }

      .offer_card:hover {
        box-shadow: 5px 5px 20px rgba(0, 0, 0, 0.2);
      }

      .offer_Card img {
        margin-bottom: 1rem;
        border-radius: 5px;
      }

      .offer_card h4 {
        margin-bottom: 0.5rem;
        font-size: 1.2rem;
        font-weight: 800;
        color: var(--text-dark);
      }

      .offer_card p {
        margin-bottom: 1rem;
        color: var(--text-light);
      }

      .offer_card > div {
        display: flex;
        align-items: center;
        justify-content: space-between;
      }

      .offer_card span {
        font-size: 1.2rem;
        font-weight: 600;
        color: var(--primary-color);
      }

      @media (width > 576px) {
        offer_grid {
          grid-template-columns: repeat(2, 1fr);
        }

        .offer_header {
          flex-direction: row;
          align-items: center;
          justify-content: space-between;
        }
      }

      @media (width > 768px) {
        .offer_grid {
          grid-template-columns: repeat(3, 1fr);
        }
      }
    </style>
  </head>
  <body>
    <header class="header">
      <a href="homePage" class="logo"
        ><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a
      >
    </header>

    <section class="section__container offer_container" id="offer">
      <!-- <div class="offer_header">
        <h2 class="section__header">Flight Offer Details</h2>
        <a href="#">See All</a>
      </div> -->
      <div class="offer_grid">
        <div class="offer_card">
          <img src="./Images/Abuja.jpg" alt="offer" />
          <h4>Rivers To Abuja</h4>
          <p>15 Sep 2023</p>
          <div><span>$870.00</span> <button class="btn">Book Now</button></div>
        </div>
        <div class="offer_card">
          <img src="./Images/Lagos.jpg" alt="offer" />
          <h4>Lagos To Rivers</h4>
          <p>20 Sep 2023</p>
          <div><span>$570.00</span> <button class="btn">Book Now</button></div>
        </div>
        <div class="offer_card">
          <img src="./Images/Owerri.jpg" alt="offer" />
          <h4>Abuja To Owerri</h4>
          <p>25 Sep 2023</p>
          <div><span>$950.00</span> <button class="btn">Book Now</button></div>
        </div>
      </div>
    </section>
  </body>
</html>
