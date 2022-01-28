const fs = require("fs")
const path = require("path")

const filepath = path.join("./data", "specs.json")
// const filepath = path.join("../", "index.html")
// const filepath = path.join("./", "sync.js")
console.log(filepath)

const data1 = fs.readFileSync(filepath, 'utf-8')
const dataJson = data1.toString()
const data = JSON.parse(dataJson)
console.log(data)