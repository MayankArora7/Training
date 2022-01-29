const loggerMw = (req, res, next) => {
    /* Middleware */
    console.log(req.method)
    console.log(req.url)
    console.log(new Date().toDateString())
    /* Once it is executed sucessfully it will move to response */
    next()
}

module.exports = loggerMw