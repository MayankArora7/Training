const express = require("express")
const app = express()

/* Setting the view engine */
app.set("view engine", "hbs")

/* View engine will search for a file named "home.hbs" (since our view engine is hbs) 
in a folder named 'views. Also we have to provide the same name in 'res.render()' that
we want to render */
app.get("/home", (req, res) => {
    res.render("home", {username: "Peter"})
})

app.listen(3001, () => {
    console.log("Server Started")
})