const fs = require("fs")
const path = require("path")

const filepath = path.join("./data", "sample1.txt")
console.log(filepath)
// const data = fs.readFileSync("./modules/httpServer.js", 'utf-8') -> This also works
const data = fs.readFileSync(filepath, 'utf-8')
console.log(data)

// Writing data to file
// It will also create a new file if it is not present.
fs.writeFileSync("./data/sample2.txt", "new content")