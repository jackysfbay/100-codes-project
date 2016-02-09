/**
 * Created by Jacky on 2/5/16.
 */

/*
 Find the smallest integer in the array.

 Given an array of integers your solution should find the smallest integer. For example:
 Given [34, 15, 88, 2] your solution will return 2
 Given [34, -345, -1, 100] your solution will return -345

 You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
window.onload = function () {


    function findSmallestInt(args) {

        if (args.length <= 0 || args == null) {
            return args;
        }
        //var list = [];
        for (var i = 0; i < args.length - 1; i++) {
            var temp = 0;
            for (var j = i + 1; j < args.length; j++) {
                if (args[i] > args[j]) {
                    temp = args[j];
                    args[j] =args[i];
                    args[i] = temp;
                }
            }
        }
        return args[0];
    }


    alert(findSmallestInt([78, 56, 232, 12, 8]))

}