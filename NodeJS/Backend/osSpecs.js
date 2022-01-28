const os = require("os")
const fs = require("fs")
const path = require("path")

const filepath = path.join("./data", "Specs.json")

let specs = [{
    "uptime": os.uptime(),
    "type": os.type(),
    "release": os.release(),
    "totalMemory": os.totalmem(),
    "freeMemory": os.freemem(),
    "architecture": os.arch(),
    // "network": os.networkInterfaces(),
    "platform": os.platform(),
    "hostname": os.hostname(),
    "version": os.version()
}]

specsJson = JSON.stringify(specs, null, 2)
fs.writeFileSync(filepath, specsJson)