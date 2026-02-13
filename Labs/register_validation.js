// Form validation script for registration page
const form = document.getElementById("registrationForm");

form.addEventListener("submit", function (e) {
    e.preventDefault();

    // Clear previous error messages
    document.querySelectorAll(".error-message").forEach(msg => msg.textContent = "");

    let isValid = true;

    // Collect inputs
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();
    const retypePassword = document.getElementById("retype-password").value.trim();

    // Validate name
    if (name === "") {
        document.getElementById("nameError").textContent = "Please enter your name.";
        isValid = false;
    }

    // Validate email
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (email === "") {
        document.getElementById("emailError").textContent = "Email is required.";
        isValid = false;
    } else if (!emailPattern.test(email)) {
        document.getElementById("emailError").textContent = "Please enter a valid email address.";
        isValid = false;
    }

    // Validate password
    if (password.length < 6) {
        document.getElementById("passwordError").textContent = "Password must be at least 6 characters.";
        isValid = false;
    }

    // Validate retype password
    if (retypePassword !== password) {
        document.getElementById("retypeError").textContent = "Passwords do not match.";
        isValid = false;
    }

    // If all inputs valid
    if (isValid) {
        alert("Registration successful!");
        form.reset();
    }
});