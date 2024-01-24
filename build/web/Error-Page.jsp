<%-- Document : Error-Page Created on : Nov 22, 2023, 2:44:13 AM Author :
Epistle --%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Aeroreserve</title>
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
        /* z-index: 1001; */
      }
      header .logo {
        font-size: 3rem;
        color: #fff;
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
        font-size: 1.5rem;
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
      .image img {
        /* display: block; */
        width: 100%;
        height: 99.6vh;
        object-fit: cover;
      }
      .home .home-slide .box {
        position: relative;
      }
      .home .home-slide .box::before {
        content: "";
        background: rgba(0, 0, 0, 0.6);
        position: absolute;
        top: 0;
        left: 0;
        bottom: 0;
        right: 0;
      }
      .home .home-slide .box .content {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        text-align: center;
        color: #fff;
      }
      .home .home-slide .box .content h3 {
        font-size: 3rem;
      }
    </style>
  </head>
  <body>
    <div class="home" id="home">
      <div class="swiper home-slide">
        <div class="swiper-wrapper">
          <div class="swiper-slide box">
            <div class="image">
              <img src="./Images/PortHArcourt.jpg" alt="image" class="frst" />
            </div>
            <div class="content">
              <h3>Lost Your Way</h3>
              <a href="homePage" class="btn">Go To Home</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
