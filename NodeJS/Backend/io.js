/* console.log("start")
setTimeout(() => console.log("timeout 1"), 2000)
setTimeout(() => console.log("timeout 2"), 0)
console.log("end") */

// OS Module
const os = require("os")

// For how long the server is running
console.log(os.uptime())

// What is the OS of the server
console.log(os.type())

console.log(os.release())
console.log(os.totalmem())
console.log(os.freemem())
console.log(__dirname)
console.log(__filename)

// Path Module
const path = require("path")

// Move to a particular file path
const filepath = path.join("/modules", "httpServer.js")
console.log(filepath)

const abspath = path.resolve(__dirname, "httpServer.js")
console.log(abspath)