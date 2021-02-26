const HOURHAND = document.querySelector("#hour");               //  these target the ids for each of the arms on the clock
const MINUTEHAND = document.querySelector("#minute");
const SECONDHAND = document.querySelector("#second");

    //  get the hr, min, and sec from the Date variable date
    var date = new Date();
    let hr = date.getHours();
    let min = date.getMinutes();
    let sec = date.getSeconds();
    console.log("hr: " + hr + " min: " + min + " sec: " + sec);

    let hrPosition = hr * 360 / 12 + (min * (360 / 60) / 12);       //  divide by 12 bc the clock is 12 hrs. add the min time to keep it smooth
    let minPosition = (min * 360 / 60) + (sec * (360 / 60) / 60);   //  adding the sec*360/60/60 ensures that the min hand moves smoothly with the sec hand
    let secPosition = sec * 360 / 60;                               //  360 is how many degrees is in the circle.  60 is how many sec are in min

function runTheClock()
{
    hrPosition = hrPosition + (3 / 360)         //  add the equivalent of 1 sec to each of these, since we will be 1 sec behind bc date is not in function
    minPosition = minPosition + (6 / 60)        //  this fits the weird "return to zero" animation
    secPosition = secPosition + 6;

    HOURHAND.style.transform = "rotate(" + hrPosition + "deg)";
    MINUTEHAND.style.transform = "rotate(" + minPosition + "deg)";
    SECONDHAND.style.transform = "rotate(" + secPosition + "deg)";
}


var interval = setInterval(runTheClock, 1000);                      //  this will call the runTheClock() every 1000 milliseconds (1 sec).  So it continuously updates.
