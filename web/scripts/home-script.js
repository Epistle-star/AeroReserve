let navBar = document.querySelector(".navbar");
let faBars = document.querySelector(".bars");

faBars.onclick = () => {
  navBar.classList.toggle("active");
};

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
function opentab(tabnames) {
  for (tablink of tablinks) {
    tablink.classList.remove("active-links");
  }
  for (tabcontent of tabcontents) {
    tabcontent.classList.remove("active-tab");
  }
  event.currentTarget.classList.add("active-links");
  document.getElementById(tabnames).classList.add("active-tab");
}
