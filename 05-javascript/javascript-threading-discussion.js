/*
    EVENT THREADING

    What is a thread?
    -a thread is a line of execution; it's a process.

    What is a sub process?
    -a process created from another process
    -a process that shares a heap with another process.

    What is multithreading?
    -in short, it's when you're running two (or more) processes concurrently
    -asynchronous execution of logic


    What if I told you.....that JavaScript.....is single threaded......
    https://dev.to/lydiahallie/javascript-visualized-event-loop-3dif
*/


console.log("sup");

//after 3000 milliseconds the timedFunc callback functions get put into the event queue
setTimeout(timedFunc, 3000);

//as a developer you shoudl be mindful of how much stuff you put into the stack, if your logic
// will take a while then perhaps consider putting a section of your functionality back into
// the event queue
setTimeout(timedFunc, 0);

console.log("bye");


function timedFunc(){
    console.log("in timed function");
}




