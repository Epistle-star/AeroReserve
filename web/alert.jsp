<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty feedback}">
  <div class="feedback-container">
    <span class="text">${feedback}</span>
    <i class="fa-solid fa-xmark close-btn"></i>
  </div>
  <c:remove var="feedback" />
  <script src="./Assets/jquery-3.7.0.min.js"></script>
  <script>
    $(document).ready(function () {
      setTimeout(function () {
        $(".feedback-container").fadeOut(500); // 500 milliseconds for the fade-out effect
      }, 10000); // 10000 milliseconds (10 seconds)

      $(".close-btn").on("click", function () {
        $(".feedback-container").fadeOut(500);
      });
    });
  </script>
</c:if>
