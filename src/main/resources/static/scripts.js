'use strict';

function checkPhoneNumber(phoneNumber) {
    let username = document.getElementById('username-error');
    if (phoneNumber.length !== 11) {
        username.innerText = 'Only 11 digits phone number';
        return false;
    }
    if (phoneNumber[0] !== '0' || phoneNumber[1] !== '1') {
        username.innerText = 'Phone number starting with 01';
        return false;
    }
    for (let i = 0; i < phoneNumber.length; ++i) {
        const ch = phoneNumber[i];
        if (ch < '0' || ch > '9') {
            username.innerText = 'Only number allow [0-9]';
            return false;
        }
    }
    username.innerText = '';
    return true;
}

function checkPassword(password, confirmPassword) {
    let pass = document.getElementById('password-error');
    if (password !== confirmPassword) {
        pass.innerText = 'Password not matching';
        return false;
    }
    if (confirmPassword.length < 6) {
        pass.innerText = 'Password length should at least 6 character';
        return false;
    }
    pass.innerText = '';
    return true;
}

function userRegistrationValidation() {
    let form = document.forms['registrationForm'];
    let email = document.getElementById('email-error');
    let username = checkPhoneNumber(form['username'].value);
    let pass = checkPassword(form['password'].value, form['confirmPassword'].value);
    return (username && pass);
}