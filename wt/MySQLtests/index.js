const express = require("express");
const app = express();
const mySQL = require("mysql");
const bp = require("body-parser");
const Port = 8887;
var path = require('path');

CreateTables = () =>{
    const createUsersTableSQL = "CREATE TABLE users (username VARCHAR(30) PRIMARY KEY, Name VARCHAR(30), Vorname VARCHAR(30), Password VARCHAR(30));";
    db.query(createUsersTableSQL,(err)=>{
        if(err){
            console.log(err.message);
        }
        console.log("create user table succes");
    });
    
}
/*DropTables = () =>{
    const sql = "DROP TABLE users;";
    db.query(sql).then(()=>{
        console.log("tables there deleted");
    }).catch((err) =>{
        console.log(err.message);
    });
}
*/
//window.onload = () => {
//    document.getElementById(createTablesBtn).onclick(CreateTables());
//    document.getElementById(dropTablesBtn).onclick(DropTables());
//}


const db = mySQL.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'root',
    database : 'myDB'
});

db.connect((err)=>{
    if(err){
        console.log(err.message);
    }
    console.log("conection to database succes");
   CreateTables();
});
app.get('/',(req, res) =>{
    res.sendFile(path.join(__dirname + '/index.html'));
});
app.listen(Port,()=>{
    console.log("listening on port:" + Port);
});



