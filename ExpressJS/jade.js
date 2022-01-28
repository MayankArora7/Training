/* Dynamic HTML Rendering */

const express = require("express")
const app = express()

/* Model -> Database 
View -> Presentation Layer (HTML etc.)
Controller -> Express Application */

/* Setting the view engine */
app.set("view engine", "jade")

/* View engine will search for a file named "index.jade" (since our view engine is jade) 
in a folder named 'views. Also we have to provide the same name in 'res.render()' that
we want to render */
app.get("/index", (req, res) => {
    res.render("index", {heading: "Index Page"})
})

app.listen(3001, () => {
    console.log("Server Started")
})