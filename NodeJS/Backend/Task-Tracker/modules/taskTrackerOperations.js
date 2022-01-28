const fs = require("fs")
const path = require("path")

const addTask = (newTask) => {
    const existingTasks = readTask()

    let duplicateTask = false

    existingTasks.forEach((element) => {
        if(element.title == newTask.title) {
            console.log("Connot insert duplicates")
            duplicateTask = true
        }
    })

    if(!duplicateTask) {
        existingTasks.push(newTask)
        fs.writeFileSync("./data/taskTrackerData.json", JSON.stringify(existingTasks, null, 2))
    }
}

const readTask = () => {
    const task = fs.readFileSync("./data/taskTrackerData.json", 'utf-8')
    const taskJson = task.toString()
    
    if(taskJson.length == 0) {
        return []
    }
    else {
        return JSON.parse(taskJson)
    }
}

const deleteTask = (taskToRemove) => {
    const existingTasks = readTask()

    const newTaskJson = existingTasks.filter((task) => {
        if(task.title != taskToRemove) {
            return task
        }
    })
    fs.writeFileSync("./data/taskTrackerData.json", JSON.stringify(newTaskJson, null, 2))
}

module.exports = { addTask, readTask, deleteTask }