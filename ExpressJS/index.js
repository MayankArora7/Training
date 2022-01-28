// const app = require("express")()

/* 2nd method */
const express = require("express")
const app = express()

/* body-parser is a middleware */
const bodyparser = require("body-parser")
/* app.use() is used whenever we use middleware 
body-parser is used to view the data when it is transferred using POST method 
Use Postman for transferring data */
app.use(bodyparser.json())

/* Middleware */
const loggerMw = (req, res, next) => {
    /* Middleware */
    console.log(req.method)
    console.log(req.url)
    console.log(new Date().toDateString())
    /* Once it is executed sucessfully it will move to response */
    next()
}

/* 1st argument -> URL, 2nd argument -> middleware, 3rd argument -> arrow function which handles request and response
localhost:3001/home */
app.get("/home", loggerMw, (req, res) => {
    // console.log(req)

    /* Sending back the response
    Here we don't need to use res.end() or res.writeHead() */
    // res.send("Home Page")

    /* Sending JSON response */
    // res.send({prname: "xyz", price: "12000"})

    /* There are 2 ways of handling query data: -
    1. Using query
    2. Using params */

    /* 1. Using Query
    'query' will have the data that is present in the URL after '?'
    It will be as KV pair
    localhost:3001/home?prname=xyz&price=12000 */
    // console.log(req.query)
    // const queryData = req.query
    // if(queryData.prname) {
    //     res.send("Products Page")
    // }

    /* Sending status code */
    res.status(200).send("Home Page")
})

/* We can also give 2 levels of URL
localhost:3001/products/productsearch */
app.get("/products/productsearch", loggerMw, (req, res) => {
    console.log(req)
    res.send("Two Level")
})
/* 2. Using Params 
Here we have a similar URL above: 'products/productsearch' so if we use 'products/:prname' and
type 'products/productsearch' it will consider 'productsearch' as a param (prname) so to avoid 
ambigiuty we use 'product' here */
app.get("product/:prname/:price", loggerMw, (req, res) => {
    console.log(req.params.prname)
    console.log(req.params.price)
    res.send("Products")
})

/* localhost:3001/products 
It is to be written in postman */
app.post("/products", loggerMw, (req, res) => {
    /* This will only show result if we use body-parser otherwise it will show 'undefined' */
    console.log(req.body)
    res.send("Success")
})

app.post("/updatepassword", loggerMw, (req, res) => {
    console.log(req.body)
})

// "*" is for all the pages that don't have a route defined 
app.all("*", (req, res) => {
    res.status(404).send("404 Not Found")
})

/* 3001 is the port number */
app.listen(3001, () => {
    console.log("Server Started")
})