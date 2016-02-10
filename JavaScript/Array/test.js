/**
 * Created by Jacky on 2/9/16.
 */

/*
 The forEach() method executes a provided function once per array element.

 [].forEach(function(value, index, array) {
    // ...
 });

value ->  the element value
index -> the element index
array -> the array being traversed

 */





window.onload= function () {

    //[1, 2 ,3, 4].forEach(alert);

    var sum =0 ;

    [1,2,3,4].forEach(function(value, index, array){

        if(array[index] == value){
            sum +=value;
        }
    })
    alert(sum) //10
}