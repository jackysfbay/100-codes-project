/**
 * Created by Jacky on 2/5/16.
 */

/*

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