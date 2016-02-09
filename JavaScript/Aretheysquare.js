/**
 * Created by Jacky on 2/5/16.
 */

/*
 Write a function that checks whether all elements in an array are square numbers.
 The function should be able to take any number of array elements.

 Your function should return true if all elements in the array are square numbers and false if not.

 An empty array should return undefined. You can assume that all array elements will be positive integers.

 Examples:

 isSquare([1, 4, 9, 16]);
 //returns true

 isSquare([3, 4, 7, 9]);
 //returns false

 isSquare([]);
 //returns undefined

 */

///(\d)(?=(\d{3})+$)/g, '$1,'
window.onload = function () {

    var isSquare = function (arr) {

        if(arr.length <=0 || arr ==null){
            return undefined;
        }

        //Your code here
        var count = 0;
        for (var i = 0; i < arr.length; i++) {
            var s = Math.sqrt(arr[i]);

            if (Number.isInteger(s) == true) {
                count++;
            }
        }
        if (count == arr.length) {

            return true;
        } else {
            return false;
        }
    }
    alert(isSquare([1, 2, 3, 4, 5, 6]))

}