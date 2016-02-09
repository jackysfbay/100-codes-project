/**
 * Created by Jacky on 2/5/16.
 */

/*
 The goal of this exercise is to convert a string to
 a new string where each character in the new string is '(' if that character
 appears only once in the original string, or ')' if that character appears more than once in the original string.
 Ignore capitalization when determining if a character is a duplicate.

 Examples:

 "din" => "((("

 "recede" => "()()()"

 "Success" => ")())())"

 "(( @" => "))(("
 */

///(\d)(?=(\d{3})+$)/g, '$1,'
window.onload = function () {

    var newStr = [];

    function duplicateEncode(str) {
        var newStr=[];
        var str = str.toLowerCase();
        for (var i = 0; i < str.length; i++) {

            if (str.lastIndexOf(str[i]) == str.indexOf(str[i])) {
                newStr.push('(')
            } else {
                newStr.push(')');
            }
        }
        var str1 = newStr.join('');

        return str1
    }


    alert(duplicateEncode('recede'))

}