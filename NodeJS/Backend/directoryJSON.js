const path = require('path');
const fs = require('fs');

const filepath = path.join(__dirname, 'node_modules');
let fileStructureJson = {}
fileStructureJson.filesDir = []

fs.readdir(filepath, function (err, files) {
    if (err) {
        console.log(err);
    } 
    files.forEach(function (file) {
        fileStructureJson.filesDir.push(file.toString())
    })
    console.log(JSON.stringify(fileStructureJson, null, 2))
})