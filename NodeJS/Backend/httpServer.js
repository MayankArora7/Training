/* const http = require("http")

// 3000 is the port number
http.createServer((req, res) => {
    console.log(req)

    // Sending back the response otherwise the server will keep loading.
    res.write("<h1>Request Received</h1>")

    // This will stop the page from loading after we have sent a response.
    res.end()
}).listen(3000) */

const http = require("http")
const url = require("url")

const app = http.createServer((req, res) => {
    const queryData = url.parse(req.url, true)

    /* console.log(queryData.pathname)

    // Write this if res.wtite() is not printing properly
    res.writeHead(200, {"Content-Type": "text/html"})

    // localhost:3000/products
    if(queryData.pathname === "/products") {
        res.write("<h2>Products Page</h2>")
        res.end()
    }
    // localhost:3000/checkout
    else if(queryData.pathname === "/checkout") {
        res.write("<h3>Checkout</h3>")
        res.end()
    } */

    // "query" will have the data that is present after the '?' in the URL
    // We can provide multiple queries separated by '&'
    console.log(queryData.query)

    const search = queryData.query.search
    const price = queryData.query.price
    res.writeHead(200, {"Content-Type": "text/html"})
    
    // localhost:3000/products?search=redmi&price=12000
    // localhost:3000/checkout?search=redmi&price=12000
    // We can write anything in place of products and checkout
    if(search === "redmi" && Number(price) === 12000) {
        res.write("<h2> Redmi Note Pro </h2>")
        res.end()
    }
})

app.listen(3000, () => console.log("Server started in port: 3000"))