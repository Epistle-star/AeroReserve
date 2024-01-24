<%-- 
    Document   : get-flights
    Created on : Nov 21, 2023, 10:04:10 PM
    Author     : Epistle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aeroreserve</title>
        <link rel="stylesheet" href="./Assets/fontawesome-free-6.2.0-web/css/all.css">
        
        <style>
            * {
                 margin: 0;
                padding: 0;
                text-decoration: none;
                font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
                    Oxygen, Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
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
                .paragraph{
                    padding-top: 4rem;
                    padding-left: 10rem;
                    font-size: 1.5rem;
                    font-weight: 500;
                    display: flex;
                    gap: 4rem;
                    margin-top: 3rem;
                }
                .passengercount{
                    padding: 1rem;
                    padding-left: 2rem;
                    border: 2px solid #222;
                    justify-content: space-around;
                    width: 30%;
                    font-size: 20px;
                    display: inline-block;
                }
                .passengercount li{
                    cursor: pointer;
                }
                input{
                    height: 15px;
                    font-size: 15px;
                    border: 1px solid #222;
                    border-radius: 8px;
                    color: #222;
                    padding: 10px;
                    margin: 1rem;
                    width: 10rem;
                }
                select{
                    height: 2.5rem;
                    color: #222;
                    font-size: 15px;
                    border: 1px solid #222;
                    border-radius: 8px;
                    padding: 10px;
                    margin: 1rem;
                    width: 10rem;
                }

                .box{
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
    
    
    <%@include file="alert.jsp"%>


    <div class="container">
    <c:set var="numPassengers" value="${passengers}" />
    <div class="paragraph">
    <p>Number of Passengers: ${passengers}</p></div>

<div class="box">
    <div class="passengercount">
        <ul>
            <c:forEach var="i" begin="1" end="${passengers}">
                <li id="passenger${i}" onclick="showPassengerForm(${i});">Passenger ${i}</li>
            </c:forEach>
        </ul>
    </div>

    <form action="contact-info" method="POST">
        <c:forEach var="i" begin="1" end="${passengers}">
            <div id="passengerForm${i}" style="display: none;">
                <input type="text" name="firstname${i}" placeholder="First Name" required>
                <input type="text" name="lastname${i}" placeholder="Last Name" required>
                <input type="date" name="dob${i}" placeholder="Date of Birth" required>
                <select name="gender${i}" required>
                    <option value="0">Gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </select>
                <input type="hidden" name="numPassengers" value="${passengers}">
                <button type="button" class="btn" onclick="validateAndMove(${i});">Next</button>
            </div>
        </c:forEach>
        <button id="submitButton" class="btn" style="display: none;">Contact Info</button>
    </form>
    </div>
    </div>
        
        <script>
        var numPassengers = ${passengers};
    document.getElementById("passengerForm1").style.display = "block";
    
    function validateAndMove(passengerNumber) {
        var form = document.getElementById("passengerForm" + passengerNumber);

        // Check if all required fields in the current form are filled
        var inputs = form.querySelectorAll('input[required], select[required]');
        var isValid = true;

        for (var i = 0; i < inputs.length; i++) {
            if (!inputs[i].value) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            markPassengerComplete(passengerNumber);
        } else {
            alert("Please fill in all details for Passenger " + passengerNumber + " before moving to the next.");
        }
    }

        function showPassengerForm(passengerNumber) {
            // Hide all forms
            for (var i = 1; i <= numPassengers; i++) {
                document.getElementById("passengerForm" + i).style.display = "none";
            }
            
            // Show the selected form
            document.getElementById("passengerForm" + passengerNumber).style.display = "block";
        }

        function markPassengerComplete(passengerNumber) {
            // Logic to mark passenger as complete in the list
            // For example, change the color of the list item
            document.getElementById("passengerForm" + passengerNumber).style.color = "green";
            
            // Move to the next passenger if available
            var nextPassenger = passengerNumber + 1;
            if (nextPassenger <= numPassengers) {
                showPassengerForm(nextPassenger);
            } else {
                // All passengers are complete, change the button to Submit
                document.getElementById("submitButton").style.display = "block";
            }
        }
    </script>
    </body>
</html>
