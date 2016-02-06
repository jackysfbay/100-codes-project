/**
 * Created by Jacky on 2/5/16.
 */
/*
 Rules

 You must check if some ticket numbers are valid. To be valid, a ticket number must :

 Contain exactly 6 characters
 Contain : one letter then one digit then 4 letters
 'letter' means a single character, unaccented, uppercase or lowercase, between a and z.

 Input arguments

 tickets : an array of string, representing ticket numbers
 Return value

 An integer representing the number of valid passwords.

 */

window.onload = function () {

    function nbrValidTickets(tickets) {
        var list = [];

        var pattern = /^[a-z]\d[a-z]{4}$/i;
        for (var i = 0; i < tickets.length; i++) {

            if (pattern.test(tickets[i]) == true) {
                list.push(tickets[i]);
            }
        }

        return list.length;
    }

    var ex = ["A9JZOD", "E9FIDH", "SI2JIS", "F8JIODJ", "FDSNJA", "A9POF?", "AA9DIJD"];


    alert(nbrValidTickets(ex));

}