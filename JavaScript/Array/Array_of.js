/**
 * Created by Jacky on 2/9/16.
 */

/*
 The Array.isArray() method returns true if an object is an array, false if it is not.

 SyntaxEDIT
 Array.isArray(obj)
 */





window.onload= function () {

    // All following calls return true;

    Array.isArray([]);
    Array.isArray([1]);
    Array.isArray(new Array());
    Array.isArray(Array.prototype); // prototype is an arry type

    // All following calls return false;

    Array.isArray();
    Array.isArray({});
    Array.isArray(null);
    Array.isArray(undefined);
    Array.isArray(17);
    Array.isArray('Array');
    Array.isArray(true);
    Array.isArray(false);

}