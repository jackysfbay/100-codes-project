/**
 * Created by Jacky on 2/9/16.
 */

/*
 The concat() method returns a new array comprised of the array on
 which it is called joined with the array(s) and/or value(s) provided as arguments.

 SyntaxEDIT
 var new_array = old_array.concat(value1[, value2[, ...[, valueN]]])


 */


window.onload = function () {
    var list1 = [1, 2, 3, 4, 5];

    var list2 = ['a', 'b'];

    var list3 = [true, false]

    var newList = list1.concat(list2, list3)

    // [].concat.call( ['a', 'b', 'c'], [1,2,3]);
    //Result: ["a", "b", "c", 1, 2, 3]


    //Array.prototype.concat.call([1, 2, 3], [4, 5, 6], [7, 8, 9]);
    // Result: [1, 2, 3, 4, 5, 6, 7, 8, 9]

    alert(newList)  // return [1,2,3,4,5,a,b,true,false]
}