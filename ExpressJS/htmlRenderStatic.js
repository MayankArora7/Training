/* Static HTML Rendering */

const path = require("path")
const fs = require("fs")
const app = require("express")()

const filepath1 = path.join(__dirname, "public/index.html")
const filepath2 = path.join(__dirname, "public/products.html")

const data1 = fs.readFileSync(filepath1, 'utf-8')
const data2 = fs.readFileSync(filepath2, 'utf-8')

app.get("/home", (req, res) => {
    res.send(data1)
})

app.get("/products", (req, res) => {
    res.send(data2)
})

app.all("*", (req, res) => {
    res.status(404).send("404 Not Found")
})

app.listen(3001, () => {
    console.log("Server Started")
})