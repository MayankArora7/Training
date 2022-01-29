const app = require("express")()
const bodyparser = require("body-parser")
app.use(bodyparser.json())

// const SampleRoutes=require("./routes/sample")
/* localhost:3001/home */
// app.use("/", SampleRoutes)

/* localhost:3001/sample/home */
// app.use("/sample", SampleRoutes)

const signup = require("./routes/createUser")
/* localhost:3001/signup */
/* It will search for routes in createUser.js since we are storing it in "const signup" 
and also we are exporting router in createUser.js */
app.use("/", signup)

/* localhost:3001/findall */
/* localhost:3001/findone */
/* localhost:3001/findbyid */
const find = require("./routes/findUser")
app.use("/", find)

/* localhost:3001/update */
const update = require("./routes/updateUser")
app.use("/", update)

/* localhost:3001/delete */
const deleteUser = require("./routes/deleteUser")
app.use("/", deleteUser)

app.listen(3001, () => console.log("Server started"))
