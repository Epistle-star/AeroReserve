<%-- Document : homePage Created on : Oct 5, 2023, 10:53:35 AM Author : HP --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>AeroReserve</title>
    <link rel="stylesheet" href="./css/home-css.css">
    <link rel="stylesheet" href="./Assets/fontawesome-free-6.2.0-web/css/all.css">
    <!-- <script src="https://kit.fontawesome.com/85f44cd006.js" crossorigin="anonymous"></script> -->
  </head>
  <body>
    <header class="header">
      <a href="#home" class="logo"><i class="fa-solid fa-plane"></i><span>Aero</span>Reserve</a>

      <nav class="navbar">
        <a href="#home">Home</a>
        <a href="#manage-flight">Manage-flights</a>
        <a href="#destinations">Destinations</a>
        <a href="#contact-us">Contact-us</a>
        <a href="Registration" class="btn">Sign-in</a>
      </nav>
      <div class="bars"><i class="fa-solid fa-bars-staggered"></i></div>
    </header>
    <!-- ................home................ -->
    <div class="home" id="home">
      <div class="swiper home-slide">
        <div class="swiper-wrapper">
          <div class="swiper-slide box">
            <div class="image">
              <img src="./Images/home (2).jpg" alt="image" class="frst" />
          </div>
            <div class="content">
              <h3>Welcome to AeroReserve</h3>
              <p>Your one-stop destination for hassle-free flight bookings</p>
              <a href="#manage-flights" class="btn">Book a flight</a>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- ..................manage flight........... -->
    <section class="manage-flight" id="manage-flight">
      <div class="heading">
        <h2>Flights</h2>
        <div></div>
      </div>
      <div class="checkin-section">
        <div class="tab-titles">
          <p class="tab-links active-links " onclick="opentab('book')"><span>Book</span></p>
          <p class="tab-links" onclick="opentab('my-booking')"><span>My-booking</span></p>
          <p class="tab-links" onclick="opentab('log-in')"><span>Log-in</span></p>
        </div>
          <form action="get-flights" method="get" class="form active-tab tab-contents" id="book">
          <div class="form-row">
            <label for="round-trip">Round Trip</label>
            <input type="radio" name="trip-type" id="round-trip" value="Round Trip"  checked/>
            <label for="one-way">One Way</label>
            <input type="radio" name="trip-type" id="one-way" value="One Way" />
          </div>

          <div id="round-trip-contents">
          <div class="form-row">
            <label for="departurelocation">Flying From:</label>
            <select name="departurelocation" id="departurelocation">
              <option value="From">From</option>
              <option value="Port-Harcourt">Port Harcourt</option>
              <option value="Enugu">Enugu</option>
              <option value="Abuja">Abuja</option>
              <option value="Lagos">Lagos</option>
              <option value="Owerri">Owerri</option>
              <option value="Calabar">Calabar</option>
            </select>
          </div>
          <div class="form-row">
            <label for="arrivallocation">Flying To:</label>
            <select name="arrivallocation" id="arrivallocation">
              <option value="To">To</option>
                  <option value="Port-Harcourt">Port Harcourt</option>
                  <option value="Enugu">Enugu</option>
                  <option value="Abuja">Abuja</option>
                  <option value="Lagos">Lagos</option>
            </select>
          </div>
            
          <div class="form-row">
            <label for="departuredate">Departure Date:</label>
            <input type="date" name="departuredate" id="departuredate" class="date" />
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
          </div>
          </div>
            </form>
          <form action="" method="post" class="form tab-contents" id="my-booking">
              <div class="form-row">
                <label for="reference-id" id="reference-id">Reference ID</label>
                <input type="text" name="reference-id" id="reference-id" placeholder="Reference ID">
              </div>
              <div class="form-row">
                <label for="username" id="username">Username</label>
                <input type="text" name="username" id="username" placeholder="Username">
              </div>
              
              <div class="form-row">
                <button class="btn" type="submit">Search Flights</button>
              </div>
        </form>

          <form action="login" method="post" class="form tab-contents" id="log-in">
          <div class="form-row">
            <label for="username">Username</label>
            <input type="text" name="username" id="username" placeholder="Username">
          </div>
          <div class="form-row">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" placeholder="Password">
          </div>
          <div class="form-row">
            <label for="register"><a href="Registration" >not a member? register</a></label>
            <button class="btn">Login</button>
          </div>
        </form>
          </div>
        </div>
      </div>
    </section>

    <!-- ............Destinations............... -->
      <section class="destinations" id="destinations">
        <div class="heading">
          <h2>Destinations</h2>
          <div></div>
        </div>
        <div class="row">
          <div class="swiper destination-slide">
            <div class="swiper-wrapper">
              <div class="swiper-slide box">
                <div class="content">
                  <h3>Rivers</h3>
                  <p>Treasure Base of the Nation</p>
                </div>
                <div class="image">
                  <img src="./Images/PortHArcourt.jpg" alt="Port-Harcourt-Image">
                </div>
              </div>

              <div class="swiper-slide box">
                <div class="content">
                  <h3>Cross-River</h3>
                  <p>The People's Paradise</p>
                </div>
                <div class="image">
                  <img src="./Images/Calabar.jpg" alt="Calabar-image">
                </div>
              </div>

              <div class="swiper-slide box">
                <div class="content">
                  <h3>Lagos</h3>
                  <p>Center of Excellence</p>
                </div>
                <div class="image">
                  <img src="./Images/Lagos.jpg" alt="Lagos-Image">
                </div>
              </div>

              <div class="swiper-slide box">
                <div class="content">
                  <h3>Enugu</h3>
                  <p>Coal City State</p>
                </div>
                <div class="image">
                  <img src="./Images/Enugu.jpg" alt="Enugu-Image">
                </div>
              </div>

              <div class="swiper-slide box">
                <div class="content">
                  <h3>Abuja</h3>
                  <p>Center of Unity</p>
                </div>
                <div class="image">
                  <img src="./Images/Abuja.jpg" alt="Abuja">
                </div>
              </div>

              <div class="swiper-slide box">
                <div class="content">
                  <h3>Imo</h3>
                  <p>Eastern Heartland</p>
                </div>
                <div class="image">
                  <img src="./Images/Owerri.jpg" alt="Owerri-Image">
                </div>
              </div>
            </div>
          </div>
        </div>
        
          <a class="btn" href="./Destinations.jsp">See more...</a>
      </section>


      <!-- ...............Contact............ -->
      <section class="contact" id="contact-us">
        <div class="heading">
          <h2>Contact Us</h2>
          <div></div>
        </div>

        <div class="container">
                <div class="row">
                    <div class="contact-left">
                        <!-- <h1 class="sub-title">Contact Me</h1> -->
                        <p><i class="fa-solid fa-paper-plane"></i>  aeroreserve2023@gmail.com</p>
                        <p><i class="fa-solid fa-phone-volume"></i> +2347040011584</p>
                        <p><i class="fa-brands fa-whatsapp"></i> +2349027815857</p>
                        <div class="socail-icons">
                            <a href="https://www.facebook.com/profile.php?id=100086733053739&mibextid=ZbWKwL"><i class="fa-brands fa-facebook"></i></a>
                            <a href="https://twitter.com/EbubeEpist75514?t=n99CZAgXv5cNttrHj7GN2A&s=08"><i class="fa-brands fa-twitter"></i></a>
                            <a href="https://instagram.com/ebubeonunwor?igshid=YWYwM2I1ZDdmOQ=="><i class="fa-brands fa-instagram"></i></a>
                            <a href=""><i class="fa-brands fa-square-x-twitter"></i></a>
                        </div>
                    </div>
                    <div class="contact-right">
                        <form action="" method="post">
                            <input type="text" name="name" placeholder="Your Name" required>
                            <input type="email" name="email" placeholder="Your Email" required>
                            <textarea name="message" rows="6" placeholder="Your Message"></textarea>
                            <button class="btn btn2">Submit</button>
                        </form> 
                    </div>
                </div>
            </div>


      </section>

      <!-- .............footer................... -->
      <footer class="footer" id="footer">
        <div class="map">
          <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d9186.032034528145!2d7.042534841168402!3d4.8685229888332655!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sng!4v1698327171113!5m2!1sen!2sng" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>
        <div class="content">
            <h3>AeroReserve</h3>
            <p>Your one-stop destination for hassle-free flight bookings
              Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quae, doloremque.
            </p>
            <div class="share">
              <i class="fa-brands fa-facebook"></i>
              <i class="fa-brands fa-twitter"></i>
              <i class="fa-brands fa-instagram"></i>
              <i class="fa-brands fa-square-x-twitter"></i>
            </div>
        </div>

        <div class="links">
            <h3>links</h3>
              <a href="#home">Home</a>
              <a href="#manage-flight">Manage-flights</a>
              <a href="#destinations">Destinations</a>
              <a href="#contact-us">Contact-us</a>
        </div>
      </footer>



    <script src="./scripts/home-script.js"></script>
    
  </body>
</html>
