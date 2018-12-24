window.onload = () => {

}
sleep = (ms) => {
    return new Promise(resolve => setTimeout(resolve, ms));
}

f3 = async () => {
    return new Promise(async res => {
        console.log("f3 is working");
        await sleep(2000);
        res();
    }, rej => {
        console.log(rej);
        rej();
    }).then(() => {
        console.log("finished working in funktion");
    }).catch((er) => {
        console.log("fail");
        console.log(er);
    })
}
f4 = async () => {
    return new Promise((res, rej) => {
        try {
            res("execution f4 succes");

        } catch (er) {
            rej(Error("f4 broke"));

        }
    })
}

f3()
    .then(() => {
        console.log("finished function call");
        return new Promise(res => {
                    console.log("work after f3 is finished");
                    sleep(2000);
                },
                rej => {
                    console.log("faild")
                })
            .then(() => {
                console.log("finished working after f3 funktion call");
            })
            .catch((er) => {
                consosle.log(Error("funktion f3 broke"));
            });
    })
    .catch((er) => {
        console.log(er);
    })
f4()
    .then((res) => {
        console.log("stuff happend f4");

    })
    .catch((er) => {
        console.log(er);
    });