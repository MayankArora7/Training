const app = require("express")()
const path = require("path")
const fs = require("fs")
const os = require("os")

const filepath = path.join("./data/logData.txt")

const logger = (req, res, next) => {
    const loggerData = [{methodName: req.method, urlVisited: req.url, dateVisitied: new Date().toDateString()}]
    fs.appendFileSync(filepath, JSON.stringify(loggerData, null, 2) + os.EOL)
    next()
}

app.get("/home", logger, (req, res) => {
    res.status(200).send("Home Page")
})

app.get("/products/productsearch", logger, (req, res) => {
    res.status(200).send("Two Level")
})

app.get("/products", logger, (req, res) => {
    res.status(200).send("Products Page")
})

app.all("*", (req, res) => {
    res.status(404).send("404 Not Found")
})

app.listen(3001, () => {
    console.log("Server Started")
})
