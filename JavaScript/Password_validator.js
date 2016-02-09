/**
 * Created by Jacky on 2/5/16.
 */

/*
 Description

 Your job is to create a simple password validation function, as seen on many websites.
 The rules for a valid password are as follows:

 There needs to be at least 1 uppercase letter.
 There needs to be at least 1 lowercase letter.
 There needs to be at least 1 number.
 The password needs to be at least 8 characters long.
 You are permitted to use any methods to validate the password.
 */

window.onload = function () {


    function validPhoneNumber(str) {

       return str.length >=8 &&//8 characters long.
           /[a-z]/.test(str) &&//lowercase letter
           /[A-Z]/.test(str) &&// 1 uppercase letter.
           /\d/.test(str)//1 number
    }

    alert(str("Abcd1234"))


}

