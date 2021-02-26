const IMAGES = document.querySelectorAll("img");
const SIZES =
{
    showcase: "100vw",
    reason: "(max-width: 799px) 100vw, 372px",       //  media query: as long as width is narrower than 800px the width of img will be 100vw (full-width) otherwise it will be 372px
    feature: "(max-width: 799px) 100vw, 558px",
    story: "(max-width: 799px) 100vw, 670px",
};

function makeSrcset(imgSrc)
{
    let markup = [];
    let width = 400;    //  smallest size of the images\

    for ( let i = 0; i < 5; i++)
        {
            markup[i] = imgSrc + "-" + width + ".jpg " + width + "w";
            width += 400;
        }

    return markup.join();       //  gives a comma-separated list
}

for (let i = 0; i < IMAGES.length; i++)
    {
        let imgSrc = IMAGES[i].getAttribute("src");
        imgSrc = imgSrc.slice(0,-8);  //  strip off the last 8 characters of the imgSrc src
        let srcset = makeSrcset(imgSrc);
        IMAGES[i].setAttribute("srcset",srcset);    //  set srcset to srcset value

        let type = IMAGES[i].getAttribute("data-type");
        let sizes = SIZES[type];    //  shows importance of dot notation vs bracket notation
        IMAGES[i].setAttribute("sizes", sizes);

        
    }