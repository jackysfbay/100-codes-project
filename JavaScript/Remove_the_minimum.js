/**
 * Created by Jacky on 2/5/16.
 */

/*
 Task

 Given an array of integers, remove the smallest value. If there are multiple elements with the same value, remove the one with a lower index. If you get an empty array/list, return an empty array/list.

 Don't change the order of the elements that are left.

 Examples

 removeSmallest([1,2,3,4,5]) = [2,3,4,5]
 removeSmallest([5,3,2,1,4]) = [5,3,2,4]
 removeSmallest([2,2,1,2,1]) = [2,2,2,1]
 */

///(\d)(?=(\d{3})+$)/g, '$1,'
window.onload = function () {

    function removeSmallest(numbers) {
        //throw "TODO: removeSmallest";
        var list = [];
        if (numbers.length <= 1 || numbers == null) {
            return [];
        }

        var min = Math.min.apply(null, numbers);
        numbers.splice(numbers.indexOf(min),1)

        return numbers
    }


    alert(removeSmallest([9, 4, 2, 3,1, 1]))
    //alert(Math.min.apply(null, [9, 4, 2, 3,1]))
}