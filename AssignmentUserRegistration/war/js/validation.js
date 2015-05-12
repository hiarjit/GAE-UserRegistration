function ValidateEmail(email) {
	if (email == null) {
		email = document.getElementById('txtEmail');
	}
	if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email.value)) {
		return (true)
	}
	email.focus();
	alert("You have entered an invalid email address!")
	return (false)
}

function allnumeric(inputText) {
	if (inputText == null) {
		inputText = document.getElementById('txtPhoneNo');
	}
	var numbers = /^[0-9]+$/;
	if (inputText.value.match(numbers)) {
		return true;
	} else {
		inputText.focus();
		alert('Invalid Phone Num');
		return false;
	}
}