const express = require("express")
const router = express.Router()
const User = require("../models/userModel")
const logger = require("../middleware/logger")

/* localhost:3001/findall */
router.get("/findall", async(req, res) => {
    /* This will find everything */
    // const result = await User.find()
    // res.send(result)

    /* This will also find everything but '_id' and 'password' won't be sent in response*/
    /* findAll */
    const result = await User.find({}, {_id: 0, password: 0})
    console.log(result)
    res.send(result)
})

/* localhost:3001/findone */
router.get("/findone", async(req, res) => {
     /* findOne */
    const result = await User.findOne({country: 'IND'}, {_id: 0, password: 0})
    res.send(result)
})

/* localhost:3001/findbyid */
router.get("/findbyid", async(req, res) => {
   /* findById */
   const result = await User.findById({_id: '61f4c876407db8e03db72748'}, {_id: 0, password: 0})
   res.send(result)
})

module.exports = router