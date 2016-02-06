/**
 * Created by Jacky on 2/5/16.
 */

/*
 Some people really wonder why JavaScript arrays don't have a remove function to remove an element.

 Go ahead and make one.

 var someArray = [1, 2, 3];
 someArray.remove(1);
 This should remove the element on index 1 making someArray = [1, 3]

 Note: You need to handle invalid input.
 */


window.onload = function () {


    Array.prototype.remove = function(index){

        if((isNaN(index))||index<0){
            return false;
        }

        return this.splice(index,1);
    }

    var list =[1,2,3]
    alert( list.remove(0))

}