const fs = require("fs")
const path = require("path")

const filepath1 = path.join("./data", "sample1.txt")
const filepath2 = path.join("./data", "sample2.txt")

const dataFromFile1 = fs.readFileSync(filepath1, 'utf-8')
const dataFromFile2 = fs.readFileSync(filepath2, 'utf-8')

fs.writeFileSync("./data/merge.txt", dataFromFile1)
fs.appendFileSync("./data/merge.txt", dataFromFile2)