const express = require("express")
const router = express.Router()
const User = require("../models/userModel")
const logger = require("../middleware/logger")

/* localhost:3001/update */
router.post("/update", async(req, res) => {
    try {
        const data = req.body
        /* In Postman when passing the data we have to pass the password as updatedPassword since we have written
        data.updatedPassword i.e., "updatedPassword": "newpass" and similarly for everything else. Here if we provide 
        the email it will be updated otherwise it will remain the same */
        const result = await User.findByIdAndUpdate(data._id, {email: data.updatedEmail, password: data.updatedPassword})
        console.log(result)

        res.send("Update Successful")
    }
    catch(err) {
        res.send(err)
    }
})

module.exports = router