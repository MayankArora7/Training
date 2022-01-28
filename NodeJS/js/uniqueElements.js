/* Let arr be an array.
Create a function unique_elements(arr) that should return an array with unique items
of arr.
For instance:
function unique_elements(arr) {
//  your code 
}
let strings = ["React Js", "JavaScript", "React Js", "JavaScript",
"JavaScript", "JavaScript", "React Js", "React Js"
];
alert( unique(strings) ); // React Js, JavaScript */

const uniqueElements = (arr) => {
    return new Set(arr)
}

let strings = ["React Js", "JavaScript", "React Js", "JavaScript", 
"JavaScript", "JavaScript", "React Js", "React Js"
];

let unique = uniqueElements(strings)
alert(Array.from(unique))