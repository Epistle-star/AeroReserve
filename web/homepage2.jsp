<%-- Document : homepage2 Created on : Dec 11, 2023, 1:56:50 AM Author : Epistle
--%> <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Home page</title>
    <link
      rel="stylesheet"
      href="./Assets/fontawesome-free-6.2.0-web/css/all.css"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css"
    />
    <link rel="stylesheet" href="./css/home.css" />
  </head>
  <body>
    <header class="header">
      <nav>
        <div class="nav-bar">
          <div class="logo">
            <a href="#"
              ><img src="Images/logo.png" alt="logo" /><span
                >Aeroreserve</span
              ></a
            >
          </div>
          <div class="nav-menu-btn" id="menu-btn">
            <i class="fa-solid fa-bars"></i>
          </div>
        </div>
        <ul class="nav-links" id="nav-links">
          <li><a href="#home">Home</a></li>
          <li><a href="#service">Services</a></li>
          <li><a href="#offer">Destinations</a></li>
          <li><a href="#contact">Contact-US</a></li>
          <li><a href="Registration" class="btn">Sign Up</a></li>
        </ul>
      </nav>
      <div class="section-container header-container" id="home">
        <h2>Welcome To Aeroreserve</h2>
        <p>Book your flights with ease and convenience</p>
      </div>
      <div class="booking">
        <div class="booking-type" id="booking-type">
          <div class="active tab-links active-links" onclick="showForm('book')">
            Book
          </div>
          <div class="tab-links" onclick="showForm('my-booking')">
            My-bookings
          </div>
          <div class="tab-links" onclick="showForm('log-in')">Login</div>
        </div>
        <form
          action="get-flights"
          method="get"
          class="booking-form active-tab tab-contents"
          id="book"
        >
          <div class="booking-input radio">
            <label for="round-trip">Round Trip</label>
            <input
              type="radio"
              name="trip-type"
              id="round-trip"
              value="Round Trip"
              checked
            />
          </div>
          <div class="booking-input">
            <label for="one-way">One Way</label>
            <input type="radio" name="trip-type" id="one-way" value="One Way" />
          </div>
          
          <div class="booking-input">
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
            <div class="booking-input">
                <label for="arrivallocation">Flying To:</label>
            <select name="arrivallocation" id="arrivallocation">
              <option value="To">To</option>
            </select>
          </div>
          <div class="booking-input">
            <label for="departuredate">Departure Date</label>
            <input
              type="date"
              name="departuredate"
              id="departuredate"
              placeholder="Departure Date"
            />
          </div>
          <div class="booking-input" id="returndatefield">
            <label for="returndate">Return Date</label>
            <input
              type="date"
              name="returndate"
              id="returndate"
              placeholder="Return Date"
            />
          </div>
          <div class="booking-input">
            <label for="adults">Adults</label>
            <select name="adult" id="adults">
              <option value="1">1 Adult (12 years+)</option>
              <option value="2">2 Adults (12 years+)</option>
              <option value="3">3 Adults (12 years+)</option>
              <option value="4">4 Adults (12 years+)</option>
              <option value="5">5 Adults (12 years+)</option>
            </select>
          </div>
          <div class="booking-input">
            <label for="children">Children</label>
            <select name="children" id="children">
              <option value="0">Select PassengerType</option>
              <option value="1">1 Child</option>
              <option value="2">2 Children</option>
              <option value="3">3 Children</option>
              <option value="4">4 Children</option>
              <option value="5">5 Children</option>
            </select>
          </div>
          <div class="booking-btn">
            <button class="btn">Book Now</button>
          </div>
        </form>
        <form
          action="search-trip"
          method="post"
          class="booking-form tab-contents"
          id="my-booking"
        >
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
            </div>
          </div>
        </form>
        <form
          action="login"
          method="post"
          class="booking-form tab-contents"
          id="log-in"
        >
          <div class="booking-input">
            <label for="username">USername</label>
            <input
              type="text"
              name="username"
              id="username"
              placeholder="USername"
            />
          </div>
          <div class="booking-input">
            <label for="password">Password</label>
            <input type="password" name="password" id="password" />
          </div>
          <div class="booking-input">
            <a href="Registration">Not a member? Login</a>
          </div>
          <div class="booking-btn">
            <button class="btn">Login</button>
          </div>
        </form>
      </div>
    </header>

    <section class="section-container service-container" id="service">
      <h2 class="section-header">Our Services</h2>
      <p class="section-description">
        Welcome to Aeroreserve, the premier flight booking system. We offer a
        wide range of services to make your travel experience seamless and
        stress-free. With our user-friendly platform, you can easily search and
        book flights with just a few clicks. Experience the convenience of
        Aeroreserve today!
      </p>
      <div class="service-grid">
        <div class="service-card">
          <img src="./Images/cruise-ticket.jpg" alt="service" />

          <div>
            <div>
              <h4>Cruise Ticket</h4>
              <p>
                Immerse yourself in the allure of the open sea as you set sail
                on a maticulously crafted cruise experience.
              </p>
            </div>
          </div>
          <div class="service-btn">
            <button class="btn">See All</button>
          </div>
        </div>
        <div class="service-card">
          <img src="./Images/car-booking.jpg" alt="service" />

          <div>
            <div>
              <h4>Car Booking</h4>
              <p>
                Experience unparalised convenience with our car booking service,
                designed to elevate your travel journey.
              </p>
            </div>
            <div class="service-btn">
              <button class="btn">See All</button>
            </div>
          </div>
        </div>
        <div class="service-card">
          <img src="./Images/air-ticket.jpg" alt="service" />

          <div>
            <div>
              <h4>Air Ticket</h4>
              <p>
                Secure your wings to the world with our Air Ticket Services.
                Your gaeway to seamless travel.
              </p>
            </div>
            <div class="service-btn">
              <button class="btn">See All</button>
            </div>
          </div>
        </div>
        <div class="service-card">
          <img src="./Images/hotel.jpg" alt="service" />

          <div>
            <div>
              <h4>Hotel Booking</h4>
              <p>
                Browse through a curated selection of handpicked hotels, chosen
                for it's quality, amanities, and locations.
              </p>
            </div>
            <div class="service-btn">
              <button class="btn">See All</button>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="section-container offer-container" id="offer">
      <div class="offer-header">
        <h2 class="section-header">Flight Offer Details</h2>
        <a href="Destinations">See All</a>
      </div>
      <div class="offer-grid">
        <div class="offer-card">
          <img src="./Images/Abuja.jpg" alt="offer" />
          <h4>Rivers To Abuja</h4>
          <div>
            <span>69,000.00</span>
            <a href="search-flights" class="btn">Book Now</a>
          </div>
        </div>
        <div class="offer-card">
          <img src="./Images/Lagos.jpg" alt="offer" />
          <h4>Lagos To Rivers</h4>
          <div>
            <span>72,500.00</span>
            <a href="search-flights" class="btn">Book Now</a>
          </div>
        </div>
        <div class="offer-card">
          <img src="./Images/Owerri.jpg" alt="offer" />
          <h4>Abuja To Owerri</h4>
          <div>
            <span>82,000.00</span>
            <a href="search-flights" class="btn">Book Now</a>
          </div>
        </div>
      </div>
    </section>

    <section class="client" id="client">
      <div class="clientcontainer section-container">
        <h2 class="section-header">What our Clients Say</h2>
        <p class="section-description">
          Discover the stories of wanderlust and cherishd valued eyes of our
          valued Clients.
        </p>
        <div class="swiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client (F).jpg" alt="client" />
                <h4>Sarah Thompson</h4>
                <p>Marketing Executive</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                </div>
                <p>
                  Booking my dream vacation was a breeze with this platform! The
                  seamless hotel booking made my trip unforgettable.
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client(1).jpg" alt="client" />
                <h4>James Rodriguez</h4>
                <p>Software Developer</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                </div>
                <p>
                  As a frequent traveler, I relly on this website for all my
                  journeys. The 24/7 customer support has been a game changer
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client(2).jpg" alt="client" />
                <h4>Micheal Turner</h4>
                <p>Business Analyst</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                </div>
                <p>
                  The convenience of booking flights, accomodations, and
                  transportation all in one place is a game changer.
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client (3).jpg" alt="client" />
                <h4>David Carter</h4>
                <p>Adventure Enthusiast</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                </div>
                <p>
                  The Travel resources and tips on this platform us a goldmine
                  for anyone looking to make the most of their travels.
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client (F)2.jpg" alt="client" />
                <h4>Emily Chang</h4>
                <p>Graphic Designer</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                </div>
                <p>
                  The local guides and experience offered by this platform added
                  a whole new dimension to my travels.
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client (F)3.jpg" alt="client" />
                <h4>Emily Wilson</h4>
                <p>Marketing Executive</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                </div>
                <p>
                  I am consistently impressed with AeroReserve Flight System!
                  From the seamless booking process to the punctual departures
                  and user-friendly interface.
                </p>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="client-card">
                <img src="./Images/client (4).jpg" alt="client" />
                <h4>Francis Wilson</h4>
                <p>Marketing Executive</p>
                <div class="client-ratings">
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star"></i></span>
                  <span><i class="fa-solid fa-star-half-stroke"></i></span>
                </div>
                <p>
                  I've been using Aeroreserve for all my flight bookings and it
                  has made my life so much easier. The booking process is
                  seamless. I highly recommend Aeroreserve to anyone in need of
                  a reliable flight booking system.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="section-container contact-container" id="contact">
      <div class="section-header">Contact Us</div>

      <div class="container">
        <div class="row">
          <div class="contact-left">
            <p>
              <i class="fa-solid fa-paper-plane"></i> aeroreserve2023@gmail.com
            </p>
            <p><i class="fa-solid fa-phone-volume"></i> +2347040011584</p>
            <p><i class="fa-brands fa-whatsapp"></i> +2349027815857</p>
            <div class="socail-icons">
              <a
                href="https://www.facebook.com/profile.php?id=100086733053739&mibextid=ZbWKwL"
                ><i class="fa-brands fa-facebook"></i
              ></a>
              <a
                href="https://twitter.com/EbubeEpist75514?t=n99CZAgXv5cNttrHj7GN2A&s=08"
                ><i class="fa-brands fa-twitter"></i
              ></a>
              <a
                href="https://instagram.com/ebubeonunwor?igshid=YWYwM2I1ZDdmOQ=="
                ><i class="fa-brands fa-instagram"></i
              ></a>
              <a href=""><i class="fa-brands fa-square-x-twitter"></i></a>
            </div>
          </div>
          <div class="contact-right">
            <form action="" method="post">
              <input type="text" name="name" placeholder="Your Name" required />
              <input
                type="email"
                name="email"
                placeholder="Your Email"
                required
              />
              <textarea
                name="message"
                rows="6"
                placeholder="Your Message"
              ></textarea>
              <button class="btn btn2">Submit</button>
            </form>
          </div>
        </div>
      </div>
    </section>

    <footer class="footer">
      <div class="section-container footer-container">
        <div class="footer-col">
          <div class="logo">
            <a href="#"><img src="./Images/logo.png" alt="logo" /></a>
          </div>
          <p>
            Explore the world with ease and excitement through our travel
            platform. Your journey begins here, where seamless people meet
            unforgettable experiences.
          </p>
          <ul class="footer-socials">
            <li>
              <a href="#"><i class="fa-brands fa-facebook-f"></i></a>
            </li>
            <li>
              <a href="#"><i class="fa-brands fa-instagram"></i></a>
            </li>
            <li>
              <a href="#"><i class="fa-brands fa-youtue"></i></a>
            </li>
          </ul>
        </div>
        <div class="footer-col">
          <h4>Quick Links</h4>
          <ul class="footer-links">
            <li>
              <a href="#home">Home</a>
            </li>
            <li>
              <a href="#service">Services</a>
            </li>
            <li>
              <a href="#offer">Destinations</a>
            </li>
            <li>
              <a href="#contact">Contact-US</a>
            </li>
          </ul>
        </div>
        <div class="footer-col">
          <h4>Contact-US</h4>
          <ul class="footer-links">
            <li>
              <a href=""
                ><span><i class="fa-solid fa-phone"></i></span>+234 704 001
                1584</a
              >
            </li>
            <li>
              <a href=""
                ><span><i class="fa-solid fa-voicemail"></i></span
                >aeroreserveinfo@gmail.com</a
              >
            </li>
            <li>
              <a href=""
                ><span><i class="fa-solid fa-voicemail"></i></span
                >aeroreserveinfo@gmail.com</a
              >
            </li>
          </ul>
        </div>
      </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
    <script src="./scripts/home.js"></script>
  </body>
</html>
