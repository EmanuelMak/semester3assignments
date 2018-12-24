window.onload = () => {
    console.log('page has been loaded');
    const rurl = "https://api.icndb.com/jokes/random";
    const idurl = "http://api.icndb.com/jokes/";
    const randBtn = document.getElementById('randomJokeBtn');
    const idBtn = document.getElementById("");
    const testBtn = document.getElementById("testBtn");
    let testInput = document.getElementById("testInput").innerHTML;
    printjoke = (s) => {
        console.log(s);
        document.getElementById("joke").innerHTML = s;
    }
    printjoke('hier könnte deine werbung stehen');
    testBtn.addEventListener('click', () => {
        printjoke("test joke" + document.getElementById("testInput").nodeValue);
    });



    fetch(rurl)
        .then((res) => res.json())
        .then((data) => {
            printjoke(data.results);
        });










    randBtn.addEventListener('click', () => {
        fetch(rurl).then((req) => {
            req.json().then((req) => {
                printjoke(req);
            }).catch(() => {
                console.log('failed to load json file');
            });
        }).catch(() => {
            console.log("faild to load content");
        });
    });
};