'use strict';

function checkPhoneNumber(phoneNumber) {
    let phone = document.getElementById('phone-registration-error');
    if (phoneNumber.length !== 11) {
        phone.innerText = 'Only 11 digits phone number';
        return false;
    }
    if (phoneNumber[0] !== '0' || phoneNumber[1] !== '1') {
        phone.innerText = 'Phone number starting with 01';
        return false;
    }
    for (let i = 0; i < phoneNumber.length; ++i) {
        const ch = phoneNumber[i];
        if (ch < '0' || ch > '9') {
            phone.innerText = 'Only number allow [0-9]';
            return false;
        }
    }
    phone.innerText = '';
    return true;
}

function checkPassword(password, confirmPassword) {
    let pass = document.getElementById('password-registration-error');
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
    let phone = checkPhoneNumber(form['phone'].value);
    let pass = checkPassword(form['password'].value, form['confirmPassword'].value);
    return (phone && pass);
}

function loginFormValidation() {
    let form = document.forms['loginForm'];
    return checkPhoneNumber(form['username'].value);
}

function areaRegistrationValidation() {
    return true;
}

function cityRegistrationValidation() {
    return true;
}