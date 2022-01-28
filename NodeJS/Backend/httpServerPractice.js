const http = require("http")
const url = require("url")

const app = http.createServer((req, res) => {
    const queryData = url.parse(req.url, true)

    console.log(queryData.query)

    /* res.writeHead(200, {"Content-Type": "text/plain"})
    if(queryData.pathname === "/products") {
        res.write("<h2>Products Page</h2>")
        res.end()
    }
    else if(queryData.pathname === "/checkout") {
        res.write("<h3>Checkout</h3>")
        res.end()
    } */
    
    console.log(queryData.query)

    const firstName = queryData.query.fname
    const lastName = queryData.query.lname
    res.writeHead(200, {"Content-Type": "text/html"})

    // localhost:3000/anything?fname=mayank&lname=arora
    if(firstName === "mayank" && lastName === "arora") {
        const data = {
            firstName: "Mayank", 
            lastName: "Arora",
            message: "Hello"
        }
        res.write(JSON.stringify(data))
        res.end()
    }
})

app.listen(3000, () => console.log("Server started in port: 3000"))