const fs = require("fs")

// Async Reading
/* fs.readFile("./data/sample1.txt", "utf-8", (err, data) => {
    if(err) {
        console.log(err)
    }
    // setTimeout is async so if we use it with readFileSync it will give same result
    // but async reading and writing will mae a difference when working with APIs
    setTimeout(() => console.log(data), 2000)
})

fs.readFile("./data/sample2.txt", "utf-8", (err, data) => {
    if(err) {
        console.log(err)
    }
    console.log(data)
}) */

// Async Writing
const data = "Read and write using sync and async"
fs.writeFile("./data/writeAsync.txt", data, (err, result) => {
    if(err) {
        // it will give the error code since error is an array
        console.log(err.code)
    }
    // console.log(result)
})