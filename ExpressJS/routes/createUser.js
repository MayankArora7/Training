const express = require("express")
const router = express.Router()
const User = require("../models/userModel")
const logger = require("../middleware/logger")

/*  Hashing the password for security*/
const bcrypt=require("bcrypt")

// router.post("/signup", logger, (req, res) => {

/* aysnc and await. Also use try catch with this*/
router.post("/signup", logger, async(req, res) => {
    const data = req.body
    console.log(data)

    /* Stroring hashed password to data.password so that we can send it to DB */
    data.password = await bcrypt.hash(data.password, 7)
    try {
        const user1 = new User({
            email: data.email,
            password: data.password,
            mobile: data.mobile,
            area: data.area,
            pincode: data.pincode,
            country: data.country,
            address: data.area + " " + data.pincode + " " + data.country
        })

        // user1.save().then(() => res.send("User Added"))
    
        /* Error Handling */
        // user1.save((err, data) => {
        //     if(err) {
        //         console.log(err)
        //         res.send("Error Occurred")
    
        //         /* It will send an error object. It will have an error code and some other properties*/
        //         // res.send(err)
        //     }
        //     else {
        //         res.send("User Added")
        //     }
        // })
    
        await user1.save().then(() => res.send("User Added"))
    }
    catch(err) {
        res.send(err)
    }
})

module.exports = router