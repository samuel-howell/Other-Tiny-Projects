const testWrapper = document.querySelector(".test-wrapper");
const testArea = document.querySelector("#test-area");
const originText = document.querySelector("#origin-text p").innerHTML;
const resetButton = document.querySelector("#reset");
const theTimer = document.querySelector(".timer");

var timer = [0,0,0,0];  //  capture min, sec, hundredth of sec, and thousandth of sec in array
var interval;
var timerRunning = false;

// Add leading zero to numbers 9 or below (purely for aesthetics):
//  helper function
function leadingZero(time)
{
    if (time <= 9)
    {
        time = "0" + time;  //  converts time to a string and adds a zero in front of it.
    }
    return time;
}

// Run a standard minute/second/hundredths timer:
function runTimer()
{
    let currentTime = leadingZero(timer[0]) + ":" + leadingZero(timer[1]) + ":" + leadingZero(timer[2]);
    theTimer.innerHTML = currentTime;
    timer[3]++;

    //  use math to figure out the min, seconds, and hundredth of seconds using the thousands of seconds (timer[3])
    timer[0] = Math.floor(timer[3] / 100 / 60); //  Math.floor so no decimals. 1000th / 100 = seconds / 60 = min
    timer[1] = Math.floor(timer[3] / 100) - (timer[0] * 60);
    timer[2] = Math.floor(timer[3] - (timer[1] * 100) - (timer[0] * 6000)); 
}

// Match the text entered with the provided text on the page:
function spellcheck()
{
    let textEntered = testArea.value;
    let originTextMatch = originText.substring(0, textEntered.length);      //  .substring() turn the string into an array

    if (textEntered == originText)  //  the total text
    {
        clearInterval(interval);
        testWrapper.style.borderColor = "#429890";  //  if the text matches total origin text, set the border color to green
    }
    else
    {
        if (textEntered == originTextMatch) // the text as it is being entered
        {
            testWrapper.style.borderColor = "#65CCf3";      
        }
        else
        {
            testWrapper.style.borderColor = "#E95D0F";      //  set it to orange red if it doesn't match
        }
    }
    console.log(textEntered);
}


// Start the timer:
function start()
{
    let textEnteredLength = testArea.value.length;
    if (textEnteredLength === 0 && !timerRunning)
    {
        timerRunning = true;
        interval = setInterval(runTimer, 10);  //  run every thousandth of a second
    }
}

// Reset everything:
function reset()
{
    clearInterval(interval);
    interval = null;        //  makes sure we aren't setting up a new interval with a new index number and wasting resources.
    timer = [0,0,0,0];
    timerRunning = false;
    
    testArea.value = "";
    theTimer.innerHTML = "00:00:00";
    testWrapper.style.borderColor = "grey";
}

// Event listeners for keyboard input and the reset button:
testArea.addEventListener("keypress", start, false);
testArea.addEventListener("keyup", spellcheck, false);  //  run the function spellcheck when keyup is pressed
resetButton.addEventListener("click", reset, false);