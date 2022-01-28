/* Write a function filterRange(arr, a, b) that gets an array arr, looks for elements with
values higher or equal to a and lower or equal to b and return a result as an array.
The function should not modify the array. It should return the new array.
For instance:
let arr = [5, 3, 8, 1];
let filtered = filterRange(arr, 1, 4);
alert( filtered ); // 3,1 (matching values)
alert( arr ); // 5,3,8,1 (not modified) */

/* const filterRange = (arr, a, b) => {
    const newArr = []
    arr.map((i) => {
        if(arr[i] >= a || arr[i] <= b) {
            newArr[newArr.length] = arr[i]
        }
    })
    return newArr
} */

const filterRange = (arr, a, b ) => {
    var newArr = arr.filter((item) => item >= a && item <= b)
    return newArr
}

let arr = [5, 3, 8, 1]
let filtered = filterRange(arr, 1, 4)
alert(filtered)
alert(arr)