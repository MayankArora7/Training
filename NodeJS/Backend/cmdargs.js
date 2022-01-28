const { add } = require("./modules/add")
// const _ = require("lodash")
const yargs = require("yargs")

const argv = yargs.argv
const command = argv._[1]
// console.log(typeof command)
console.log(add(argv._[0], argv._[1]))