/* console.log("test")
const a = 12.23
let b = 'String'
let prno = "23"
console.log(a)
console.log(typeof b)
console.log(b)

const res = String(a)
console.log(res)
console.log(typeof res) */

// Arrays
// Arrays are heterogeneous in JS
let arr = [20,30,"output",true]
console.log(arr[0])

// JavaScript Objects
let obj = [
    {
        prname:"XYZ",
        prprice:20,
        license:"license MIT"
    },
    {
        prname:"abc",
        prprice:21,
        license:"license MIT 1.0"
    },
    {
        prname:"ABC",
        prprice:22,
        license:"license MIT 2.0"
    }
]

// Iterating without using loops
obj.map((i) => {
    if(i.license != "license MIT 2.0"){
        console.log(i.prname)
    }
})