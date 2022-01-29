const express = require("express")
const router = express.Router()

/* Router will hide your implemetation. index.js or any file will take the implementation from here */
router.get("/home/products", (req, res) => {
    console.log(req.query)
    const querydata = req.query
    if(querydata.prname) {
        res.send("Products fetched")
    }
     res.send("Products")
})
router.get("/home", (req, res) => {
    res.status(200).send("Home")
})

module.exports = router