const { addTask, readTask, deleteTask } = require("./modules/taskTrackerOperations")
const yargs = require("yargs")

const argv = yargs.argv
const command = argv._[0]

if(command == 'add') {
    const title = argv._[1]
    const deadline = argv._[2]

    const task = {
        title: title,
        deadline: deadline
    }

        addTask(task)
}
else if(command == 'read') {
    const task = readTask()

    if(Object.keys(task).length == 0) {
        console.log("No tasks pending")
    }
    else {
        task.forEach((element) => {
            console.log(element)
        })
    }
}
else if(command == 'delete') {
    const title = argv._[1]

    deleteTask(title)
}