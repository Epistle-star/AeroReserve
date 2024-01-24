<%-- Document : login Created on : Oct 26, 2023, 2:47:08 PM Author : Epistle
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Sign-up</title>
    <link rel="stylesheet" href="./css/login-css.css" />
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />
  </head>
  <body>
    <%@include file="alert.jsp"%>

    <header class="header">
      <a href="homePage" class="logo"
        ><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a
      >
    </header>

    <div class="container">
      <div class="form-container">
        <div class="form-toggle">
          <button class="toggle-btn" id="login-btn">Login</button>
          <button class="toggle-btn" id="signup-btn">Sign Up</button>
        </div>
        <form id="login-form" class="active" action="login" method="post">
          <!-- Login form content here -->
          <h2>Login</h2>
          <input type="text" placeholder="Username" name="username" />
          <input type="password" placeholder="Password" name="password" />
          <button>Login</button>
        </form>
        <form id="signup-form" action="signup" method="post">
          <!-- Sign Up form content here -->
          <h2>Sign Up</h2>
          <input type="text" placeholder="Full Name" name="name" />
          <input type="email" placeholder="Email" name="email" />
          <input type="text" placeholder="Username" name="username" />
          <input type="password" placeholder="Password" name="password" />
          <button>Sign Up</button>
        </form>
      </div>
    </div>
    <script src="./Assets/jquery-3.7.0.min.js"></script>
    <script src="./scripts/loginscript.js"></script>
  </body>
</html>
