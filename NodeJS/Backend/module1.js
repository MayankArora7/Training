// Common JS convention to import
// Here we need to provide the same name that is the name of the function
// from which we are importing
// e.g., members is the name of the function that we are exporting
// in memberData.js and we use the same name here.
const { members } = require("./data/memberData")
const { test3 } = require("./modules/index")

members.map((item) => test3(item.memberName, item.memberID))