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

  // Initial setup on page load
  toggleReturnDateVisibility();

  // Add event listeners to the radio buttons
  oneWayRadio.addEventListener("click", toggleReturnDateVisibility);
  roundTripRadio.addEventListener("click", toggleReturnDateVisibility);
});

var tablinks = document.getElementsByClassName("tab-links");
var tabcontents = document.getElementsByClassName("tab-contents");

function opentab(tabnames, event) {
  for (tablink of tablinks) {
    tablink.classList.remove("active-links");
  }
  for (tabcontent of tabcontents) {
    tabcontent.classList.remove("active-tab");
    tabcontent.style.display = "none"; // hide all forms
  }
  event.currentTarget.classList.add("active-links");
  var selectedTab = document.getElementById(tabnames);
  selectedTab.classList.add("active-tab");
  selectedTab.style.display = "block"; // show the selected form
}

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
