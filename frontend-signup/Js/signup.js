function restcall() {
    let userRequest = {
        name: document.getElementById("nameField").value,
        email: document.getElementById("emailField").value,
        password: document.getElementById("passwordField").value, // Use a separate field for the password
        phone: document.getElementById("phoneField").value,
        address: document.getElementById("addressField").value,
        city: document.getElementById("cityField").value,
        state: document.getElementById("stateField").value,
        pincode: document.getElementById("pincodeField").value
    };

    let httpRequest = new XMLHttpRequest();
    httpRequest.open("POST", 'http://localhost:8081/signup/add-details');

    // Set the Content-Type header to indicate JSON data
    httpRequest.setRequestHeader("Content-Type", "application/json");

    httpRequest.onload = function () {
        if (httpRequest.status === 201) {
            // Successful response
            const userResponse = JSON.parse(httpRequest.responseText);
            // Handle the userResponse object as needed
            console.log("Received UserResponse:", userResponse);
            
            // Display the response in an alert
            alert("Response from the server:\n" + JSON.stringify(userResponse, null, 2));
            
            window.location.reload();
        } else {
            // Handle errors here
            console.error("Request failed with status: " + httpRequest.status);
            alert("An error occurred. Please check the console for details.");
        }
    };

    httpRequest.onerror = function () {
        console.error("Network error occurred.");
        alert("A network error occurred. Please check the console for details.");
    };

    // Send the JSON data in the request body
    httpRequest.send(JSON.stringify(userRequest));

    console.log("Request sent.");
}
