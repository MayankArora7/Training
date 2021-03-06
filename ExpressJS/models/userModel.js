const express = require("express")
const app = express()
const mongoose = require("mongoose")

mongoose.connect("mongodb+srv://mayank:TTTr582amBtMCnY@cluster0.ezgqm.mongodb.net/myFirstDatabase?retryWrites=true&w=majority", {useNewUrlParser: true, useUnifiedTopology: true})

/* Creating the model and schema*/
// const User = mongoose.model("Publications", {
//     author: String,
//     password: String,
//     userName: String
// })

/* Creating the actual data */
// const user1 = new User({
//     author: "AuthorABC",
//     password: "pass123",
//     userName: "testAuthor"
// })

/* Save to the model */
// user1.save().then(() => console.log("User added successfully"))

/* Giving multiple properties */
// const User = mongoose.model("Publications", {
const User = mongoose.model("Customer", {
    email: {
        type: String,
        unique: true,
        required: [true, "Email is required"]
    },
    password: {
        type:String,
        required:[true,"Enter Password"],
    },
    mobile: {
        type: Number,
        required: [true, "Mobile number is required"],
        minlength: 10,
        maxlength: 10
    },
    country: {
        type: String,
        /* Default Value */
        // default: "IND"
        required: true
    },
    /* If we don't want to give any validations or properties we can give like this */
    area: String,
    pincode: {
        type: Number,
        required: true
    },
    address: String
    // userName: {
    //     type: String,
    //     /* "Please enter..." is the custom error message */
    //     minlength: [5, "Please enter atleast 5 characters"],
    //     maxlength: 15
    // },
    // interest: {
    //     /* [String] means array of string */
    //     type: [String],
    //     /* enum will check for the given data (react, node, express) in incoming data, so we 
    //     can only put react, node or express in interset i.e., it restricts the input values */
    //     enum: ["react", "node", "express"],
    //     required: true
    // }
})

// const user1 = new User({
//     email: "test123@gmail.com",
//     userName: "test12",
//     interest: ["react"]
// })

// user1.save().then(() => console.log("User added successfully"))

/* We don't need '{ }' in Express */
module.exports = User