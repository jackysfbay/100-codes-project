/**
 * Created by Jacky on 2/5/16.
 */

/*

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