function toggleDarkMode() {
  document.body.classList.toggle("dark-mode");
}

window.onload = () => {
  const bars = document.querySelectorAll(".skill-bar");
  bars.forEach(bar => {
    const width = bar.getAttribute("data-level");
    bar.style.width = width;
  });
};

function validateForm() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const message = document.getElementById("message").value.trim();

  if (!name || !email || !message) {
    alert("Please fill in all fields.");
    return false;
  }

  alert("Message sent successfully!");
  return true;
}
