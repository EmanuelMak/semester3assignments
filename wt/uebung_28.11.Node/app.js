const express = require("express"); // load the node express module
const bp = require("body-parser");
const app = express(); // create a new express app
const fs = require("fs");
let status;
// let's treat incoming request bodies as text/plain
app.use(bp.text());
// this will catch any incoming request...

app.use((req, res, next) => {
  console.log([req.method, req.hostname, req.ip, req.url, req.headers]);
  console.log(req.query);
  console.log(req.body);
  let toSend = ""; 
  if(req.url === '/self'){
    next();
  }
  else{
  res.status(200).send(toSend);
  }
});
app.get('/self', async(req,res) =>{
  console.log(1);
 const data =  await getFileContent();
  res.send(data);
 
  console.log(4);
})
function getFileContent () {
  
  return new Promise((res,rej)=>{
    fs.readFile('./app.js','utf-8',(err,data)=>{
      if(err){
        rej(err);
      }
      else{
        res(data);
      }
    })
  })
  

}


app.listen(8888, () => console.log("Example app.js listening on port 8888!"));
