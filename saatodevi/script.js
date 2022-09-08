let uName = prompt("Adınızı Giriniz: ");
const n = document.querySelector('#uName');
n.textContent = uName;

function showTime (){
    const today = new Date();
    document.getElementById('clock').innerHTML = today.toLocaleTimeString();
    setTimeout(showTime, 1000);
}

showTime()