const buff = new Buffer.alloc(50)

// Write
buff.write("buffer data")

// Read
console.log(buff.toString())

// 2nd method
const buff2 = Buffer.from("new data", "utf-8")
console.log(buff2)
console.log(buff2.toString())

// Copying
const buff3 = new Buffer.alloc(50)
const buff4 = new Buffer.alloc(50)
buff3.write("QWERTY")
// buff3 will be copied to buff4
buff3.copy(buff4)
console.log(`buff3: ${buff3.toString()}, buff4: ${buff4.toString()}`)

// Slicing
buffSliced = buff3.slice(2, 5)
console.log(buffSliced.toString())

// Converting to JSON
const buffData = ["Mayank", "Arora", 21]

buff5 = Buffer.from(JSON.stringify(buffData))
const buffJson = buff5.toJSON();
console.log(buffJson)