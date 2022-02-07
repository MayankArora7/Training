const express = require("express")
const router = express.Router()
const User = require("../models/userModel")
const logger = require("../middleware/logger")
const bcrypt=require("bcrypt")
const jwt = require("jsonwebtoken")

router.post("/signin", async(req, res) => {
    try {
        const data = req.body
        const user = await User.findOne({email: data.email})
        console.log(user.password)

        /* data.password -> Plain text password, user.password -> Hased password*/
        const authenticate = await bcrypt.compare(data.password, user.password)
        console.log(authenticate)
        if(authenticate) {
            /* JWT */
            /* user.email is the payload in the token. We can give anything but since emails are unique
            it will generate unique token. "jamesbond" is the secret key. Again we can give anything but
            try to give it as difficult and long as possible so that no one can guess it*/
            const token = jwt.sign({email: user.email}, "jamesbond")
            console.log(token)
            
            const signinInfo = {
                msg: "Successfuly Signed In",
                jwttoken: token
            }

            res.send(signinInfo)

            /*  Password compare check */
            // res.send("Signed in Successfully")
        }
        else {
            res.send("Incorrect Password")
        }
    }
    catch(err) {
        res.send(err)
    }
})

module.exports = router