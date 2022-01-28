/* const age = 23
const healthCondition = true

// '===' checks for datatype as well. e.g., const age="23", if(age==23)
// then '==' will give it true and '===' will give false because age
// is a string and in if condition it is a number. 
if(age >= 18 && healthCondition === true) {
    console.log("Executed")
}
else {
    console.log("Not Executed")
} */

// Common JS convention to export
const test3 = (fname, memID) => {
    console.log(`Username: ${fname}, memberID: ${memID}`)
}

const test2 = () => {
    console.log("secret")
}

module.exports = {test3}

console.log(module.exports)