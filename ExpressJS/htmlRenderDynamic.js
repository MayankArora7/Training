/* Dynamic HTML Rendering */
const express = require("express")
const app = express()

/* Jade */
/* app.set("view engine", "jade")

app.get("/index", (req, res) => {
    res.render("indexpage", {thought: "Search the candle rather than cursing the darkness"})
})

app.listen(3001, () => {
    console.log("Server Started")
}) */

/* HBS */
app.set("view engine", "hbs")

app.get("/home", (req, res) => {
    res.render("homepage", {thought: "Search the candle rather than cursing the darkness"})
})

app.listen(3001, () => {
    console.log("Server Started")
})