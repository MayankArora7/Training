const fs = require("fs")

const readerPointer = fs.createReadStream("./data/sample2.txt")
let data = ""

// Reading: 3 events to be created -> data, end, err
/* readerPointer.on("data", (chunk) => {
    console.log("Chunk", chunk)
    data += chunk
})

readerPointer.on("end", (chunk) => {
    console.log(data)
})

readerPointer.on("err", (err) => {
    console.log(err)
}) */

// Writing: 2 events to be created -> finish, error 
const writePointer = fs.createWriteStream("./data/writefile.txt")
writePointer.write("create data", 'utf-8')

// Closing the pointer
writePointer.end()

writePointer.on("finish", () => {
    console.log("finish")
})

writePointer.on("error", (err) => {
    console.log(err)
})