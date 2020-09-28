function change1(){
    document.getElementById("xboxbox").style.backgroundColor = "white";
    document.getElementById("playstationbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("pcbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("xboxbox").style.color = "rgb(61, 61, 61)";
    document.getElementById("playstationbox").style.color = "#f1e724";
    document.getElementById("pcbox").style.color = "#f1e724";
    document.getElementById('myPlatform').value = "Xbox"
}

function change2(){
    document.getElementById("xboxbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("playstationbox").style.backgroundColor = "white";
    document.getElementById("pcbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("playstationbox").style.color = "rgb(61, 61, 61)";
    document.getElementById("pcbox").style.color = "#f1e724";
    document.getElementById("xboxbox").style.color = "#f1e724";
    document.getElementById('myPlatform').value = "PlayStation®"
}

function change3(){
    document.getElementById("xboxbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("playstationbox").style.backgroundColor = "rgb(61, 61, 61)";
    document.getElementById("pcbox").style.backgroundColor = "white";
    document.getElementById("pcbox").style.color = "rgb(61, 61, 61)";
    document.getElementById("playstationbox").style.color = "#f1e724";
    document.getElementById("xboxbox").style.color = "#f1e724";
    document.getElementById('myPlatform').value = "PC - Ubipost Store"
}

function poClicked(){ 
    var platform = document.getElementById('myPlatform').value;
    var format = document.getElementById('choosenFormat').value;
    var location = document.getElementById('myLocation').value;
    
    if(!location){
        alert("Please Input Location");
    } 
    else if(!format){
        alert("Please Choose Format");
    }else if(!platform){
        alert("Please Choose Platform");
    }else{
        document.getElementById("myNav").style.width = "100%";
    }
}

function closeNav() {
    document.getElementById("myNav").style.width = "0%";
}

function lastPO() {
    var username = document.getElementById('myUsername').value;
    var email = document.getElementById('myEmail').value;
    var password = document.getElementById('myPassword').value;
    var address = document.getElementById('myAddress').value;
    var quantity = document.getElementById('myQuantity').value;

    if(!username || !email || !password || !address || !quantity){
        alert("Please Fill All Form");
    }else if(checkUsername()){
        alert("Username must be at least 6 character that contains number")
    }else if(checkPassword()){
        alert("Password must be at least 8 character that contains uppercase, lowercase, and number")
    }else if(isNaN(quantity)){
        alert("Number of Copies must be a number");
    }else if(quantity < 1){
        alert("Number of Copies must be one or more");
    }else if(!document.getElementById("userAgree").checked){
        alert("Please check our Terms and Services");
    }else{
        alert("Pre Order Success!!");
        closeNav();
    }

}

function checkPassword(){
    var password = document.getElementById('myPassword').value;
    if (password.length < 8) {
        return true;
      } else if (password.search(/[a-z]/) < 0) {
        return true;
      } else if(password.search(/[A-Z]/) < 0) {
        return true;
      } else  if (password.search(/[0-9]/) < 0) {
        return true;
      } else {
          return false;
      }
}

function checkUsername(){
    var username = document.getElementById('myUsername').value;
    if (username.length < 6) {
        return true;
      } else  if (username.search(/[0-9]/) < 0) {
        return true;
      } else {
          return false;
      }
}
