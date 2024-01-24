const loginBtn = document.getElementById("login-btn");
const signupBtn = document.getElementById("signup-btn");
const loginForm = document.getElementById("login-form");
const signupForm = document.getElementById("signup-form");

loginBtn.addEventListener("click", () => {
  loginForm.style.display = "flex";
  signupForm.style.display = "none";
});

signupBtn.addEventListener("click", () => {
  signupForm.style.display = "flex";
  loginForm.style.display = "none";
});

$(function () {
  // Close feedback alert when close-btn is clicked
  $(".feedback-container .close-btn").click(function () {
    $(this).parent().fadeOut();
  });

  // Automatically close the feedback alert after a certain duration
  setTimeout(function () {
    $(".feedback-container").fadeOut();
  }, 5000); // Adjust the duration (5000ms = 5 seconds in this case)
});
