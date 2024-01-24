const menuBtn = document.getElementById("menu-btn");
const navLinks = document.getElementById("nav-links");
const menuBtnIcon = menuBtn.querySelector("i");

menuBtn.addEventListener("click", (e) => {
  navLinks.classList.toggle("open");

  const isOpen = navLinks.classList.contains("open");
  menuBtnIcon.setAttribute(
    "class",
    isOpen ? "fa-solid fa-xmark" : "fa-solid fa-bars"
  );
});

function showForm(formId) {
  document.querySelectorAll(".tab-contents").forEach((form) => {
    form.classList.remove("active-tab");
  });

  // Show the selected form
  document.getElementById(formId).classList.add("active-tab");
}


navLinks.addEventListener("click", (e) => {
  navLinks.classList.remove("open");
  menuBtnIcon.setAttribute("class", "fa-solid fa-xmark");
});

const bookingType = document.getElementById("booking-type");

bookingType.addEventListener("click", (e) => {
  Array.from(bookingType.getElementsByTagName("div")).forEach((item) => {
    item.classList.remove("active");
  });

  e.target.classList.add("active");
});

document.addEventListener("DOMContentLoaded", function () {
  var roundTripRadio = document.getElementById("round-trip");
  var oneWayRadio = document.getElementById("one-way");
  var returnDateField = document.getElementById("returndatefield");

  function toggleReturnDateVisibility() {
    if (oneWayRadio.checked) {
      returnDateField.style.display = "none";
    } else {
      returnDateField.style.display = "block";
    }
  }

  toggleReturnDateVisibility();

  // Add event listeners to the radio buttons
  oneWayRadio.addEventListener("click", toggleReturnDateVisibility);
  roundTripRadio.addEventListener("click", toggleReturnDateVisibility);
});

function updateArrivalLocations() {
  var departureDropdown = document.getElementById("departurelocation");
  var arrivalDropdown = document.getElementById("arrivallocation");

  // Clear existing options in the arrival dropdown
  arrivalDropdown.innerHTML = '<option value="To">To</option>';

  // Get the selected value from the departure dropdown
  var selectedDeparture = departureDropdown.value;

  // Add options to the arrival dropdown based on the selected departure
  if (selectedDeparture !== "From") {
    var arrivalOptions = ["Rivers", "Lagos", "Owerri", "Abuja"];
    arrivalOptions.forEach(function (option) {
      if (option !== selectedDeparture) {
        var optionElement = document.createElement("option");
        optionElement.value = option;
        optionElement.textContent = option;
        arrivalDropdown.appendChild(optionElement);
      }
    });
  }
}

var swiper = new Swiper(".swiper", {
  loop: true,
  slidesPerview: 3,
  spaceBetween: 10,
  breakpoints: {
    0: {
      slidesPerview: 1,
      autoplay: {
        delay: 700,
        disableOnInteraction: false,
      },
    },
    700: {
      slidesPerview: 2,
    },
    1020: {
      slidesPerview: 3,
    },
  },
});

//const swiper = new Swiper(".swiper", {
//  slidesPerview: "auto",
//  spaceBetween: 20,
//});
